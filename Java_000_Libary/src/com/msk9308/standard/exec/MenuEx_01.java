package com.msk9308.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.msk9308.standard.MenuService;
import com.msk9308.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	
	public static void main(String[] args) {
		
		List<String> menuList = new ArrayList<String>();
		menuList.add("성적입력");
		menuList.add("성적리스트출력");
		menuList.add("성적성적저장");
		menuList.add("성적정보이메일보내기");
		menuList.add("기타여러가지");
		menuList.add("학생정보입력");
		//new MenuServiceImplV1()처럼 호출할 수 없다
		//왜: 생성자에 매개변수를 선언했기 때문에
		MenuService menuService = new MenuServiceImplV1("빛고을 고교 성적처리",menuList);
		
		Integer menu = menuService.selectMenu();
	}

}
