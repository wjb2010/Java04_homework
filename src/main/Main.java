package main;


import data.Data;
import ini.Ini;
import monster.Monster;


public class Main {
	

	public static void main(String[] args) {

		Ini ini=new Ini();
		Data data=new Data();
		Monster mon=new Monster();
		
          
		
		data.dataIns();//初始化人物属性数据
		mon.creMonsName();//随机创建怪物名字,血量,攻击,防御
		
		
		ini.ini();//初始化选择栏

	}

	
	
}
