package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\java Study\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949"); // 번역
		BufferedReader br =new BufferedReader(isr);
		
		
		String line ="";
		
		while(true) {
			line= br.readLine(); // 한줄씩 읽어라
			
			if(line == null) {	
				break;
			}
			System.out.println(line);
			
		}
		
		
		
		br.close();
		
		
	}

}
