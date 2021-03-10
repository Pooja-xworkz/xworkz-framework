package com.xworkz.waterfall.dao;

public interface SearchWaterFallDao extends WaterFallDao{

	public String FindLocationByName(String Name);
	public int FindNoOfDeathsByLocationAndName(String Loc,String name);
	public Object[] FindNoOfDeathdAndDestinationByLocationAndName(String loc,String name);
}
