package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			System.out.println("=".repeat(50));
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}String[] name = reader.split(":");
				System.out.printf("%s  %s\n",name[0],name[1]);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=".repeat(50));
		
	}

}
