package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.HeadLines;
import java.util.List;

public interface HeadLinesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HeadLines record);

    HeadLines selectByPrimaryKey(Long id);

    List<HeadLines> selectAll();

    int updateByPrimaryKey(HeadLines record);
}