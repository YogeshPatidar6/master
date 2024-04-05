package com.service.response.DTO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
import com.service.view.AssetActionView;

public class FarmerUserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//@JsonView({AssetActionView.getlist.class})
	private Integer farmerId;
	
//	@JsonView({AssetActionView.getlist.class})
	private String farmername;
	
//	@JsonView({AssetActionView.getlist.class})
	private Integer contact_no;
	
//	@JsonView({AssetActionView.getlist.class})
	private String villagename;
	
//	@JsonView({AssetActionView.getlist.class})
	private Integer Agricultural_land;
	
	
	public Integer getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(Integer farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmername() {
		return farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	public Integer getContact_no() {
		return contact_no;
	}

	public void setContact_no(Integer contact_no) {
		this.contact_no = contact_no;
	}

	public String getVillagename() {
		return villagename;
	}

	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}

	public Integer getAgricultural_land() {
		return Agricultural_land;
	}

	public void setAgricultural_land(Integer agricultural_land) {
		Agricultural_land = agricultural_land;
	}

	public Boolean addLists(FarmerUserDTO farmerUserDTO) {
		// TODO Auto-generated method stub
		return null;
	}



}
