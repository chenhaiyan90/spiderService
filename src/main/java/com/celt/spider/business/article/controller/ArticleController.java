package com.celt.spider.business.article.controller;

import com.celt.spider.common.interceptor.authInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 2017/6/20.
 */
@RestController
@RequestMapping("articleService")
public class ArticleController {
    @Value("${authKey}")
    private static String authKey;
    protected static Logger logger = LoggerFactory
            .getLogger(ArticleController.class);
    public Boolean testKey(){
        logger.info("key="+authKey);
        if("".equalsIgnoreCase(authKey)){
            return true;
        }else return false;
    }


}
