package com.bijay.onlinevotingsystem.dao;

import java.util.List;

import com.bijay.onlinevotingsystem.dto.Admin;

public interface AdminDao {

	public void saveAdminInfo(Admin admin);

	public List<Admin> getAllAdminInfo();

	public Admin getAdminInfoById(int id);

	public void deleteAdminInfo(int id);

	public void updateAdminInfo(Admin admin);

	public boolean loginValidate(String userName, String password);

}
