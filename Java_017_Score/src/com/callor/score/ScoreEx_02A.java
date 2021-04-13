package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreServiceImplV2;

public class ScoreEx_02A {
	
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceImplV2();
		sService.selectMenu();
	}

}
