package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;
	
//	클래스 영역에 선언된 변수는 멤버변수라고하고
//	멤버변수는 이 클래스의 어떤 method에서든지
//	자유롭게 접근하여 저장, 읽기가 가능하다

	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		
//		method의 {}에 선언된 변수는 지역변수라고 한다
//		지역변수는 {} 벗어나면 변수가 소멸된다
//		{}이 서로 다르면 이름은 같아도 절대 접근이 불가능하다
//		멤버변수에 같은 이름의 변수가 있는데
//		지역변수에 같은 이름으로 변수를 또 선언하면
//		멤버변수는 감춰져서 접근이 불가능
		
	}

	public void inputNum() {
		while (true) {
			System.out.print("정수입력(출력:0) : ");
			Integer num = scan.nextInt();
			if (num < 50 ) {
				System.out.println("50이상의 정수이어야 합니다");
			} else if (num > 150) {
				System.out.println("150이하의 정수이어야 합니다");
			} else {
				intList.add(num);
			}
			if (num == 0) {
				System.out.println("저장된 정수를 출력합니다");
				return;
			}
		}
	}

	public void printNum() {
		System.out.print("저장된 정수 :");
		for (int i = 0; i < intList.size(); i++) {
			System.out.printf("\t%d", intList.get(i));
		}
	}
}
