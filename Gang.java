package com.intermidiate;
import java.util.Random;

public class Gang {
	private Criminal[] criminals= new Criminal[2];
	private Random randomNumberGenerator=new Random();
	private double sumRobbedValue;
	
	Gang(){
		Item[] jiminItems= new Item[2];
		jiminItems[0]=new Item("lolipop", 10);
		jiminItems[1]=new Item("pencil", 5);
		Criminal jimin=new Criminal("jimin lajimolala 2000 breaking in  jiminItems");
		criminals[0]=jimin;
		
		
		Item[] jinItems= new Item[2];
		jinItems[0]=new Item("sharpener", 4);
		jinItems[1]=new Item("caramboard", 11);
		Criminal jin=new Criminal("jin carbonara 2003 breaking out  jinItems");
		criminals[1]=jin;
	
	}
	public double getSumRbbedValue() {
		return sumRobbedValue;
	}
	public void printGangInfo() {
		for(Criminal criminal:criminals) {
			criminal.printBioData();
		}
	}
	private boolean isSuccessfulRobbery() {
		int randomNumber=randomNumberGenerator.nextInt();
		int summarizedSuccessChange=criminals.length*Criminal.SUCCESS_PERCENTAGE;
		if(randomNumber>=summarizedSuccessChange) {
			return false;
		}
		return true;
	}
public void letsRob(Building[] buildings) {
	int randomBuildingIndex= randomNumberGenerator.nextInt(buildings.length+1);
	if(isSuccessfulRobbery()) {
		System.out.println("the gang robbed the items"+buildings[randomBuildingIndex].getName());
		for(Item item:buildings[randomBuildingIndex].getItems()){
			sumRobbedValue=sumRobbedValue+item.getValue();
			System.out.println(item.getName());
		}
		 {
			System.out.println("the gang want to rob"+buildings[randomBuildingIndex].getName()+"but failed");
		}		
		}
		
		}

}
