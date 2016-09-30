package monster;


import randomly.Randomly;

public class Monster extends Randomly {

	public static String monsName;
	public static int monsAtt;
	public static int monsDef;
	public static int monsLife;

	public String creMonsName() {

		int a = randomly();

		if (a == 1) {
			monsName = "史莱姆1";
			monsAtt = 1;
			monsDef = 1;
			monsLife=1;
		} else if (a == 2) {
			monsName = "史莱姆2";
			monsAtt = 2;
			monsDef = 1;
			monsLife=2;
		} else if (a == 3) {
			monsName = "史莱姆3";
			monsAtt = 3;
			monsDef = 1;
			monsLife=3;
		} else if (a == 4) {
			monsName = "史莱姆4";
			monsAtt = 4;
			monsDef = 4;
			monsLife=4;
		} else if (a == 5) {
			monsName = "史莱姆5";
			monsAtt = 5;
			monsDef = 1;
			monsLife=5;
		} else if (a == 6) {
			monsName = "史莱姆6";
			monsAtt = 6;
			monsDef = 6;
			monsLife=6;
		} else if (a == 7) {
			monsName = "史莱姆7";
			monsAtt = 7;
			monsDef = 1;
			monsLife=7;
		} else if (a == 8) {
			monsName = "史莱姆8";
			monsAtt = 8;
			monsDef = 1;
			monsLife=8;
		} else if (a == 9) {
			monsName = "史莱姆9";
			monsAtt = 9;
			monsDef = 1;
			monsLife=9;	
		} else if (a == 10) {
			monsName = "史莱姆10";
			monsAtt = 10;
			monsDef = 1;
			monsLife=10;
		}

		return monsName;
	}
}
