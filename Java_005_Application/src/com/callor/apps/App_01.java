package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intMembers = 0;
		int dev = 0;
		/*
		 * 25~50명 인원있는 각 반에 pizza 간식을 지급하려고 한다.
		 * 각 반의 학생들에 1조각씩 pizza를 지급하려고 한다
		 * 학생수보다 부족하거나 6조각 이상 남지 않도록 pizza를 주문해야 한다
		 * 몇 box의 pizza를 주문해야 하는지 코드로 구현하시오
		 */
		//nextInt(10) 0~9까지
		intMembers = rnd.nextInt(25) + 26;// rnd.nextInt(); 그냥하게되면 -2**31 ~ 2**31 -1중의 수가나옴
		System.out.printf("학생 : %d명\n" , intMembers);
		
		if (intMembers % 6 == 0) {
			dev = intMembers / 6;
		} else {
			dev = intMembers / 6 + 1;
		}
		System.out.printf("피자 :  %d판\n" , dev);
		System.out.printf("피자조각 : %d개\n" , dev * 6);
		System.out.printf("피자-1판 : %d개\n" , dev * 6 - 6);

	}
}
