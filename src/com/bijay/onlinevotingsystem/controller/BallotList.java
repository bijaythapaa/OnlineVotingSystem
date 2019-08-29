package com.bijay.onlinevotingsystem.controller;

import java.util.List;

import com.bijay.onlinevotingsystem.dao.BallotDao;
import com.bijay.onlinevotingsystem.dao.BallotDaoImpl;
import com.bijay.onlinevotingsystem.dto.Ballot;

public class BallotList {

	static BallotDao ball = new BallotDaoImpl();
	static RSA r = new RSA();

	public static List<Ballot> partyList;
	
	//public static int 

	public static void main(String[] args) {
		partyList = ball.getAllBallotInfo();

		// Iterator itr = partyList.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		for (int i = 0; i < partyList.size(); i++) {
			Ballot c = partyList.get(i);

			/*
			 * //for // System.out.println(c.getId()+" " +c.getVoterId()); //
			 * System.out.println(c.getPartyName()); //byte[] b =
			 * r.decrypt(c.getPartyName()); //System.out.println(new String(b)); //
			 * System.out.println((c.getPartyName()));
			 */
			System.out.println(c.getPartyName());
			
		}
	}
}
