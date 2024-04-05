package com.service.handler;

import java.util.Collection;

import com.service.response.AdmindetailResponse;
import com.service.response.BaseResponse;

public class BaseRequestHandler {

	protected String failureMessage = "FAILURE";

	protected String successMessage = "SUCCESS";

	public String getFailureMessage() {
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}

	protected BaseResponse convertAdmintoresponse(int responseCode, String message,
			String requestMapping, Object reasonCode, Collection<?> list) {
		AdmindetailResponse response = new AdmindetailResponse();
		
		if (reasonCode != null) {
			response.setResponse(reasonCode);
			response.setResponseList(null);
			response.setResponseMessage(message);
			response.setStatusCode(responseCode);
		} else if (list != null) {
			response.setResponse(null);
			response.setResponseList(list);
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		} else {
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		}
		return response;
	}
	protected BaseResponse convertAdmindeletetoresponse(int responseCode, String message,
			String requestMapping, Object reasonCode, Collection<?> list) {
		AdmindetailResponse response = new AdmindetailResponse();
		
		if (reasonCode != null) {
			response.setResponse(reasonCode);
			response.setResponseList(null);
			response.setResponseMessage(message);
			response.setStatusCode(responseCode);
		} else if (list != null) {
			response.setResponse(null);
			response.setResponseList(list);
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		} else {
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		}
		return response;
	}
	protected BaseResponse convertFarmertoresponse(int responseCode, String message,
			String requestMapping, Object reasonCode, Collection<?> list) {
		AdmindetailResponse response = new AdmindetailResponse();
		
		if (reasonCode != null) {
			response.setResponse(reasonCode);
			response.setResponseList(null);
			response.setResponseMessage(message);
			response.setStatusCode(responseCode);
		} else if (list != null) {
			response.setResponse(null);
			response.setResponseList(list);
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		} else {
			response.setStatusCode(responseCode);
			response.setResponseMessage(message);
		}
		return response;
	}
	
	
	
}
