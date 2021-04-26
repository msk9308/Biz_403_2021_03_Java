package com.callor.app.model;

public class DeckVO {
	
	private String suit;
	private String denomiation;
	private Integer value = 0;
	/*
	 * 기본생성 : 매개변수가 없는 생성자
	 * super constureuctor
	 * new DacekVO0(값...)처럼 호출
	 * 만약 ㅋ ㅡㄹ래스를 정의하고 아무런 생성자를 만들지 않으면기본생성자는 자동으로 만들어져'
	 * 언제든지 ㅠ객체를 생성할 때 호출할 수 있다
	 * 하지만,매개변수가 (한개라도-
	 */
	public DeckVO() {
		// TODO Auto-generated constructor stub
	}
	public DeckVO(String suit, String denomiation, Integer value) {
		super();
		this.suit = suit;
		this.denomiation = denomiation;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomiation() {
		return denomiation;
	}
	public void setDenomiation(String denomiation) {
		this.denomiation = denomiation;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}

}
