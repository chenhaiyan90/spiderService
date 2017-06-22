package com.celt.spider.common.web.controller;

import com.alibaba.fastjson.JSON;

import com.celt.spider.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.net.URLDecoder;

public class BasicController {
	protected static Logger logger = LoggerFactory
			.getLogger(BasicController.class);

	/**
	 * 
	 * @author haiyan
	 * @param
	 * @param t
	 * @return
	 * @return
	 * @throws IOException
	 */
	protected Serializable getRequestParaVo(HttpServletRequest request,
			Serializable t) throws Exception {

		String method = request.getMethod();
		boolean isGet = "GET".equalsIgnoreCase(method);
		boolean isPost = "POST".equalsIgnoreCase(method);

		String jsonStr = null;
		if (isGet) {
			jsonStr = JsonUtil.object2Json(request.getParameterMap());
			BeanWrapper beanWrapper = new BeanWrapperImpl(t);
			beanWrapper.setPropertyValues(request.getParameterMap());
			return t;
		} else if (isPost) {
			BufferedReader reader = request.getReader();
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();
			while (line != null) {
				sb.append(line + "\n");
				line = reader.readLine();
			}
			reader.close();
			jsonStr = sb.toString();
			jsonStr = URLDecoder.decode(jsonStr, "UTF-8");
			logger.info(method + " jsonStr:\t" + jsonStr);
		}
		if (StringUtils.isEmpty(jsonStr)) {
			return null;
		}
		//ObjectMapper mapper = JsonUtil.createObjectJsonMapper();
		//return mapper.readValue(jsonStr, t.getClass());
		return JSON.parseObject(jsonStr, t.getClass());
	}
}
