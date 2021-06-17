package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\java Study\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);      //덮어 씌움
		
		String str = "학교 종이 떙떙떙떙떙";
		
		
		bw.write("학교종이 땡떙떙");
		bw.newLine(); // 줄 바꿈
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		
		bw.close();
		
		/*
		Writer fw = new FileWriter("C:\\java Study\\file\\song.txt");
		String str ="종을 울려 땡땡땡";
		fw.write(str);
		fw.close();
		*/
	}

}
