package com.callor.word;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class kk {
   ArrayList<String> cardlist;
   ArrayList<String> cardDeck1;
   ArrayList<String> cardDeck2;
   int[] score1;
   int[] score2;
   Random rnd;

   public kk() {
      Scanner scan = new Scanner(System.in);
      cardlist = new ArrayList<String>();
      cardDeck1 = new ArrayList<String>();
      cardDeck2 = new ArrayList<String>();
      score1 = new int[10];
      score2 = new int[10];
      rnd = new Random();
   }

   
   public String card() {
      int num = rnd.nextInt(52);
      String card;
      
      for (int i = 0; i < 13; i++) {
         cardlist.add(i ,"dia" + i);
      }
      for (int i = 0; i< 13; i++) {
    	 cardlist.add(i ,"clover" + i);
      }
      for (int i = 0; i < 13; i++) {
    	  cardlist.add(i, "heart" + i);
      }
      for (int i = 0; i < 13; i++) {
    	  cardlist.add(i, )
      }
      
      
      
      
      card = cardlist.get(num);
      cardlist.remove(num);
      System.out.println(cardlist);
      System.out.println(card);
      return card;
   }

   
   public void playerDeck() {
      cardDeck1.add(this.card());
      System.out.println(cardDeck1);
      return;
   }
   
   public void cardscCheck() {
      
      
      
   }

}