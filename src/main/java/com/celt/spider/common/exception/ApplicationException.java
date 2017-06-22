package com.celt.spider.common.exception;

import com.alibaba.fastjson.JSONObject;

import java.text.MessageFormat;

/**
 * 应用异常
 * 
 * @author zhouzhichao
 *
 */
public class ApplicationException extends Exception {
	private static final long serialVersionUID = 6070192332898974631L;

	private Integer errorCode;
	private String errorMessage;

	public ApplicationException(Integer errorCode) {
		this.errorCode = errorCode;

		this.errorMessage = ExceptionMessage.getErrorMessage(errorCode);
	}

	 public ApplicationException(Integer errorCode, String errorMessage) {
	 this.errorCode = errorCode;
	
	 this.errorMessage = errorMessage;
	 }

	// public ApplicationException(Integer errorCode,String msg, Object... args)
	// {
	// this.errorCode = errorCode;
	// if(StringUtils.isEmpty(msg)){
	// String errorMessage = ExceptionMessage.getErrorMessage(errorCode);
	// this.errorMessage = MessageFormat.format(errorMessage, args);
	// }else{
	// this.errorMessage =msg;
	// }
	//
	// }

	public ApplicationException(Integer errorCode, Object... args) {
		this.errorCode = errorCode;
		String errorMessage = ExceptionMessage.getErrorMessage(errorCode);
		this.errorMessage = MessageFormat.format(errorMessage, args);
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * 将异常转成JSON格式
	 * 
	 * @return JSON格式字符串
	 */
	public String toJson() {
		JSONObject object = new JSONObject();
		object.put("code", errorCode);
		object.put("msg", errorMessage);
		return object.toJSONString();
	}
}
