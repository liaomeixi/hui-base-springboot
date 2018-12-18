package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.HuiTest;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuiTestMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(HuiTest record);

    int insertSelective(HuiTest record);

    HuiTest selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(HuiTest record);

    int updateByPrimaryKey(HuiTest record);

    int batchInsert(@Param("recordList") List<HuiTest> recordList);

    int batchDelete(@Param("ids") java.math.BigDecimal[] ids);

    int batchUpdate(@Param("recordList") List<HuiTest> recordList);
}