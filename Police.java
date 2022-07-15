package com.intermidiate;
import java.util.Random;

public class Police {
	private Detective shiva;
	Police(){
		Item[] shivaItems=new Item[2];
		String name;
		String value;
		shivaItems[0]=new Item("gun  50");
		shivaItems[1]=new Item("latti 20");}
		
		
		public boolean catchCriminals(Gang gang) {
			if(areCriminalsCaught()) {
				System.out.println(shiva.getName()+"catched the gang");
				if(gang.getSumRbbedValue()>0) {
					System.out.println("the stolen items.");
					System.out.println("overall estimated value" + gang.getSumRbbedValue());}
					else {
						System.out.println("gang did not steal anything");
					
					}}
					return true;
					 
					
					}
					
				
				private boolean areCriminalsCaught() {
					Random randomNumberGenerator=new Random();
					if(randomNumberGenerator.nextInt(101)>=Detective.SUCCESS_PERCENTAGE) {
					return false;
					}
					return true;
				}
			
		
	}


