package com.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.dao.AdminDAO;
import com.service.request.AdminRequest;
import com.service.response.DTO.AdminlistDTO;
import com.service.response.DTO.FarmerUserDTO;
import com.service.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDAO adminDAO;

	@Override
	public Boolean addLists(AdminRequest adminRequest) {
		return adminDAO.addAdminuser(adminRequest);
	}

	@Override
	public List<AdminlistDTO> getuserlist() {
		return adminDAO.addAdminuser1();

		}

	@Override
	public Boolean updateList(AdminRequest adminRequest) {
		return adminDAO.updatelist(adminRequest);
	}

	@Override
	public Boolean deleteUser(Integer adminId) {
		return adminDAO.deleteUser(adminId);
	}	
	
	
}
