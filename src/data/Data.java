package data;

import character.Life;
import character.Properties;
import item.Item;
import item.ItemList;

public class Data {

	public void dataIns() {
		Life.life=100;
		Life.curLife=Life.life;
		ItemList.itemList1name=null;
		ItemList.itemList1Powr=0;
		ItemList.itemList1ID=0;
		
		ItemList.itemList2name=null;
		ItemList.itemList2Powr=0;
		ItemList.itemList2ID=0;
		
		ItemList.itemList3name=null;
		ItemList.itemList3Powr=0;
		ItemList.itemList3ID=0;
		
		
		Item.body="布衣";
		Item.head="破头盔";
		Item.hand="木棍";
		Item.leg="带补丁的裤子";
		Item.foot="草鞋";
		Properties.attPowr=2;
		Properties.defPowr=2;
		Properties.amorPowr=1;
		Properties.knocking=5;
		
	}
	
	
}
