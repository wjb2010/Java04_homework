package randomly;

import java.util.Random;

public class KnockingRandomly {

	
	public int knockingRandomly(int knock) {
		
		Random ran1=new Random();
		
		int num1=ran1.nextInt(100-1+1)+1;
		return num1;
	}
	
}
