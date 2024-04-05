package com.service.controller;

import com.service.request.FarmerRequest;
import com.service.response.BaseResponse;
import com.service.response.DTO.FarmerUserDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Farmercontroller {


	BaseResponse creatfarmer(FarmerRequest farmerRequest, HttpServletRequest request, HttpServletResponse response);

}
