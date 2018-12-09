package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.Order;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    void batchInsert(List<Order> recordLst);

    List<Order> selectByPage(@Param("offset") Long offset, @Param("limit") Long limit);
}