package character;

public class Life {

	public static int life;
	public static int hurt;
	public static int curLife;

	public void setLife(int life) {

		// System.out.println("总生命值:"+life);
		// System.out.println("当前生命值:"+(life-hurt));
		//this.life = life;

	}

	public int getLife() {
		return life;
	}

	public void hurt() {
		System.out.println("受到的伤害:" + hurt);
	}

}
