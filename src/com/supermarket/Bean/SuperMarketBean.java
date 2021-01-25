package com.supermarket.Bean;


public class SuperMarketBean {
	private static int itemid;
	private static String itemname;
	private static float itemcost;
	public static int getitemid() {
		return itemid;
	}
	public void setitemid(int itemid) {
		SuperMarketBean.itemid=itemid;
	}
	public static String getitemname() {
		return itemname;
	}
	public void setitemname(String itemname) {
		SuperMarketBean.itemname=itemname;
	}
	public static float getitemcost() {
		return itemcost;
	}
	public void setitemcost(float itemcost) {
		SuperMarketBean.itemcost=itemcost;
	}

}
