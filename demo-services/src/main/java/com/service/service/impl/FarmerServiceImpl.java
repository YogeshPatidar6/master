package com.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.dao.AdminDAO;
import com.service.dao.FarmerDAO;
import com.service.request.FarmerRequest;
import com.service.service.FarmerService;
@Service
public class FarmerServiceImpl implements FarmerService{

	@Autowired
	FarmerDAO farmerDAO;
	
	@Override
	public Boolean creatfarmer(FarmerRequest farmerService) {
		return farmerDAO.addFarmeruser(farmerService);
	}

	
}
