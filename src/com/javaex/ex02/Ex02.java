package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//Reader fr =new FileReader("C:\\java Study\\file\\MS949.txt");
		Reader fr =new FileReader("C:\\java Study\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr); //  fr 덮어쓰는것 . 업그레이드 속도 향상
		
		
		while(true) {
		
		String str = br.readLine();// 한줄씩 읽어온다. -- > 줄바꿈기호는 제외
		if(str == null) {
			
			break;
		}
		
		System.out.println(str);
		
		
		
		}
		fr.close();
	}

}
