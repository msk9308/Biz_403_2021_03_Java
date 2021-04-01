package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNums() {
		System.out.print("첫번째 정수를 입력하세요>>");
		NumberVO vo = new NumberVO();
//		int num1 = scan.nextInt();
//		vo.setNum1(num1);
//		numList.add(vo);
//		int num2;
//			while(true) {
//				System.out.print("두번재 정수를 입력하세요>>");
//				num2 = scan.nextInt();
//				if(num2 < num1) {
//					vo.setNum2(num2);
//					numList.add(vo);
//					return;
//				}else {
//					System.out.println("첫번째 입력한 수보다 작아야합니다");
//				}
//			}

		String strNum1 = scan.nextLine();

		Integer intNum1 = 0;
		try {
			intNum1 = Integer.valueOf(strNum1);
		} catch (Exception e) {
			System.out.println("숫자로만입력");
			// TODO: handle exception
		}
		System.out.println("두번째 정수를 입력하세요>>");
		String strNum2 = scan.nextLine();

		Integer intNum2 = 0;
		try {
			intNum1 = Integer.valueOf(strNum1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자로만입력");
		}

		if (intNum1 < intNum2) {
			System.out.println(intNum1 + "보다 작은값으로 입력");
		}
		NumberVO numberVO = new NumberVO();
		numberVO.setNum1(intNum1);
		numberVO.setNum2(intNum2);
		numList.add(numberVO);
	}

	public void printNum() {
		System.out.println("저장된 정수 : ");
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
//			this.printNum(vo);
			System.out.println(vo.getNum1());
			System.out.println("-");
			System.out.println(vo.getNum2());
			
			System.out.println("=");
			System.out.println(vo.getNum1()-vo.getNum2());
		}
	}

}
