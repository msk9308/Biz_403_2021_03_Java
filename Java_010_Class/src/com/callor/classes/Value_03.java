package com.callor.classes;

public class Value_03 {
	
	public static void main(String[] args) {
		int num1 = getInt();
		Integer num2 = getInteger();
	}
	private static int getInt() {
		//method의 return type int형 일경우
		//아직 return 할 값이 정해지지 않으면 0을 return
		return 100;
		
	}
	private static Integer getInteger() {
		//method의 return type 이 Integer형일 경우
		//아직 return 할 값이 정해지지 않으면
		//null값을 return할 수 있다 
		return 100;
	}

}
