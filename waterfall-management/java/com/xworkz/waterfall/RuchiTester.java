package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.SearchWaterFallDao;

import com.xworkz.waterfall.dao.SearchWaterFallDaoImpl;

public class RuchiTester {
	public static void main(String[] args) {
		SearchWaterFallDao dao=new SearchWaterFallDaoImpl();
		String result=dao.FindLocationByName("treefall");
		System.out.println(result);
		
		int i=dao.FindNoOfDeathsByLocationAndName("tumkur", "treefall");
		System.out.println(i);
		
		Object[] obj=dao.FindNoOfDeathdAndDestinationByLocationAndName("tumkur", "treefall");
		System.out.println(obj.length);
	}




}
