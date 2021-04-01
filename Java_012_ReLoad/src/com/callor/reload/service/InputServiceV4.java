package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		System.out.print("정수입력1>>");
		Integer num1 = scan.nextInt();
		System.out.print("정수입력2>>");
		Integer num2 = scan.nextInt();

		NumberVO vo = new NumberVO();
		vo.setNum1(num1);
		vo.setNum2(num2);
		numList.add(vo);
	}

	public void printNum() {
		System.out.print("저장된 정수:");
//		System.out.print(vo.getNum1()+"\t");
//		System.out.print(vo.getNum2()+"\t");
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
		System.out.println(vo.getNum1() + "\t");
			System.out.println(vo.getNum2() + "\t");
//			this.printNum(vo);
		}
	}
}
