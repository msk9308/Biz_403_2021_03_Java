package com.callor.apps;

import com.callor.apps.service.ScoreServiceV4;

public class App_05 {
	
	public static void main(String[] args) {
		
		//ssV4 객체를선언하고 생성자를 호출하여
		//인스턴스화 하는코드
		//객체는 인스턴스가 되어야 포함된 코드(Method)를
		//호출 할 수 있다
		ScoreServiceV4 ssV4 = new ScoreServiceV4(10);
		//ssv4.makeScores() 명령이 실행되면
		//Score..V5클래스의 makeScores() method의 코드가 실행된다
		//코드가 모두 정상 종료되거나
		//아니면 중간에 return 명령문을 만나면
		//System.out.println("입력...")명령문이 이어서 실행된다
		
		ssV4.makeScores();
		
		System.out.println("입력업무 중단!!!");
		//static method
		//method에 static Keyword가 부착되면
		//객체를 생성하는 절차없이
		//method를 직접 호출 할 수 있다
		//클래스.method()
		//static method는 프로젝트가 시작됨과 동시에
		//자동으로 만들어져 어네든지 호출 할 수 있다.
		//다만 , 지금 사용하지 않더라도 항상 메모리에
		//상주하고 있기 때문에 
		//경우에 따라 불필요하게 메모리를차지하여 
		//메모리 낭비를 불러 올 수 있다
		//static method(static변수)들은
		//꼭필요한 경우에만 선언하는것이 좋다.
		System.out.println(ScoreServiceV4.dLine());
	}

}
