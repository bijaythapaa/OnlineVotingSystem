package com.bijay.onlinevotingsystem.dao;

import java.util.List;

import com.bijay.onlinevotingsystem.dto.Ballot;

public interface BallotDao {
	
	public void saveBallotInfo(Ballot ballot);
	
	public List<Ballot> getAllBallotInfo();
	
}
