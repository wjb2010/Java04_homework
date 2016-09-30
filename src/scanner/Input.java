package scanner;


import java.util.Scanner;

import battleword.BattleWord;
import character.Life;
import character.Properties;
import item.Item;
import item.ItemList;
import menu.Bagmenu;
import menu.Itemmenu;
import monster.Monster;
import randomly.KnockingRandomly;
import spoilsOfwar.SpoilsList;

public class Input {

	public void scanner(int a) {
		switch (a) {
		case 1:
			
			for (int i = 0; i < 999999; i++) {
				if (i % 2 == 0) {
					BattleWord word = new BattleWord();
					int pvm = Properties.attPowr - Monster.monsDef;
					if (pvm <= 0) {
						System.out.println("打不死怪物");
						break;
					} else {
						KnockingRandomly knocking = new KnockingRandomly();
						if (Properties.knocking >= knocking.knockingRandomly(Properties.knocking)) {
							System.out.println("勇者 对 " + Monster.monsName + " 施放了 " + word.battleWord() + " !"
									+ " !!!暴击!!! 造成了 " + pvm * 2 + " 点伤害!");
							Monster.monsLife = Monster.monsLife - pvm;

						} else {
							System.out.println("勇者 对 " + Monster.monsName + " 施放了 " + word.battleWord() + " !" + " 造成了 "
									+ pvm + " 点伤害!");
							Monster.monsLife = Monster.monsLife - pvm;
						}

						if (Monster.monsLife <= 0) {

							System.out.println("勇者 战胜了 " + Monster.monsName + " !");
							System.out.println("***   ***");
							SpoilsList sl=new SpoilsList();
							String temp=sl.battleSpoils();
							if (temp!=null) {
								System.out.println("哇,获得了:"+temp);
							}else if (ItemList.itemList1ID!=0&&ItemList.itemList2ID!=0&&ItemList.itemList3ID!=0) {
								System.out.println("包满了!");
							}else {
								System.out.println("什么都没出!");
							}
							break;
						}
					}

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}

				} else {
					BattleWord word = new BattleWord();

					int mvp = Monster.monsAtt - Properties.defPowr;
					if (mvp <= 0) {
						mvp = 0;
						System.out.println(Monster.monsName + " 对 " + "勇者" + " 施放了 " + word.battleWord() + " !"
								+ " 造成了 " + mvp + " 点伤害!");
					} else {

						System.out.println(Monster.monsName + " 对 " + "勇者" + " 施放了 " + word.battleWord() + " !"
								+ " 造成了 " + mvp + " 点伤害!");

						Life.life = Life.life - mvp;
						if (Life.life <= 0) {
							System.out.println("你死了!");
							break;
						}

					}

					try {

						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}

			}

			break;

		case 2:
			// 道具

			Itemmenu itemmenu = new Itemmenu();
			Itemmenu.itemFlag = 0;
			while (Itemmenu.itemFlag == 0) {

				System.out.println("选择一项:1.生命药水  2.暴击药水  3.查看勇者属性  4.退出道具栏");
				Scanner sc = new Scanner(System.in);
				int b = sc.nextInt();
				itemmenu.showItem(b);

			}

			break;

		case 3:
			// 查看属性

			System.out.println("总生命值:" + Life.life);

			System.out.println(

			"攻击力:" + Properties.attPowr + "    防御力:" + Properties.defPowr + "    护甲:" + Properties.amorPowr + "   暴击几率:"
					+ Properties.knocking + "%");
			System.out.println("***   ***");
			break;

		case 4:
			// 未定义
			Monster mon = new Monster();
			mon.creMonsName();
			System.out.println("这次遇到一个 " + Monster.monsName + " !");
			System.out.println("***   ***");
			break;

		case 5:
			// 看怪物属性
			System.out.println("怪物名称:" + Monster.monsName + "  怪物血量:" + Monster.monsLife + "  怪物攻击:" + Monster.monsAtt
					+ "  怪物防御:" + Monster.monsDef);
			System.out.println("***   ***");
			break;
			
		case 6:
			// 装备系统
			System.out.println("                   *");
			System.out.println("                 *****");
			System.out.println("                **   **"+"-------"+Item.head);
			System.out.println("                 ** **");
			System.out.println("           *******   ********"+"----------------"+Item.hand);
			System.out.println("                ***   ***"+"-----------"+Item.body);
			System.out.println("                 *******");
			System.out.println("                  *****"+"--------------------"+Item.leg);
			System.out.println("                ***   ***"+"-----"+Item.foot);
			System.out.println("                   ");
			break;
		case 7:
			// 背包系统
			Bagmenu bagmenu=new Bagmenu();
			Bagmenu.bagFlag = 0;
			while (Bagmenu.bagFlag == 0) {
				System.out.println("***************背包系统 v1.0***************");
				System.out.println("*****"+"1.第一个格子:"+ItemList.itemList1name+"*****");
				System.out.println("*****"+"2.第二个格子:"+ItemList.itemList2name+"*****");
				System.out.println("*****"+"3.第三个格子:"+ItemList.itemList3name+"*****");
				System.out.println("******************************************");
				System.out.println("1.使用第一个格子  2.使用第二个格子  3.使用第三个格子  4.查看勇者属性  5.退出背包");
				Scanner sc = new Scanner(System.in);
				int b = sc.nextInt();
				bagmenu.showBag(b);

			}
			break;

		default:
			System.out.println("输入有误");
			break;
		}
	}

}
