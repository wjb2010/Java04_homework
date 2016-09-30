package character;

public class Score {

	int score;
	int finalScore;
	int kills;
	
	public void score() {
		System.out.println("当前分数是:"+score);
	}
	
	
	public void finalScore() {
		System.out.println("最终分数是:"+finalScore);
	}
	
	public void kills() {
		System.out.println("杀死了"+kills+"个敌人");
	}
	
}
