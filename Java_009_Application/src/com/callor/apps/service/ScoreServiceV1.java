package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intSum;
	float[] floatAvg;
	
	Scanner scan = new Scanner(System.in);
	
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[5];
		intMath = new int[5];
		intSum = new int[5];
		floatAvg = new float[5];

		
	}
	
	public void scoreInput() {
		
		for(int i = 0; i < intKor.length; i++) {
			int scoreCheck;
				System.out.println(i+1+".국어점수입력:");
				intKor[i] = scan.nextInt();
				scoreCheck = intKor[i];
				if(scoreCheck > 100 || scoreCheck < 0) {
					System.out.println("다시입력");
					break;
				}
				System.out.println(i+1+".영어점수입력:");
				intEng[i] = scan.nextInt();
				scoreCheck = intEng[i];
				if(scoreCheck > 100 || scoreCheck < 0) {
					System.out.println("다시입력");
					break;
				}
				System.out.println(i+1+".수학점수입력:");
				intMath[i] = scan.nextInt();
				scoreCheck = intMath[i];
				if(scoreCheck > 100 || scoreCheck < 0) {
					System.out.println("다시입력");
					break;
				}
			
		}
	}
	
	public void scoreSum() {
		
		for(int i = 0; i < intKor.length; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			floatAvg[i] = (float)intSum[i] / 3;
		}
	}
	
	public void scorePrint() {
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.print("\t국어"+intKor[i]);
			System.out.print("\t영어"+intEng[i]);
			System.out.print("\t수학"+intMath[i]);
			System.out.print("\t총점"+intSum[i]);
			System.out.printf("\t%3.2f\n ", floatAvg[i]) ;
		}
	}

}
