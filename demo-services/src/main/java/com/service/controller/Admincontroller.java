package com.service.controller;

import com.service.request.AdminRequest;
import com.service.response.BaseResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Admincontroller {

	BaseResponse creatuser(AdminRequest adminRequest, HttpServletRequest request, HttpServletResponse response);

	BaseResponse getuserlist( HttpServletRequest request, HttpServletResponse response);

	BaseResponse updateList(AdminRequest adminRequest, HttpServletRequest request, HttpServletResponse response);
	
	BaseResponse deleteadmin(Integer adminId, HttpServletRequest request, HttpServletResponse response);

}
