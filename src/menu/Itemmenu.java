package menu;

import character.Life;
import character.Properties;

public class Itemmenu {

	public static int itemFlag;

	public void showItem(int a) {

		switch (a) {
		case 1:
			// 喝生命药水,超过生命上限调整至生命上限
			Life.life += 50;
			if (Life.life >= Life.curLife) {
				Life.life = Life.curLife;
			}
			System.out.println("***恢复了50点生命值!***");

			break;
		case 2:

			// 暴击药水,超过暴击上限调整至暴击上限
			Properties.knocking += 50;

			if (Properties.knocking >= 100) {
				Properties.knocking = 100;
			}

			System.out.println("***暴击几率提高了50%***");
			break;
		case 3:
			// 查看勇者属性
			System.out.println("总生命值:" + Life.life);

			System.out.println(

			"攻击力:" + Properties.attPowr + "    防御力:" + Properties.defPowr + "    护甲:" + Properties.amorPowr + "   暴击几率:"
					+ Properties.knocking + "%");
			System.out.println("***   ***");
			break;
			
		case 4:
			// 道具Flag

			Itemmenu.itemFlag = 1;
			break;
		default:
			System.out.println("输入错误");
			break;
		}

	}

}
