package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {

		scan = new Scanner(System.in);

	}

	public void makeScores() {
		//this(현재 객체, 현재 클래스)
		//같은 클래스 내에 있는 코드 
		System.out.println("국어 점수 입력");
		//메소드의 return타입이 void가 아닌경우에는
		//메소드가 return한 값을
		//변수에 저장(받기)할 수 있다
		//이 때 변수는 method의 return type과 같은 
		//type이어야 한다
		Integer intKor = this.inputScore();
		
		System.out.println("영어 점수 입력");
		Integer intEng = this.inputScore();
		
		System.out.println("수학 점수 입력");
		Integer intMath = this.inputScore();
		
		System.out.println("=====================================");
		System.out.printf("국어점수 : %d\n", intKor);
		System.out.printf("영어점수 : %d\n", intEng);
		System.out.printf("수학점수 : %d\n", intMath);
		System.out.println("=====================================");

	}
	private Integer inputScore() {
		
		Integer score = 0;
		while (true) {
			System.out.println("점수를 입력하세요(0~100)");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("점수는 0~100까지만 입력해야 합니다");
				continue;
			}
			break;
		}
		//score 변수에 저장된 값을 호출한 곳으로 
		//되돌려 주어라 
		return score;
	}

}
