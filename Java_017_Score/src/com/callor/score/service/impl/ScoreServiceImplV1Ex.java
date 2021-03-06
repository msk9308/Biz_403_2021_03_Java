package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.ScoreServiceImplV1;
import com.msk9308.standard.InputService;
import com.msk9308.standard.MenuService;
import com.msk9308.standard.impl.InputServiceImplV1;
import com.msk9308.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1 {
	
	protected MenuService menuService;
	protected InputService inService;
	
	public ScoreServiceImplV1Ex() {
		inService = new InputServiceImplV1();
		/*
		 * MenuServiceImplV1 클래스의 생성자는
		 * 두개의 매개변수(아규먼트,파라메터)를 전달하면서
		 * 호출해야 한다.
		 * 첫번재 매개변수는 프로젝트의 title
		 * 두번째 매개변수는 업무리스트를 담은 List형 객체
		 * 
		 * title은 단순 문자열이기 때문에 바로 전달할 수 있는데
		 * List형 객체는 List객체를 생성하고, 데이터를 add 한 후
		 * 전달해야 하므로 약간의 추가 연산코드가 필요하다
		 * 
		 * 이럴때는 생성자 method에서 작성하지 않고
		 * 객체를 사용하는 method에서 작성하는것이 좋다 
		 */
		menuService = new MenuServiceImplV1(null,null);
	}

	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("1.학생정보등록");
		menuList.add("2.성적등록");
		menuList.add("3.성적정보열기");
		menuList.add("4.성적정보저장");
		menuList.add("5.성적정보출력");
		
		menuService = new MenuServiceImplV1(title,menuList);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				return;
			}
			/*1번코드
			 * 만약 menu 변수의 값이 1일때
			 * menu가 1일때 코드가실행되고
			 * 코드가 종료되면
			 * 또다시 menu값이 2인가, menu값이 3인가를
			 * 검사하는 불필요한 코드가 실행된다
			 */
//			if(menu == 1) { }
//			if(menu == 2) { }
//			if(menu == 3) { }
			
			/*2번코드
			 * 만약 menu 변수의 값이 1이면
			 * 		menu가 1일 때가 실행되고
			 * 		코드가 종료되면 
			 * 		else 이후의 코드는 무시하고
			 * 		바로 if 문이 종료된다
			 * 
			 * 1번코드에 비하면 약간이나마 
			 * 	효율적인 코드가 된다.
			 */
			if(menu == 1) { 
				
			}else if(menu == 2) {
				
			}else if(menu ==  3) {
				
			}else if(menu == 4) {
				
			}else if(menu == 5) {
				
			}
		}
	}
	

}
