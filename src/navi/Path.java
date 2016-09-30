package navi;

public class Path {

	String a;
	String b;
	String c;
	
	
	public void pathA() {
		System.out.println("Path类"+a);
		
		Position position=new Position();
		position.x=6;
	}
	
	public void pathB() {
		System.out.println("Path类"+b);
	}
	
	public void pathC() {
		System.out.println("Path类"+c);
	}
	
}
