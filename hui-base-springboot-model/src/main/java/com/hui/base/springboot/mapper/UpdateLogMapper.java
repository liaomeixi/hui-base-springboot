package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.UpdateLog;
import java.util.List;

public interface UpdateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UpdateLog record);

    UpdateLog selectByPrimaryKey(Long id);

    List<UpdateLog> selectAll();

    int updateByPrimaryKey(UpdateLog record);
}