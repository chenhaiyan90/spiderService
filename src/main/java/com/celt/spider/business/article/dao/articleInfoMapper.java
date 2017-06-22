package com.celt.spider.business.article.dao;

import com.celt.spider.business.article.model.articleInfo;

public interface articleInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(articleInfo record);

    int insertSelective(articleInfo record);

    articleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(articleInfo record);

    int updateByPrimaryKeyWithBLOBs(articleInfo record);

    int updateByPrimaryKey(articleInfo record);
}