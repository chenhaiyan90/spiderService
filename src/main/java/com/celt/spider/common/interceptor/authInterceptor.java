package com.celt.spider.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 00013810 on 2017/6/20.
 */
public class authInterceptor implements HandlerInterceptor {
    protected static Logger logger = LoggerFactory
            .getLogger(authInterceptor.class);

    @Value("${authKey}")
    private String authKey;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpServletRequest req =  request;

        String key = req.getParameter("key");
        logger.info(String.format("request ip ={0}", request.getHeader("X-Forwarded-For")));
        if(authKey.equalsIgnoreCase(key)){
            return true;
        }else {
            logger.info(String.format("error key:{0},right key is{1}", key,authKey));

        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
