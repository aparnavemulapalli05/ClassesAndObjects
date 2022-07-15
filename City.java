package com.intermidiate;

public class City {
	
	private Building[] buildings= new Building[4];
	
	public City() {
		Item[] bankItems=new Item[2];

		bankItems[0]= new Item( "Diamond",  1.5);
		bankItems[1]= new Item( "Gold",  3.5);
		buildings[0]=new Building( "Bank", bankItems);
		
		Item[] mansionItems=new Item[2];
		mansionItems[0]= new Item( "Monalisa",  2.5);
		mansionItems[1]= new Item( "silver",  4.5);
		buildings[1]=new Building( "Bank", mansionItems);
		
		Item[] valuableItems=new Item[2];
		valuableItems[0]= new Item( "ArabianBull",  5.5);
		valuableItems[1]= new Item( "chitah",  6.5);
		buildings[2]=new Building( "Bank", valuableItems);
	}
	public Building[] getBuilding() {
		return buildings;
	
		
	}
	}


