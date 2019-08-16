package com.bijay.onlinevotingsystem.dto;

import java.util.Date;

public class Voter {

	private int id;
	private String voterName;
	private String password;
	private int stateNo;
	private String districtName;
	private String gender;
	private String imgUrl;
	private String email;
	private Date dob;
	// private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVoterName() {
		return voterName;
	}

	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}

	public int getStateNo() {
		return stateNo;
	}

	public void setStateNo(int stateNo) {
		this.stateNo = stateNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
