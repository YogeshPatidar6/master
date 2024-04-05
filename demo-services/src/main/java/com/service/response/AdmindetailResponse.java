package com.service.response;

import java.io.Serializable;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonView;
import com.service.view.AssetActionView;

public class AdmindetailResponse extends BaseResponse implements Serializable{

	private static final long serialVersionUID = 1L;

//	@JsonView({ AssetActionView.setPointConfigurationView.class,AssetActionView.actionListView.class})

	private Object response;

	@JsonView(AssetActionView.getuserlist.class)
	private Collection<?> responseList;

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public Collection<?> getResponseList() {
		return responseList;
	}

	public void setResponseList(Collection<?> responseList) {
		this.responseList = responseList;
	}

}
