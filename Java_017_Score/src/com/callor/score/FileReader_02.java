package com.callor.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_02 {

	public static void main(String[] args) {
		String fileName = "src/com/callor/score/sample_score.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
			for(int i = 0; i < 20; i++) {
				//read() methos는
				//fileReader로 열린 파일에서
				//한 byte씩 데이터를 읽어서
				//ASCII코드 값으로 return 한다
				int result = fileReader.read();
				System.out.printf("%c",result);
			}
			
			int result = fileReader.read();
			//정수값이 해당하는 ASCII코드를 바꾸어서 보여달라
			
			System.out.printf("%c",result);
			fileReader.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
