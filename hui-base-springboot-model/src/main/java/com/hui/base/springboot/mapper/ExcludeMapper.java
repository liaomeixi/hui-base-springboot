package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.Exclude;
import java.util.List;

public interface ExcludeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Exclude record);

    Exclude selectByPrimaryKey(Long id);

    List<Exclude> selectAll();

    int updateByPrimaryKey(Exclude record);
}