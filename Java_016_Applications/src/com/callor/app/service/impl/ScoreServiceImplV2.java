package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.msk9308.standard.InputService;
import com.msk9308.standard.MenuService;
import com.msk9308.standard.impl.InputServiceImplV1;
import com.msk9308.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService {

	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	Scanner scan;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는것이 좋다
		 * 
		 * 하지만 객체를 생성할때 전달해야할 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을경우는 객체를 사용하기 전에 객체를 생성하는 코드를
		 * 작성하여도 된다.
		 */

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트출력");
		scoreMenu.add("성적저장");

		menuService = new MenuServiceImplV1("빛고을고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("업무종료!!");
				break;
			}
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}
	}
	
	protected String inputNum() {
		Integer inputNum = inService.inputValue("학번",1);
		if(inputNum == null) {
			return null;
		}
		String strNum = String.format("2021%03d",inputNum);
		return strNum;
	}

	@Override
	public void inputScore() {
		// 학번입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고, list에 추가
		// = ScoreVO클래스를 사용하여 생성한 scoreVO 객체에 담고
		// scoreVO에 담고
		

		String strNum = this.inputNum();
		
		String strName = scan.nextLine();
		if (strName == null) {
			return;
		}

		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			return;
		}
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setName(strName);
		scoreVO.setNum(strNum);
		scoreVO.setKor(intKor);
		scoreVO.setEng(intEng);
		scoreVO.setMath(intMath);
		scoreList.add(scoreVO);

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		String fileName = "src/com/callor/app/data.txt";
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일 이름을 입력하세요");
		System.out.print(">>");
		String strFileName = scan.nextLine();
		if(strFileName.equals("")) {
			System.out.println("파일이름을 입력해야 합니다");
			return;
		}
		
	}


	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
