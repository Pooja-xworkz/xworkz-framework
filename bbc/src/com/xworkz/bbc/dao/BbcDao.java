package com.xworkz.bbc.dao;

import com.xworkz.bbc.bbcEntity.BbcEntity;

public interface BbcDao {
 public void create(BbcEntity bbcentity);

	public BbcEntity getById(int id);

}
