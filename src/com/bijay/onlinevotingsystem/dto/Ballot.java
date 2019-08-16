package com.bijay.onlinevotingsystem.dto;

public class Ballot {

	private int id;
	private int voterId;
	private byte[] partyName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public byte[] getPartyName() {
		return partyName;
	}

	public void setPartyName(byte[] castedVote) {
		this.partyName = castedVote;
	}
}