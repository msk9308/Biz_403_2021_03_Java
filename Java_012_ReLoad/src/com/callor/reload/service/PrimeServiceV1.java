package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	protected Random rnd;

	public PrimeServiceV1() {
		rnd = new Random();
	}

	public void primeNum() {
		int num = rnd.nextInt(50) + 51;
		System.out.println("난수:" + num);
		int i = 0;
		/*
		 * for() 반복문이 실행되거나 끝나는 경우 비교문 "i < rndNum" true인 동안 반복하라 만약 rndNum가 10이다 i == 9
		 * 일때까지 반복하라 for() 반복문이 종료되면 i값은 얼마일까? i값이 rndNum보다 작으면 { }내의 코드 실행 실행 후에 i++를
		 * 실행한다 i가 9가 되었을때 {}을 실행하고 다시한번 i++ 실행된다 때문에 for() 반복문이 중단되지 않고 모두 정상 수행이 되면
		 * i값은 rndNum값과 같아진다 i == rndNum인데 i < rndNum냐고 묻는것
		 * 
		 * 만약 for() 반복문이 중간에 break를 만났다 "i값은 항상 rndNum보다 작다"
		 */
		// num가 6이라고 가정을 하자
		// 6 % 2, 6 % 3, 6 % 4, 6 % 5
//		for (i = 2; i < num; i++) {
//			if (num % i == 0) {
//				//소수가 아닌경우
//				//num을 i값들로 나머지 연산을 했을때
//				//한번이라도 나머지가 0이면
//				//그 수는 소수가 아닌 경우이다
//				//그렇다면 그 이후에는 더이상
//				//연산을 할 필요가 없다
//				break;
//			}
//		} // for() end
//		// 여기에서 for() 반복문이 break 되었나
//		// 			소수가 안니다
//		// 아니면 모두 완료되었나??
//		//			소수이다
//		if(i < num) {
//			System.out.println(num + "는 소수가아님");
//		}else {
//			System.out.println(num + "는 소수임");
//		}
		boolean notPrime = false;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				notPrime = true;
				break;
			}
		}
		if (notPrime == true) {
			System.out.println("소수가 아님");
		} else {
			System.out.println("소수임");
		}
	}
}
