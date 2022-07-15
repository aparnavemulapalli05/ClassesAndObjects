package com.intermidiate;

public class Criminal extends Person {
	public static final int SUCCESS_PERCENTAGE=20;

	public Criminal(String name) {
		super(name, nickname, yearOfBorn, expertIn, items);
		
	}
	public void printBioData() {
		System.out.println("Criminal person:");
		super.printBioData();
	}
	

}
