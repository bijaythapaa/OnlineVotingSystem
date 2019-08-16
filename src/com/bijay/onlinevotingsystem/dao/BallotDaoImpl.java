package com.bijay.onlinevotingsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bijay.onlinevotingsystem.dto.Ballot;
import com.bijay.onlinevotingsystem.util.DbUtil;

public class BallotDaoImpl implements BallotDao {

	PreparedStatement ps = null;

	@Override
	public void saveBallotInfo(Ballot ballot) {
		String sql = "insert into ballot_table(voter_id, party_name) values(?,?)";
		try {
			ps = DbUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, ballot.getVoterId());
			ps.setBytes(2, ballot.getPartyName());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Ballot> getAllBallotInfo() {

		List<Ballot> ballotList = new ArrayList<>();
		String sql = "select * from ballot_table";
		try {
			ps=DbUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ballot ballot = new Ballot();
				ballot.setId(rs.getInt("id"));
				ballot.setVoterId(rs.getInt("voter_id"));
				//ballot.setPartyName(rs.getString("party_name"));
				ballot.setPartyName(rs.getBytes("party_name"));
				ballotList.add(ballot);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ballotList;
	}
}
