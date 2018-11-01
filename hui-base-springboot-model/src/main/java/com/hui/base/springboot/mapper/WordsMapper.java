package com.hui.base.springboot.mapper;

import com.hui.base.springboot.model.Words;
import java.util.List;

public interface WordsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Words record);

    Words selectByPrimaryKey(Long id);

    List<Words> selectAll();

    int updateByPrimaryKey(Words record);
}