package com.callor.app.service;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	/*
	 *
	 */
	@Override
	protected String inputNum() {
		while(true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}

			String strNum = String.format("2021%03d", intNum);
			/*
			 * 생성한 strNUm에 저장된 학번이 scoreList에 있는지 확인
			 */
			int index = 0;
			// index는 0 ~scoreList.size() -1 반복하는 과정에서
			// 0~ scoreList.size() -1에 해당한 값을 갖게 된다
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if(vo.getNum().equals(strNum)) {
					break;
				}
			}
			//for() 반복문이 모두 정상종료 되었는지?? : index > size()
			//아니면 중간에 중단되고 빠져 나왔는지?? : index < size()
			// for()중간에 break를 만났다. break가 실행됐다
			//		이미 등록된 학번이 있다.
			if(index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어 있음 ");
				//다시 입력받으로 가기
			}
			return strNum;
			
		}//end while
	}

		
}
