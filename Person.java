package com.intermidiate;

public abstract class Person {
	private String name;
	protected static String nickname;
	protected static int yearOfBorn;
	protected static String expertIn;
	protected static Item[] items;
	
	
	public Person(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.expertIn = expertIn;
		this.items = items;
	}
	
	public void printBioData(Item[] Items) {
		System.out.println("Name:" + name + "("+nickname+")");
		System.out.println("year Of born:"+ yearOfBorn);
		System.out.println("Expert in:"+ expertIn);
		System.out.println("The person has following items:");
		for(Item item:Items) {
			System.out.println("-"+item.getName());
		}
	}
	public String getName() {
		return name;
	}
	public String getNickname() {
		return nickname;
	}

	public void printBioData() {
		// TODO Auto-generated method stub
		
	}
	
}
	

	
		

	


