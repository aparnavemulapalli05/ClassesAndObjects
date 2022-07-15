package com.intermidiate;

public class GreatRobbery {

	public static void main(String[] args) {
          City city= new City();
          Gang theGang=new Gang();
          Police police=new Police();
          theGang.printGangInfo();
          theGang.letsRob(city.getBuilding());
          police.catchCriminals(theGang);

	}

}
