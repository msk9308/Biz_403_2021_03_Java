package com.callor.apps;
/*
 * 정수배열 intScores 10개 선언
 * Random 클래스로 50~100까지 정수를 들어
 * intScores에 저장
 * intScores의 점수의 총점,평균
 */

import java.util.Random;

public class App_03 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intScores = new int[10];
		int intSum = 0;
		float floatAvg = 0;

		for (int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(50) + 51;
			System.out.printf("        점수%d : %d\n", i + 1, intScores[i]);
			intSum += intScores[i];
		}
		floatAvg = (float) intSum / 10;
		System.out.println("===========================");
		System.out.printf("총점 : %d   평균: %3.2f\n", intSum, floatAvg);
		System.out.println("===========================");

	}
}
