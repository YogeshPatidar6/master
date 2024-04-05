package com.service.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.service.request.AdminRequest;
import com.service.response.DTO.AdminlistDTO;
import com.service.response.DTO.FarmerUserDTO;

@Component
public interface AdminDAO  {

	Boolean addAdminuser(AdminRequest adminRequest);

	List<AdminlistDTO> addAdminuser1();
	
	Boolean updatelist(AdminRequest adminRequest);

	Boolean deleteUser(Integer userId);
}
