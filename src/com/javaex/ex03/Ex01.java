package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		

		Reader rf = new FileReader("C:\\java Study\\file\\PhoneDB_원본.txt");
		BufferedReader bf = new BufferedReader(rf);
		
		String str = ""; // 가변 
		
		
		
		while(true) {
			
			str = bf.readLine(); //한줄씩읽음
			
			if(str == null) {
				break;
			}
			
			
			String[] user = str.split(",");
			
			System.out.println("이름"+user[0] );
			System.out.println("핸드폰"+user[1]);
			System.out.println("회사"+user[2]);
			System.out.println("");
			
		}
		
		bf.close();
	}

}
