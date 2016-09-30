package spoilsOfwar;

import javax.crypto.interfaces.PBEKey;

public class SpoilsOfWar {

	String weapon;
	String amor;
	String health;
	String knocking;
	
	
	public void getSpoils() {
		System.out.println("获得了:"+weapon+amor+health+knocking);
	}
	
	
	public void getWeapon() {
		System.out.println("获得了:"+weapon);
		
	}
}
