package battleword;

import randomly.Randomly;

public class BattleWord extends Randomly{

	public static String skills;
	
	public String battleWord() {
		int a = randomly();
		
		if (a == 1) {
			skills = "气功波";
		
		} else if (a == 2) {
			skills = "回旋踢";
		} else if (a == 3) {
			skills = "核弹";
		} else if (a == 4) {
			skills = "毁天灭地斩";
		} else if (a == 5) {
			skills = "升龙拳";
		} else if (a == 6) {
			skills = "太极拳";
		} else if (a == 7) {
			skills = "火球术";
		} else if (a == 8) {
			skills = "龟派气功";
		} else if (a == 9) {
			skills = "致死打击";
		} else if (a == 10) {
			skills = "斩杀";
		}
		return skills;
		
	}
	
	
	
}
