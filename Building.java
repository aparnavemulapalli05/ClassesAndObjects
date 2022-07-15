package com.intermidiate;

public class Building {
	private String name;
	private Item[] items;
	
	public Building(String name, Item[] items) {
		super();
		this.name = name;
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public Item[] getItems() {
		return items;
	}
	

}
