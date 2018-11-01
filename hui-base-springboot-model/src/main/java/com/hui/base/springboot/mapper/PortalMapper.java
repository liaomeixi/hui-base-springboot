package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.Portal;
import java.util.List;

public interface PortalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Portal record);

    Portal selectByPrimaryKey(Integer id);

    List<Portal> selectAll();

    int updateByPrimaryKey(Portal record);
}