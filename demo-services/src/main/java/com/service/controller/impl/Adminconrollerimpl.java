package com.service.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.service.controller.Admincontroller;
import com.service.handler.AdminHandler;
import com.service.request.AdminRequest;
import com.service.response.BaseResponse;
import com.service.view.AssetActionView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/farmer/access")
@Api(value = "Creat Admin data Api")
public class Adminconrollerimpl implements Admincontroller {

	@Autowired
	AdminHandler adminHandler;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = { "/creatadmin" }, method = RequestMethod.POST)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = BaseResponse.class),
			@ApiResponse(code = 500, message = "Failed", response = BaseResponse.class) })
	public BaseResponse creatuser(
			@RequestBody @ApiParam(value = "adminNotesRequest", required = true) AdminRequest adminRequest,
			HttpServletRequest request, HttpServletResponse response){

		return adminHandler.creatuser(adminRequest);
}

	@JsonView(AssetActionView.getuserlist.class)
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = { "/creatfarmer" }, method = RequestMethod.GET)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = BaseResponse.class),
			@ApiResponse(code = 500, message = "Failed") })
	public BaseResponse getuserlist(HttpServletRequest request, HttpServletResponse response) {

		return adminHandler.getuserlist();

	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = { "/updateList" }, method = RequestMethod.PUT)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = BaseResponse.class),
			@ApiResponse(code = 500, message = "Failed") })
	public BaseResponse updateList(
			@RequestBody @ApiParam(value = "updatelist", required = true) AdminRequest adminRequest,
			HttpServletRequest request, HttpServletResponse response) {

		return adminHandler.updateList(adminRequest);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/deleteadmin", method = RequestMethod.DELETE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = BaseResponse.class),
			@ApiResponse(code = 500, message = "Failed") })
	public BaseResponse deleteadmin(@RequestParam(value = "adminId", required = true) Integer adminId,
			HttpServletRequest request, HttpServletResponse response) {

		return adminHandler.deleteUser(adminId);
	}

}
