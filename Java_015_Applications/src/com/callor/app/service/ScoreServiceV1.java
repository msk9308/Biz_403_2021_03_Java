package com.callor.app.service;

import com.msk9308.standard.InputService;
import com.msk9308.standard.impl.InputServiceImplV1;
import java.util.Scanner;

public class ScoreServiceV1 {
	 
	Scanner scan;
	InputService isV1;
	
	public ScoreServiceV1() {
		scan = new Scanner(System.in);
		InputService isV1 = new InputServiceImplV1();
	}
	
	public void InputScore() {
		Integer intKor = isV1.inputValue("국어",0,100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		Integer intEng = isV1.inputValue("영어",0,100);
		if(intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = isV1.inputValue("수학",0,100);
		if(intMath == null) {
			System.out.println("종료");
			return;
		}
		
				
		
		
	}
	
	}

}
