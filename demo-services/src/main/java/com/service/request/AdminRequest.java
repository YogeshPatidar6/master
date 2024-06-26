package com.service.request;

import java.io.Serializable;

public class AdminRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer adminId;
	private String name;
	private String profile;
	private Integer Contact_no;
	private String Address;
	private String companyName;
	private String experience;

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Integer getContact_no() {
		return Contact_no;
	}

	public void setContact_no(Integer contact_no) {
		Contact_no = contact_no;
	}

	

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

}
