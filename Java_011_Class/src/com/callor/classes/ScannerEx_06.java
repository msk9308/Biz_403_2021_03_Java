package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			Integer intNum1 = 0;
			Integer intNum2 = 0;
			
			
			System.out.println("===-=--=-==-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("숫자 2개를 입력하세요");
			System.out.println("숫자1 >>");
			String strNum1 = scan.nextLine();
			if(strNum1.endsWith("QUIT")) {
				//maing 메소드에서 return이 실행되면
				//어플레케이션을 끝내겠다라는통보
				
				return;
				
			}
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			
			
			System.out.print("숫자2>>");
			String strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			
			
			System.out.printf("%d x %d = %d\n" , intNum1, intNum2, intNum1 * intNum2);
			
		}
	}

}
