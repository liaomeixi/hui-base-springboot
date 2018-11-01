package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.WebSite;
import java.util.List;

public interface WebSiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebSite record);

    WebSite selectByPrimaryKey(Integer id);

    List<WebSite> selectAll();

    int updateByPrimaryKey(WebSite record);
}