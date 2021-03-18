package com.callor.var;

public class Varriable_01 {
	public static void main(String[] args) {
		int num1 =0;
		int num2 =0;
				
		num1 = 33;
		num2 = 55;
		
		System.out.println("33 + 55 =" + (num1 + num2));
		System.out.println("55 - 33 =" + (num2 - num1));
		System.out.println("33 * 55 =" + (num1 * num2));
		System.out.println("55 / 33 =" + (num2 / num1));
		
		int sum = num1 + num2;
		int minus = num2 - num1;
		int times = num1 * num2;
		int div = num2 / num1;
		System.out.printf("%d + %d = %d " , num1 , num2 , sum);
		System.out.println();
		System.out.printf("%d - %d = %d " , num1 , num2 , minus);
		System.out.println();
		System.out.printf("%d * %d = %d " , num1 , num2 , times);
		System.out.println();
		System.out.printf("%d / %d = %d " , num1 , num2 , div);
		
		
	}

}
