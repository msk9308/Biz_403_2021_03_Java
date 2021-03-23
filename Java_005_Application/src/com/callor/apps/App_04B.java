package com.callor.apps;

import java.util.Random;

public class App_04B {
	
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		//5학급 인원수를 저장할 배열
		int[] intClasses = new int[5];
		int pizzaPcs = 6;
		
		for(int i = 0; i < 5; i++) {
			
			// (0~ (?? -1)) + @@
			//@@ : 시작값을 지정하는 형태
			// 50~59중에 임의의 수를 생성
			int members = rnd.nextInt(10) + 50 ;
			intClasses[i] = members;
		}
		
		//학급별 주문수량을 계산하는 부분과
		//리스트를 출력하는 부분을 분리하자
		// 1. 계산된 주문수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력
		
		//학급별 주문수량을 계산하여 저장할 배열
		int[] intOrders = new int[5];
		
		for(int i = 0; i < 5; i++) {
			
			int order = intClasses[i] / pizzaPcs;
			//인원수 대비 피자 조각수를 비교하여
			//부족할 경우 1box를 추가하기
			if(intClasses[i] % (order * pizzaPcs) > 0) {
				order++;
			}

			intOrders[i] = order;
		}
		int intTotalOrder = 0;
		
		for(int i = 0 ; i<5; i++) {
			System.out.println((i+1) + "\t");
			System.out.println(intClasses[i] + "\t");
			System.out.println(intOrders[i] + "\t");
			System.out.println(intOrders[i] * pizzaPcs);
			intTotalOrder += intOrders[i];
		}
		System.out.println("=============================");
		System.out.printf("전체 주문 BOX 수량 : %d\n", intTotalOrder);
		System.out.println("=============================");
		
}
}
