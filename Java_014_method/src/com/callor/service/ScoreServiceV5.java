package com.callor.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {
	
	protected InputServiceV2 inService;
	protected String[] subject;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;
	
	
	public ScoreServiceV5() {
		subject = new String[] {"국어","영어","수학"};
 		inService = new InputServiceV2();
 		kors = new ArrayList<Integer>();
 		engs = new ArrayList<Integer>();
 		maths = new ArrayList<Integer>();
	}
	
	public void inputValue() {
		int[] scores = new int[subject.length];
		
		for(int i = 0; i < subject.length; i++) {
			Integer score = inService.inputValue(subject[i],0,100);
			Integer kor = kors.get(i);
		}
		
		
	}

}
