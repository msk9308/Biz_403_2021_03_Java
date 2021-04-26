package com.callor.score.model;

public class CardVO {
      
      private String cardShap; // 카드 모양
      private Integer scorePoint; // 점수
      private Integer dealerPoint; // 딜러 점수
      private Integer userPoint; // 유저 점수

      
      public String getCardShap() {
         return cardShap;
      }
      public void setCardShap(String cardShap) {
         this.cardShap = cardShap;
      }
      public Integer getScorePoint() {
         return scorePoint;
      }
      public void setScorePoint(Integer scorePoint) {
         this.scorePoint = scorePoint;
      }
      public Integer getDealerPoint() {
         return dealerPoint;
      }
      public void setDealerPoint(Integer dealerPoint) {
         this.dealerPoint = dealerPoint;
      }
      public Integer getUserPoint() {
         return userPoint;
      }
      public void setUserPoint(Integer userPoint) {
         this.userPoint = userPoint;
      }
      
      @Override
      public String toString() {
         return "[카드 모양=" + cardShap + ",  점수=" + scorePoint + ", dealerPoint="
               + dealerPoint + ", userPoint=" + userPoint + "]";
      }
      
      
      
      
   }