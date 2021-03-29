package com.callor.apps;

import com.callor.apps.model.ScoreVO;

public class ScoreEx_03 {
	
	public static void main(String[] args) {
		
		ScoreVO 홍길동 = new ScoreVO();
		
		홍길동.kor = 90;
		홍길동.eng = 80;
		홍길동.math = 99;
		
		int total = 홍길동.getTotal();
		System.out.println("홍길동 총점 : " +total);
		홍길동.total = 900;
		System.out.println("홍길동 평균 : " +홍길동.getAvg());
	}

}
