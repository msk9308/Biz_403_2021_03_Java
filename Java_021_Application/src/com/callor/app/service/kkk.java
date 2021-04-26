package com.callor.app.service;

import java.util.ArrayList;
import java.util.Random;

import com.callor.score.model.CardVO;

public class kkk {
	ArrayList<String> cardlist;
	ArrayList<CardVO> cardlist2;
	Random rnd;

	public ScoreServiceEx_01() {
      cardlist = new ArrayList<String>();
      cardlist2 = new ArrayList<CardVO>();
      rnd = new Random();
      
   }

	public void cardDeck() {

		String pattern[] = { "heart", "spade", "clover", "dia" };
		String cardNum[] = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 14; j++) {
				cardlist.add(pattern[i] + ":" + cardNum[j]);
			}
		}
		this.cardCheck();
	}

	public void cardCheck() {
		int num = rnd.nextInt(52);
		String card;
		Integer cardscore;
		card = cardlist.get(num);
		cardlist.remove(num);
		String cardP[] = card.split(":");
		if (cardP[1].equals("A")) {
			cardscore = 1;
		} else if (cardP[1].equals("J")) {
			cardscore = 10;
		} else if (cardP[1].equals("Q")) {
			cardscore = 10;
		} else if (cardP[1].equals("K")) {
			cardscore = 10;
		} else {
			cardscore = Integer.valueOf(cardP[1]);
		}
		CardVO cardVO = new CardVO();
		cardVO.setCardShap(card);
		cardVO.setScorePoint(cardscore);
		cardlist2.add(cardVO);
	}
	
	
	
}