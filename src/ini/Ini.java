package ini;
import character.Life;
import instance.Ins;
import monster.Monster;

public class Ini extends Ins {

	public void ini() {
		System.out.println("发现一只 "+Monster.monsName+" !");
		while (Life.curLife >= 0) {
			
			System.out.println("选择一项:1.攻击  2.使用道具  3.查看勇者属性  4继续前行  5查看怪物属性  6查看我的装备  7背包");
			
			int a = sc.nextInt();
			ip.scanner(a);

		}
		System.out.println("结束");

	}

}
