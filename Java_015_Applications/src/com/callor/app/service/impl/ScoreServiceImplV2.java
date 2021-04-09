package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public void inputScore() {

//		while (true) {
//			String strNum = this.inputNum();
//			for (int i = 0; i < scoreList.size(); i++) {
//				if (scoreList.get(i).equals(strNum)) {
//					System.out.println("중복된 학번 입니다");
//					continue;
//				}
//				break;
//			}
//
//		}

	}
	/*
	 * 현재 클래스 내부에서만 호출되는 method private으로 선언한다
	 * 현재 클래스를 상속받아 확장하여 사용할 수 있도록 하려면
	 * private => protected로 변경 해주는 것이 좋다
	 */

	protected String inputNum() {

		// 학번입력처리 : 001, 002 형식으로 입력받자
		// 정수 1 이상을 입력하면
		// 정수 값이 intNum에 담길것이고
		// QUIT를 입력했으면
		// null 값이 intNum에 담길것이다
		Integer intNum = inService.inputValue("학번", 1);

		// intNum에 null 값이 담겨있으면 종료하고
		// 다시 메뉴로 돌아간다
		if (intNum == null) {
			return null;
		}

		// 정수를 입력했으면 입력받은 정수값을
		// 학번의 문자열 형식(001, 002)으로 변환을 하자
		// String.format("%3d", 1)
		// 전체 자릿수를 3개로 만들고
		// 정수값을 오른쪽 정렬하는 문자열 만들기
		// " 1"
		// String.format("%03d", 1)
		// 전체 자릿수를 3개로 만들고
		// 정수값을 오른쪽 정렬하고
		// 왼쪽의 빈칸에 0을 채워라
		// "001"
		String strNum = String.format("2021%03d", intNum); // 2021001
		return strNum;

	}

}
