package com.msk9308.standard;

import com.msk9308.standard.impl.InputServiceImplV1;


public class Ex_01 {
	
	public static void main(String[] args) {
		
		InputServiceImplV1 isV1 = new InputServiceImplV1();
		
		isV1.inputValue("새우깡");
		isV1.inputValue("새우깡", 0);
		isV1.inputValue("새우깡", 0, 0);
	}

}
