package com.service.request;

import java.io.Serializable;

public class FarmerRequest  implements Serializable{
	
	

	private Integer farmerId;
	private String name;
	private Integer contact_no;
	private String Address;
	private String villagename;
	private String Agricultural_land;
	public Integer getFarmerId() {
		return farmerId;
	}
	public String getName() {
		return name;
	}
	public Integer getContact_no() {
		return contact_no;
	}
	public String getAddress() {
		return Address;
	}
	public String getVillagename() {
		return villagename;
	}
	public String getAgricultural_land() {
		return Agricultural_land;
	}
	public void setFarmerId(Integer farmerId) {
		this.farmerId = farmerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContact_no(Integer contact_no) {
		this.contact_no = contact_no;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setVillagename(String villagename) {
		this.villagename = villagename;
	}
	public void setAgricultural_land(String agricultural_land) {
		Agricultural_land = agricultural_land;
	}
	

	
	
}
