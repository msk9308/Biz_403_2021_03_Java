package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.msk9308.standard.InputService;

public class ScoreServiceImplV1 implements InputService {
	protected List<ScoreVO> scoreList;
	Scanner scan;
	ScoreVO scoreVO;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public Integer inputValue(String title) {
		while (true) {
			System.out.println(title + "값을 입력하세요");
			System.out.print(">>");
			String strInput = scan.nextLine();
			Integer intInput;
			if (strInput.equals("QUIT")) {
				return null;
			}

			try {
				intInput = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요");
				continue;
			}
			return intInput;
		}
	}

	@Override
	public Integer inputValue(String title, int start) {
		String title2 = String.format("%s(%d이상)", title, start);
		while (true) {
			Integer intInput = this.inputValue(title2);
			if (intInput != null) {
				if (intInput < start) {
					System.out.printf("입력값은 %d 이상이어야 합니다", start);
					continue;
				}
			}
			return intInput;
		}
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		String title2 = String.format("%s(%d~%d범위)", title, start, end);
		while (true) {
			Integer intInput = this.inputValue(title2);
		}
	}

	public void selectMenu() {
		
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("학생 성적 관리");
			System.out.println("1. 학생성적등록");
			System.out.println("2. 성적리스트 출력");
			System.out.println("QUIT.업무종료");
			System.out.println("=".repeat(50));
			System.out.println("업무선택>>");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				break;
			}
			Integer intMenu = scan.nextInt();
			if(intMenu == 1) {
				this.inputScore();
			}else if(intMenu == 2) {
				this.printScore();
			}else if(intMenu == 0) {
				System.out.println("업무종료");
				return;
				}
			}

	}

	public void inputScore() {

		Integer kor = this.inputValue("국어", 0, 100);
		if (kor == null) {
			System.out.println("종료");
			return;
		}
		Integer eng = this.inputValue("영어", 0, 100);
		if (eng == null) {
			System.out.println("종료");
			return;
		}
		Integer math = this.inputValue("수학", 0, 100);
		if (math == null) {
			System.out.println("종료");
			return;
		}
		
		scoreVO.setKor(kor);
		scoreVO.setEng(eng);
		scoreVO.setMath(math);
		scoreList.add(scoreVO);
		this.printScore(scoreVO);

	}

	public String inputName() {
		scoreVO = new ScoreVO();
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		scoreVO.setName(name);
		System.out.println("학번을 입력해주세요");
		String num = scan.nextLine();
		scoreVO.setNum(num);
		this.inputScore();
		return null;
	}

	public void printScore(ScoreVO vo) {
		
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getNum() + "\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMath() + "\t");
		

	}

}
