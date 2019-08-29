package com.bijay.onlinevotingsystem.controller;

import java.util.ArrayList;
import java.util.List;

import com.bijay.onlinevotingsystem.dao.BallotDao;
import com.bijay.onlinevotingsystem.dao.BallotDaoImpl;

public class PieChartData {
	BallotDao ball = new BallotDaoImpl();

	
	private static final List<KeyValue> pieDataList;;
	
	//pieDataList=ball.getAllBallotInfo();
	
	static {
		pieDataList = new ArrayList<PieChartData.KeyValue>();
		pieDataList.add(new KeyValue("Nepal Communist Party", "8"));
		pieDataList.add(new KeyValue("Nepali Congress", "5"));
		pieDataList.add(new KeyValue("RaPraPa Nepal", "2"));
		pieDataList.add(new KeyValue("Naya Shakti", "2"));
		pieDataList.add(new KeyValue("Rastriya Janta Party", "1"));
		pieDataList.add(new KeyValue("Madheshi Loktantric Forum", "1"));
	}

	public static List<KeyValue> getPieDataList() {
		return pieDataList;
	}

	public static class KeyValue {
		String key;
		String value;

		public KeyValue(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
