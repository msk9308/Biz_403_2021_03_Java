package com.callor.controller;
/*
 * 1~100까지 범위의 임의 정수 10개를 만들고
 * 3의 배수인지 검사하여
 * 3의 배수이면 출력하고
 * 수 들의 합을 계산하여 출력하라
 * 
 * 변수의 선언 위치
 * 
 */

import java.util.Random;

public class Controller_12 {
	
	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		int sum = 0;
		for(int i = 0; i < 10; i++ ) {
			int num = rnd.nextInt(100) + 1;
			
			if( num % 3 == 0) {
				sum += num;
				System.out.println( num + "는 3의배수" );
			}					
		}//for 명령문 안에서 선언된변수는 for명령이 끝나면 소멸됨
		System.out.println("==================");
		System.out.println("합계 : " + sum);
		
		/*
		 * scope(범위) 라고 한다.
		 * {}: 변수의 사용 범위를 제한하는 역할을 한다
		 * 작성하는 코드는 main(){ } 내에 있다
		 * 여기에서 선언된 모든 변수는
		 * main() method가 종료하면 모두 소멸된다
		 * for() {}내에 선언된 모든 변수는
		 * for() 반복문이 종료되면 모두 소멸된다
		 * 
		 * if() {}내에 선언된 모든 변수는
		 * if() 비교문이 종료되면 모두 소멸된다 
		 * 
		 * for() {}, if() {}명령이 시작되기 전에
		 * 선언된 변수들은 for(), if()명령문 내에서
		 * 사용(저장,읽기)가 가능하고 
		 * for(), if()명령이 종료되어도 그 값을 
		 * 유지하고 있다
		 * 
		 * for()반복문이 수행되는 동안에 어떤 값을
		 * 누적(합산)하거나 할 때
		 * for()반복문이 시작되기전에 변수를 반드시
		 * 선언하고, 0으로 clear 하는 것이 좋다
		 */
	}

}
