package com.service.utils;

public interface Constants {

	/*Status Code*/
	Integer STATUSCODE_199 = 199; // invalid session/user
	Integer STATUSCODE_100 = 100; // success
	Integer STATUSCODE_101 = 101; // invalid input
	Integer STATUSCODE_103 = 103; // record not found

	Integer STATUSCODE_102 = 102; // mapping invalid
	Integer STATUSCODE_104 = 104; // system failure
	Integer STATUSCODE_105 = 105; // invalid user or user dont have any company
	Integer STATUSCODE_106 = 106; // technician already assigned
	Integer STATUSCODE_107 = 107; // parent event deleted
	Integer STATUSCODE_110=110; //Role based access permission not granted
	
	Integer STATUSCODE_111=111;// app version error
	Integer STATUSCODE_112=112;// app version need forcefully update 
	
	public static final String INVALID_REQUEST = "Failure: Invalid Request";
	public static final String SUCCESS = "success";
	public static final String NORECORDFOUND = "No Record Found";
	public static final String OPERATIONAL_ERROR = "Something went wrong, Please try again";
	public static final String PLEASE_ENTER_PARAM = "Please enter parameter";
	public static final String UPDATE_SUCCESS = "Update successfully";
	public static final String DELETE_SUCCESS = "Delete successfully";

	String CREATE_USER = "createUser";

	//public static final String INVALID_REQUEST = "Failure: Invalid Request";
}
