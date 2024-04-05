package com.service.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.service.request.AdminRequest;
import com.service.response.DTO.AdminlistDTO;
import com.service.response.DTO.FarmerUserDTO;

@Component
public interface AdminService {

	Boolean addLists(AdminRequest adminRequest);

	List<AdminlistDTO> getuserlist();

	Boolean updateList(AdminRequest adminRequest);

	Boolean deleteUser(Integer userId);



}
