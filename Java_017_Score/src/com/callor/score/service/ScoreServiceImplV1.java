package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.msk9308.standard.InputService;
import com.msk9308.standard.MenuService;
import com.msk9308.standard.impl.InputServiceImplV1;
import com.msk9308.standard.impl.MenuServiceImplV1;


public class ScoreServiceImplV1 implements ScoreService {
	
	protected MenuService menuService;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
	Scanner scan;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();
	}

	@Override
	public void selectMenu() {
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("1.학생정보 등록");
		scoreMenu.add("2.성적등록");//inputScore
		scoreMenu.add("3.성적정보 열기");//readScore
		scoreMenu.add("4.성적정보 저장");//saveScore
		scoreMenu.add("5.성적정보 출력");//prinScore
		
		menuService = new MenuServiceImplV1("빛고을고교 성적처리",scoreMenu);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if( menu == null) {
				System.out.println("업무종료!");
				break;
			}
			if(menu == 1) {
				this.inputNum();
			}else if(menu == 2) {
				this.inputScore();
			}else if(menu == 3) {
				this.readScore();
			}else if(menu == 4) {
				this.saveScore();
			}else if(menu == 5) {
				this.printScore();
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
	public String inputNum() {
		return null;
	}

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		return null;
	}

}
