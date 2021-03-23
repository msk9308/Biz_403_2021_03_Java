package com.callor.apps;

public class Pay_04 {
	
	public static void main(String[] args) {
		
		int nPay = 3_723_560;
		int nPaper = 5_0000;
		
		int sw = 1;
		for( ;; ) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d 원권 %5d매" , nPaper , nCount);
			nPay %= nPaper;
			//nPaper 2 또는 5로 나누기
			if(nPay < 0) {
				break;
			}else {
				nPaper /= 2;
			}
			sw *= (-1);
		}
	}

}
