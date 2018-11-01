package com.hui.base.springboot.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b><code>SpringBootApplication</code></b>
 * <p/>
 * Description:
 * <p/>
 * <b>Creation Time:</b> 2018/9/30 16:51.
 *
 * @author huweihui
 */
@SpringBootApplication(scanBasePackages = "com.hui.base.springboot")
@EnableSwagger2
@MapperScan("com.hui.base.springboot.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
