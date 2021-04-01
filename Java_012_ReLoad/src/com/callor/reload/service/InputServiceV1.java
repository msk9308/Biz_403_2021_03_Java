package com.callor.reload.service;

/*Service 클래스
 * 어디선가 (main() method)에서 
 * 객체로 선언, 생성한 후
 * method 호출을 통해 명령을 실행하는
 * 클래스
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 {
	//정수형 데이터들을 담을 리스트형 객체
	//Integer wrapper 클래스형 데이터들을 담을 리스트
	protected List<Integer> intList;
	//"멤버변수들" : 클래스 영역에 선언된 객체들 
	//접근 제한자
	//private : 나혼자 단독으로 사용할 때
	//protected : 이 클래스를 누군가 상속하여 사용할 수 있도록 하기위해서 
	protected Scanner scan;
	//키보드 입력을 받아 코드를수행하기 위해서 선언
	
	//선언만 된 객체는 코드(method)를 호출하여
	//기능을 수행할 수 없다
	//반드시 생성(초기화)를 해 주 어야 한다
	//현재 Service 클래스의 생성자 method에서 수행을 한다 

	public InputServiceV1() {
		// TODO InputServiceV1의 생성자 method
		intList = new ArrayList<Integer>();
		scan = new Scanner(System.in);
	}
	// method의 선언문
	//클래스에 선언하는 기본 type의 method
	//{ } : 블래이드 , 코드블럭
	//코드블럭( { } )에 연산을 수행하는 코드를 작성하고
	// 그 코드들의 묶음을 inputNum라고 하겠다 라는 선언
	public void inputNum() {
		System.out.println("키보드 정수 입력");
		System.out.print("정수 입력>>");
		Integer num = scan.nextInt();
		//래퍼는 get set안씀
		//키보드로 입력받은 정수를 intList에 추가
		intList.add(num);
	}
	
	public void printNum() {
		for(int i = 0; i < intList.size(); i++) {
			Integer num = intList.get(i);
			System.out.println("정수 : " + intList.get(i));
		}
	}
}
