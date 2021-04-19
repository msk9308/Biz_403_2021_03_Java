package com.callor.score;

import java.util.ArrayList;
import java.util.Random;

public class a {
	ArrayList<String> cardlist;
	ArrayList<Integer> cardlist2;
	Random rnd;

	public a() {
		cardlist = new ArrayList<String>();
		cardlist2 = new ArrayList<Integer>();
		rnd = new Random();
	}

	public void card() {
		for (int i = 0; i < 13; i++) {
			cardlist.add("dia" + i);
			cardlist.add("clover" + i);
			cardlist.add("heart" + i);
			cardlist.add("spade" + i);
		}
		System.out.println(cardlist);
	}

	public void randomAdd() {
		int num = rnd.nextInt(48);
		if (cardlist2.size() == 0) {
			cardlist2.add(num);
			System.out.println(cardlist2);
		} else {

			for (int i = 0; i < cardlist2.size(); i++) {
				if (num == cardlist2.get(i)) {
					System.out.println("중복");

				} else {

					cardlist2.add(num);
					System.out.println(cardlist2);
					System.out.println("중복이 아님");
				}
			}
			// while } }
		}
	}
}
