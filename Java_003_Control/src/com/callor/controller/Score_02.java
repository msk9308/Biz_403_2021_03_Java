package com.callor.controller;

public class Score_02 {

	/*
	 * 정수와 실수간의 자료 교환(변환)
	 */
	public static void main(String[] args) {
		
		int intNum = 100;
		float floatNum = 100.0F;
		
		//정수를 표현할 때 자릿수가 큰 값은
		//중간에 _넣어서 표현할 수 있다
		
		//int, Integer 로 선언된 변수에는
		//-2의 31승 ~ 2의 31승 -1까지의 값만
		//     저장 할 수 있다
		intNum = 100_000_000_0;
		
		//long, Long으로 선언된 변수에는
		//-2의 63승~ 2의 63 -1까지의 값만 저장
		long longNum = 100_000_000_000_000_000_0L;
		
		//333 정수를 실수표현 3.33 * 10^2
		//333_333_333_333_333
		//3.33_333_333_333_333 * 10^14
		
		int intNum1 = 100;
		float floatNum1 = 100.0F;
		
		
		floatNum1 = intNum1;
		
		//정수 값 100을 실수형(float)변수에 저장하라
		//100을 1*10^2으로 변환하여 저장
		floatNum1 = 100;
		
		//double 실수값 100.0을 float 실수형 변수에 저장하라
		//오류를 막기위해서 숫자 끝에(F,f)를 첨가한다
		floatNum1= 100.0f;
		
		//intNum1에 저장된 정수를
		//"실수형으로 변환"하여 "오차를 무시"하고 저장하라
		floatNum1 = intNum1;
		
		//실수값(float)을 정수형 변수에 저장하라 라고 명령을 내리면
		//자바 컴파일러는 이 코드를 실행하면 실수값이
		//소수점 이하가 잘릴것이다 라는것을 안다
		//또한, 이코드는 분명 개발자가 실수한 것이다 
		//라고 생각하고, 문법오류로 보여준다
		
		//개발자가 실제 값의 소수점이하가 잘리는 것을
		//알고있으며 소수점이하값이 필요없어서 
		//정수형 변수에 저장하고 싶다
		//이럴때는 컴파일러에게 강제로 
		//알려준다 (int)
		

		/*
		 * 강제형변환
		 * 명시적형변환
		 * 
		 * 실수값 , 실수형변수에 저장된 값을
		 * 정수형변수에 저장하려고 시도하면
		 * 컴파이러는 이 코는 문제를 일으킬수 없다는 것을
		 * 인식하고,오류를 보여준다.
		 * 
		 * 만약 개발자가 (작성자가) 오차를 무시하고
		 * 강제로 실수값으 정수형에 변환하여 저장하고자
		 * 한다면 "강제로 변환하는 "코드를 첨가하면된다
		 * 
		 * 실수값,실수형변수에 저장된값을
		 * 소수점이 값을 무조건 잘라버리고 정수부분만 변수에 저장한다
		 */
	
		intNum1 = (int) 1.0F;
		intNum1 = (int)floatNum1;
		
		/*
		 * 자동형변환(정수형=>실수형)
		 * 암시적,묵시적 형변환
		 * 
		 * 정수값 , 정수형변수에 저장된 값을
		 * 실수 (float, double)형 변수에 저장하려고 할때
		 * 정수값,0형식으로 실수로 자동으로 변환한 다음 
		 * 저장을한다
		 * 매우 큰값은 오차가 발생할수 있지만
		 * 일반적으로 사용하는 숫자는 오차없이
		 * 실수형 변수에 저장이 가능하다
		 */
		
		float Num1 = intNum1;
	}
}