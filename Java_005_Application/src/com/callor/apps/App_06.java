package com.callor.apps;

public class App_06 {
	
	public static void main(String[] args) {
		int money = 3723560;
		int money50000 = 0;
		int money10000 = 0;
		int money5000 = 0;
		int money1000 = 0;
		int money500 = 0;
		int money100 = 0;
		int money50 = 0;
		int money10 = 0;
		int money5 = 0;
		int money1 = 0;
		System.out.println("============================================================");
		System.out.printf("급여수령액 : %d\n" , money);
		System.out.println("============================================================");
		
		
		for(int i=0; i < 100 ; i++) {
			
			if(money >= 50000) {
				money -= 50000;
				money50000 += 1;
			}else if(money >= 10000) {
				money -= 10000;
				money10000 += 1;
			}else if(money >= 5000) {
				money -= 5000;
				money5000 += 1;
			}else if(money >= 1000) {
				money -= 1000;
				money1000 += 1;
			}else if(money >= 500) {
				money -= 500;
				money500 += 1;
			}else if(money >= 100) {
				money -= 100;
				money100 += 1;
			}else if(money >= 50) {
				money -= 50;
				money50 += 1;
			}else if(money >= 10) {
				money -= 10;
				money10 += 1;
			}else if(money >= 5) {
				money -= 5;
				money5 += 1;
			}else if(money >= 1) {
				money -= 1;
				money1 += 1;
			}
			
			
		}
		
		System.out.printf("50000원권 %d\n" , money50000);
		System.out.printf("10000원권 %d\n" , money10000);
		System.out.printf("5000원권 %d\n" , money5000);
		System.out.printf("1000원권 %d\n" , money1000);
		System.out.printf("500원권 %d\n" , money500);
		System.out.printf("100원권 %d\n" , money100);
		System.out.printf("50원권 %d\n" , money50);
		System.out.printf("10원권 %d\n" , money10);
		System.out.printf("5원권 %d\n" , money5);
		System.out.printf("1원권 %d\n" , money1);
		
		
	}

}
