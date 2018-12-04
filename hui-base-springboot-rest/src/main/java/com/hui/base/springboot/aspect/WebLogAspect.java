package com.hui.base.springboot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <b><code>WebLogAspect</code></b>
 * <p/>
 * Description: 日志收集拦截器
 * <p/>
 * <b>Creation Time:</b> 2018/12/4 22:14.
 *
 * @author HuWeihui
 */
@Component
@Aspect
@Order(value = 1)
@Slf4j
public class WebLogAspect {

    /**
     * 定义controller层切面.
     *
     * @author HuWeihui
     * @since hui_project v1
     */
    @Pointcut(value = "execution(public * com.hui.base.springboot.controller..*.*(..))")
    public void webControllerLog(){}

    /**
     * 定义service层切面.
     *
     * @author HuWeihui
     * @since hui_project v1
     */
    @Pointcut(value = "execution(public * com.hui.base.springboot.server.service..*.*(..))")
    public void webServiceErrorLog(){}


    /**
     * 前置通知 记录controller调用的日志.
     *
     * @param joinPoint the join point
     * @author HuWeihui
     * @since hui_project v1
     */
    @Before(value = "webControllerLog()")
    public void controllerBefore(JoinPoint joinPoint){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        log.info("-------------------Request Content-------------------");
        log.info("[Request IP] : {}",request.getRemoteAddr());
        log.info("[Request URL] : {} ",request.getRequestURL());
        log.info("[Request Method] : {}", request.getMethod());
        log.info("[Class Method] : {}",joinPoint.getSignature());
        log.info("[Class Args] : {}",joinPoint.getArgs());
        log.info("-------------------Request Content-------------------");
    }


    /**
     * 异常通知 记录service抛异常的信息.
     *
     * @param joinPoint the join point
     * @param error     the error
     * @author HuWeihui
     * @since hui_project v1
     */
    @AfterThrowing(value = "webServiceErrorLog()",throwing = "error")
    public void serviceAfterThrowing(JoinPoint joinPoint,Throwable error){
        log.error("-------------------Service Throwable Content-------------------");
        log.error("[Service Throwable Class] : {}",error.getClass().getName());
        log.error("[Service Throwable Msg] : {}",error.getMessage());
        log.error("[Service Throwable Method] : {}->{}()",joinPoint.getTarget().getClass().getName(),joinPoint.getSignature().getName());
        log.error("[Service Throwable Method Args] : {}",joinPoint.getArgs());
        log.error("-------------------Service Throwable Content-------------------");
    }

    /**
     * 异常通知 记录controller抛异常的信息.
     *
     * @param joinPoint the join point
     * @param error     the error
     * @author HuWeihui
     * @since hui_project v1
     */
    @AfterThrowing(value = "webControllerLog()",throwing = "error")
    public void controllerAfterThrowing(JoinPoint joinPoint,Throwable error){
        log.error("-------------------Controller Throwable Content-------------------");
        log.error("[Controller Throwable Class] : {}",error.getClass().getName());
        log.error("[Controller Throwable Msg] : {}",error.getMessage());
        log.error("[Controller Throwable Method] : {}->{}()",joinPoint.getTarget().getClass().getName(),joinPoint.getSignature().getName());
        log.error("[Controller Throwable Method Args] : {}",joinPoint.getArgs());
        log.error("-------------------Controller Throwable Content-------------------");
    }


}
