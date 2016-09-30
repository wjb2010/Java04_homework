package spoilsOfwar;

import item.ItemList;
import randomly.Randomly;

public class SpoilsList extends Randomly {

	public static String spoils;
	public static String spoils2;
	public static String spoils3;

	public String battleSpoils() {
		int a = randomly();

		if (a > 7) {

			if (ItemList.itemList1ID == 0) {
				ItemList.itemList1ID = 1;
				ItemList.itemList1name = "倚天剑";
				ItemList.itemPart1ID = 0;
				ItemList.itemList1Powr = 500;
				return ItemList.itemList1name;
			} else if (ItemList.itemList2ID == 0) {
				ItemList.itemList2ID = 1;
				ItemList.itemList2name = "倚天剑";
				ItemList.itemPart2ID = 0;
				ItemList.itemList2Powr = 500;
				return ItemList.itemList2name;
			} else if (ItemList.itemList3ID == 0) {
				ItemList.itemList3ID = 1;
				ItemList.itemList3name = "倚天剑";
				ItemList.itemPart3ID = 0;
				ItemList.itemList3Powr = 500;
				return ItemList.itemList3name;
			} else {
				//System.out.println("背包栏满了或出现异常");
				return null;
			}

			

		} else if (a<2) {
			if (ItemList.itemList1ID == 0) {
				ItemList.itemList1ID = 2;
				ItemList.itemList1name = "黄金头盔";
				ItemList.itemPart1ID = 1;
				ItemList.itemList1Powr = 500;
				return ItemList.itemList1name;
			} else if (ItemList.itemList2ID == 0) {
				ItemList.itemList2ID = 2;
				ItemList.itemList2name = "黄金头盔";
				ItemList.itemPart2ID = 1;
				ItemList.itemList2Powr = 500;
				return ItemList.itemList2name;
			} else if (ItemList.itemList3ID == 0) {
				ItemList.itemList3ID = 2;
				ItemList.itemList3name = "黄金头盔";
				ItemList.itemPart3ID = 1;
				ItemList.itemList3Powr = 500;
				return ItemList.itemList3name;
			} else {
				//System.out.println("背包栏满了或出现异常");
				return null;
			}
			
			
		}else {
			return null;
		}

	}
}
