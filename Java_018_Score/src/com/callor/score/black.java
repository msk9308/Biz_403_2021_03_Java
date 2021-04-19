package com.callor.score;

import java.util.Random;

public class black {
	public static void main(String[] args) {
		Random rnd = new Random();
		int cardnum = rnd.nextInt(51);
		int card1[] = new int[51];
		if(card1[cardnum] == cardnum) {
			System.out.println("중복");
		}System.out.println("중복아님");
		card1[cardnum] = cardnum;
		if(cardnum > 0 && cardnum < 13) {
			for(int i = 0; i < 13; i++) {
				
			}
		}

		

		
		
	}
	
		
		
	

}
