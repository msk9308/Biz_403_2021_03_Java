package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class Score_01 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.scoreInput();
		ssV1.scoreSum();
		ssV1.scorePrint();
	}

}
