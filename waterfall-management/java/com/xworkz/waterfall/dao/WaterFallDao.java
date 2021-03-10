package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallEntity;

public interface WaterFallDao {
	public void create(WaterFallEntity waterFallEntity);

	public WaterFallEntity getById(int id);

	public void updateHeightAndDepth(int id, double height, double depth);

	public void deteteById(int id);

}
