package com.javaex.ex03_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
	
		//파읽을 읽는다.  -- > 한줄씩 -- >  출력 
		
		Reader fr = new FileReader("C:\\java Study\\file\\PhoneDB_원본.txt"); // 읽을 파일 가져오기
		BufferedReader br = new BufferedReader(fr); // 속도 향상 fr 을
		
		List<Person> pList =new ArrayList<Person>();
		
		
		
		String line= ""; // 가변 
		
		
		while(true) {
			
			
		
		line =br.readLine(); // 한줄씩 읽어라 
		if(line == null) {
			break;
		}
		
		String[] pInfo = line.split(",");
		
		String name = pInfo[0];
		String hp = pInfo[1];
		String company = pInfo[2];
		
		
		
		Person p = new Person(name, hp , company);
				
		pList.add(p);
		
	 
		}
		
			for(int i = 0; i<pList.size(); i++ ) {
				System.out.println("이름:" + pList.get(i).getName());
				System.out.println("핸드폰" + pList.get(i).getHp());
				System.out.println("회사" + pList.get(i).getCompay());
				System.out.println(" ");
			}
		
			
			System.out.println("=====================================");
			
			System.out.println("정우성 정보:" + pList.get(1).getName() + "," + pList.get(1).getHp() );
		br.close();
		

	}

}
