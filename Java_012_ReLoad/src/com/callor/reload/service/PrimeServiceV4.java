package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;

	public PrimeServiceV4() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}

	public void primeNum() {
		
		int i = 0;
		for (int j = 0; j < 50; j++) {
			Integer num = rnd.nextInt(50) + 51;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (!(i < num)) { //이조건이 아니면
				intList.add(num);
			}
		}
	}

	public void printPrimeNum() {
		System.out.println("==========================================================================================");
		for (int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			System.out.printf("소수:%d\t" , intList.get(i));
		}
		System.out.println();
		for (Integer prime : intList) {
			System.out.printf("소수:%d\t" , prime);
			//배열 , list 구조의 데이터들을
			//전체를 반복하여 처리할경우
			//위의 2줄의 명령문을 한번에 실행하는 효과
		}
		System.out.println();
		System.out.println("==========================================================================================");
	}

}
