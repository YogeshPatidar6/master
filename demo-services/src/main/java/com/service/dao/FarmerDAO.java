package com.service.dao;

import org.springframework.stereotype.Component;

import com.service.request.FarmerRequest;
import com.service.service.FarmerService;

@Component
public interface FarmerDAO {


	Boolean addFarmeruser(FarmerRequest farmerRequest);

}
