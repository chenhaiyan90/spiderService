package com.celt.spider.business.article.dao;

import com.celt.spider.business.article.model.article;

public interface articleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(article record);

    int insertSelective(article record);

    article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(article record);

    int updateByPrimaryKeyWithBLOBs(article record);

    int updateByPrimaryKey(article record);
}