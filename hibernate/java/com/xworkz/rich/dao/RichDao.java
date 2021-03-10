package com.xworkz.rich.dao;

import com.xworkz.rich.entity.RichEntity;

public interface RichDao {
	public void crete(RichEntity entity);

	public RichEntity getById(int id);

	public RichEntity updateNetWorthInBillionsAndRank(int id, int NetWorthInBillions, int Rank);
	
	public void delete(int id);
}
