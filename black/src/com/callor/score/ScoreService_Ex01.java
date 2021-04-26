package com.callor.score;

import java.util.ArrayList;
import java.util.Random;

import com.callor.score.model.CardVO;

public class ScoreService_Ex01 {
	ArrayList<String> cardlist;
	ArrayList<CardVO> cardlist2;
	Random rnd;

	public ScoreService_Ex01() {
		cardlist = new ArrayList<String>();
		cardlist2 = new ArrayList<CardVO>();

		rnd = new Random();

	}

	public void cardDeck() {

		String pattern[] = { "heart", "spade", "clover", "dia" };
		String cardnum[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardlist.add(pattern[i] + ":" + cardnum[j]);
			}
		}
	}

	   public void cardAdd() {

		      String card;
		      Integer cardscore;
		      int num = rnd.nextInt(cardlist.size());
		      card = cardlist.get(num);
		      cardlist.remove(num);
		      String cardp[] = card.split(":");
		      if (cardp[1].equals("A")) {
		         cardscore = 1;
		      } else if (cardp[1].equals("J")) {
		         cardscore = 10;
		      } else if (cardp[1].equals("Q")) {
		         cardscore = 10;
		      } else if (cardp[1].equals("K")) {
		         cardscore = 10;
		      } else {
		         cardscore = Integer.valueOf(cardp[1]);
		      }
		      CardVO cardVO = new CardVO();
		      cardVO.setCardShap(card);
		      cardVO.setScorePoint(cardscore);
		      cardlist2.add(cardVO);
		   }

		public void player3() {
			CardVO cardVO = new CardVO();
			int num = 0;
			System.out.println("플레이어 첫번째 카드");
			cardAdd();
			cardVO.getScorePoint();
			System.out.println("-".repeat(50));
			System.out.println("플레이어 두번째 카드");
			cardAdd();
			cardVO.getScorePoint();
			System.out.println("-".repeat(50));
//			System.out.println(cardVO.getScorePoint());
			System.out.println("두 카드 합은 : " + num);
			System.out.println(cardlist2);
//			this.player2();
		}


//
//	public void player2() {
//		CardVO cardVO = new CardVO();
//		int num = 0;
//		System.out.println("플레이어 첫번째 카드");
//		cardAdd();
//		num += cardVO.getScorePoint();
//		System.out.println("-".repeat(50));
//		System.out.println("플레이어 두번째 카드");
//		cardAdd();
//		num += cardVO.getScorePoint();
//		System.out.println("-".repeat(50));
//		System.out.println("두 카드 합은 : " + num);
//		System.out.println(cardlist2);
//
//	}

}