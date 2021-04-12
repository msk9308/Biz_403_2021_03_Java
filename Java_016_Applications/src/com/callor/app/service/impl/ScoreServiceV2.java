package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService{
	
	protected Scanner scan;
	
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("=======================================");
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=======================================");
			System.out.println("1.성적입력");
			System.out.println("2.성적리스트 출력");
			System.out.println("3.성적 저장");
			System.out.println("QUIT 종료");
			System.out.println("---------------------------------------");
			System.out.print("업무선택>>");
			Integer inputInt = null;
			String inputStr = scan.nextLine();
			
			if(inputStr.equals("QUIT")) {
				return;
			}
			try {
				inputInt = Integer.valueOf(inputStr);
				if(inputInt == 1) {
					this.inputScore();
				}else if(inputInt == 2) {
					this.printScore();
				}else if(inputInt == 3) {
					this.saveScore();
				}
			} catch (NumberFormatException e) {
				continue;
			}
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
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
