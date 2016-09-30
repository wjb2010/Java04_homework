package randomly;



import instance.Ins;

public class Randomly extends Ins{
	
	
	
	//产生1个随机数并打印,范围1-10
	
	public int randomly() {
		
			
			int num1=ran1.nextInt(10-1+1)+1;
			return num1;
		
	}
	
	
	
}
