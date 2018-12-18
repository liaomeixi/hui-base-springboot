package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.Product;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    int deleteByPrimaryKey(String productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int batchInsert(@Param("recordList") List<Product> recordList);

    int batchDelete(@Param("ids") String[] ids);

    int batchUpdate(@Param("recordList") List<Product> recordList);
}