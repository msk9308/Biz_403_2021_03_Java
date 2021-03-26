package com.callor.apps.service;

public class TimeServiceV1 {

	int[] gugudan;
	int num = 2;
	int time;
	int i;

	public TimeServiceV1() {

		gugudan = new int[8];

	}

	public void timeGugudan() {

		for (i = 0; i < gugudan.length; i++) {
			gugudan[i] = num * (i + 2);

		}

	}

	public void timePrint() {
		System.out.println("===========================");
		System.out.println("2단");
		System.out.println("===========================");
		for (int i = 0; i < gugudan.length; i++) {
			System.out.printf("%d x %d = %d\n", num, i + 2, gugudan[i]);
		}
	}

}
