package com.javaex.ex03_1;

public class Person {

				//필드
			private String name;
			private String hp;
			private String compay;
			
			
			//생성자
			
			public Person() {
				
			}
			
			public Person(String name, String hp, String compay) {
				super();
				this.name = name;
				this.hp = hp;
				this.compay = compay;
			}

	
			
			
			
			
			//메소드 gs 
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getHp() {
				return hp;
			}

			public void setHp(String hp) {
				this.hp = hp;
			}

			public String getCompay() {
				return compay;
			}

			public void setCompay(String compay) {
				this.compay = compay;
			}

		
			
			
			
			//메소드 일반
			
			@Override
			public String toString() {
				return "Person [name=" + name + ", hp=" + hp + ", compay=" + compay + "]";
			}
			
			
			
}
