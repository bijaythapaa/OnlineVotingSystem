package com.bijay.onlinevotingsystem.dao;

import java.util.List;

import com.bijay.onlinevotingsystem.dto.Voter;

public interface VoterDao {
	
	public void saveVoterInfo(Voter voter);
	
	public List<Voter> getAllVoterInfo();
	
	public void updateVoterInfo(Voter voter);
	
	public void deleteVoterInfo(int id);
	
	public boolean loginValidate(String userName, String password, String email);
	
}
