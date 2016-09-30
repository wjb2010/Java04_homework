package menu;

import character.Life;
import character.Properties;
import item.Item;
import item.ItemList;

public class Bagmenu {

	public static int bagFlag;

	public void showBag(int a) {
		// 物品ID=1的是武器,物品ID=2的是护甲,武器 部位编号是0,护甲部位分为 头,胸,腿,鞋 ,对应编号1.2.3.4
		switch (a) {
		case 1:
			// 使用第一个格子的物品
			// Life.life += 50;
			// if (Life.life >= Life.curLife) {
			// Life.life = Life.curLife;
			// }
			// System.out.println("***恢复了50点生命值!***");

			if (ItemList.itemList1ID == 1) {

				Properties.attPowr += ItemList.itemList1Powr;
				Item.hand = ItemList.itemList1name;
				ItemList.itemList1name = null;
				ItemList.itemList1ID = 0;
				ItemList.itemList1Powr = 0;// 清空第一个格子
				ItemList.itemPart1ID = -1;

				System.out.println("武器装备成功!");

				break;

			} else if (ItemList.itemList1ID == 2) {

				if (ItemList.itemPart1ID == 1) {

					Properties.defPowr += ItemList.itemList1Powr;
					Item.body = ItemList.itemList1name;
					ItemList.itemList1name = null;
					ItemList.itemList1ID = 0;
					ItemList.itemList1Powr = 0;// 清空第一个格子
					ItemList.itemPart1ID = -1;

				} else if (ItemList.itemPart1ID == 2) {
					Properties.defPowr += ItemList.itemList1Powr;
					Item.leg = ItemList.itemList1name;
					ItemList.itemList1name = null;
					ItemList.itemList1ID = 0;
					ItemList.itemList1Powr = 0;// 清空第一个格子
					ItemList.itemPart1ID = -1;
				} else if (ItemList.itemPart1ID == 3) {
					Properties.defPowr += ItemList.itemList1Powr;
					Item.foot = ItemList.itemList1name;
					ItemList.itemList1name = null;
					ItemList.itemList1ID = 0;
					ItemList.itemList1Powr = 0;// 清空第一个格子
					ItemList.itemPart1ID = -1;
				} else if (ItemList.itemPart1ID == 4) {
					Properties.defPowr += ItemList.itemList1Powr;
					Item.head = ItemList.itemList1name;
					ItemList.itemList1name = null;
					ItemList.itemList1ID = 0;
					ItemList.itemList1Powr = 0;// 清空第一个格子
					ItemList.itemPart1ID = -1;
				} else {
					System.out.println("未知错误");
				}
			} else {
				System.out.println("第一个格子是空的!");
			}

			break;
		case 2:

			// 使用第二个格子的物品
			// Properties.knocking += 50;
			//
			// if (Properties.knocking >= 100) {
			// Properties.knocking = 100;
			// }
			//
			// System.out.println("***暴击几率提高了50%***");

			if (ItemList.itemList2ID == 1) {

				Properties.attPowr += ItemList.itemList2Powr;
				Item.hand = ItemList.itemList2name;
				ItemList.itemList2name = null;
				ItemList.itemList2ID = 0;
				ItemList.itemList2Powr = 0;// 清空第二个格子
				ItemList.itemPart2ID = -1;

				System.out.println("武器装备成功!");

				break;

			} else if (ItemList.itemList2ID == 2) {

				if (ItemList.itemPart2ID == 1) {

					Properties.defPowr += ItemList.itemList2Powr;
					Item.body = ItemList.itemList2name;
					ItemList.itemList2name = null;
					ItemList.itemList2ID = 0;
					ItemList.itemList2Powr = 0;// 清空第二个格子
					ItemList.itemPart2ID = -1;

				} else if (ItemList.itemPart2ID == 2) {
					Properties.defPowr += ItemList.itemList2Powr;
					Item.leg = ItemList.itemList2name;
					ItemList.itemList2name = null;
					ItemList.itemList2ID = 0;
					ItemList.itemList2Powr = 0;// 清空第一个格子
					ItemList.itemPart2ID = -1;
				} else if (ItemList.itemPart2ID == 3) {
					Properties.defPowr += ItemList.itemList2Powr;
					Item.foot = ItemList.itemList2name;
					ItemList.itemList2name = null;
					ItemList.itemList2ID = 0;
					ItemList.itemList2Powr = 0;// 清空第一个格子
					ItemList.itemPart2ID = -1;
				} else if (ItemList.itemPart2ID == 4) {
					Properties.defPowr += ItemList.itemList2Powr;
					Item.head = ItemList.itemList2name;
					ItemList.itemList2name = null;
					ItemList.itemList2ID = 0;
					ItemList.itemList2Powr = 0;// 清空第一个格子
					ItemList.itemPart2ID = -1;
				} else {
					System.out.println("未知错误");
				}
			} else {
				System.out.println("第二个格子是空的!");
			}

			break;

		case 3:

			// 使用第三个格子的物品
			// Properties.knocking += 50;
			//
			// if (Properties.knocking >= 100) {
			// Properties.knocking = 100;
			// }
			//
			// System.out.println("***暴击几率提高了50%***");

			if (ItemList.itemList3ID == 1) {

				Properties.attPowr += ItemList.itemList3Powr;
				Item.hand = ItemList.itemList3name;
				ItemList.itemList3name = null;
				ItemList.itemList3ID = 0;
				ItemList.itemList3Powr = 0;// 清空第三个格子
				ItemList.itemPart3ID = -1;

				System.out.println("武器装备成功!");

				break;

			} else if (ItemList.itemList3ID == 2) {

				if (ItemList.itemPart3ID == 1) {

					Properties.defPowr += ItemList.itemList3Powr;
					Item.body = ItemList.itemList3name;
					ItemList.itemList3name = null;
					ItemList.itemList3ID = 0;
					ItemList.itemList3Powr = 0;// 清空第二个格子
					ItemList.itemPart3ID = -1;

				} else if (ItemList.itemPart3ID == 2) {
					Properties.defPowr += ItemList.itemList3Powr;
					Item.leg = ItemList.itemList3name;
					ItemList.itemList3name = null;
					ItemList.itemList3ID = 0;
					ItemList.itemList3Powr = 0;// 清空第一个格子
					ItemList.itemPart3ID = -1;
				} else if (ItemList.itemPart3ID == 3) {
					Properties.defPowr += ItemList.itemList3Powr;
					Item.foot = ItemList.itemList3name;
					ItemList.itemList3name = null;
					ItemList.itemList3ID = 0;
					ItemList.itemList3Powr = 0;// 清空第一个格子
					ItemList.itemPart3ID = -1;
				} else if (ItemList.itemPart3ID == 4) {
					Properties.defPowr += ItemList.itemList3Powr;
					Item.head = ItemList.itemList3name;
					ItemList.itemList3name = null;
					ItemList.itemList3ID = 0;
					ItemList.itemList3Powr = 0;// 清空第一个格子
					ItemList.itemPart3ID = -1;
				} else {
					System.out.println("未知错误");
				}
			} else {
				System.out.println("第三个格子是空的!");
			}

			break;

		case 4:
			// 查看勇者属性
			System.out.println("总生命值:" + Life.life);

			System.out.println(

			"攻击力:" + Properties.attPowr + "    防御力:" + Properties.defPowr + "    护甲:" + Properties.amorPowr + "   暴击几率:"
					+ Properties.knocking + "%");
			System.out.println("***   ***");
			break;

		case 5:
			// 道具Flag 退出用

			Bagmenu.bagFlag = 1;
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
}
