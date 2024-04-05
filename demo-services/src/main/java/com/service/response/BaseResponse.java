package com.service.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
import com.service.view.BaseView;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonView(BaseView.class)
	private Integer statusCode;
	
	@JsonView(BaseView.class)
	private String responseMessage;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
