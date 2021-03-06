package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {

	public static void main(String[] args) {
		
		
		/*
		 * eclipse를 사용하여 프로젝트를 만들었을때
		 * Project의 소스코드가 저장되는곳은
		 * Project.src폴더 이후에 패키지 이름으로 만들어진다
		 * 새로운 파일을 만들기 위해서
		 * src/package-name 폴더를 지정하는데 
		 * 타이핑을 직접 하다보면 오타가 발생할 수 있기때문에 
		 * CopyQuilfied를 사용하여 임의의 파일 이름을 가져오고
		 * 필요한 파일로 이름을 변경하여 사용한다
		 */
		String fileName = "src/com/callor/app/data.txt";
		
		//file과 관련된 클래스를 사용할때는
		//객체선언과 생성문을 분리하여 작성한다.
		
		//FileWriter, PrintWriter를 객체로 선언
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		//객체 생성
		//FileWriter 클래스를 객체로 생성할 때
		//만들(작성할, 새로생성할)파일 이름 (경로포함)을
		//		생성자 매개변수로 전달해 주어야 한다.
		
		Random rnd = new Random();

		int num = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		//2개의 난수로 4칙연산을 수행
		//뺄셈과 나눗셈은 반드시 큰수 - 작은수,큰수/작은수
		if(num < num2) {
			int temp = num;
			num = num2;
			num2 = temp;
		}
		int sum = num + num2;
		int minus = num - num2;
		int times = num * num2;
		int div = num / num2;

		try {
			//FileWriter 클래스의 객체만으로도
			//	파일에 기록할 수 있지만
			//	상당히 복잡하고,불편한 코드를 만들어야 한다.
			//PrintWriter 클래스의 객체를 
			//	FileWriter 클래스의 객체와 연결하여
			//	System.out의 Print 관련 method 와 똑같은 방법으로
			//	파일에 Text들을 저장한다.
			
			//OS <->FileWriter <-> PrintWriter가 서로 연결되어
			//데이터를 파일에 기록한다
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);

			out.printf("%d + %d = %d\n", num, num2, num + num2);
			out.printf("%d * %d = %d\n", num, num2, num * num2);
			out.printf("%d - %d = %d\n", num, num2, num - num2);
			out.printf("%d / %d = %d\n", num, num2, num / num2);
			
			out.flush();
			out.close();
			
			//PrintWriter를 닫으면 FileWriter도 같이 닫히기 때문에
			//일부러 close 하지 않아도무방하다
			fileWriter.close();
			
			System.out.println("작업완료");
		} catch (IOException e) {
			System.out.println(fileName + "파일을 생성할 수 없음");
		}

	}

}
