package com.xworkz.bbc;

import com.xworkz.bbc.bbcEntity.BbcEntity;
import com.xworkz.bbc.dao.BbcDao;
import com.xworkz.bbc.dao.BbcDaoImpl;


public class BbcTester {

	public static void main(String[] args) {
		BbcEntity bbcentity=new BbcEntity();
		bbcentity.setName("Niveditha Gowda");
		bbcentity.setGender("Female");
		bbcentity.setTypeofcontenstant("Tik toker");
		bbcentity.setNoofdays(2);
		bbcentity.setNooftasks(2);
		bbcentity.setSeason(7);
		 
BbcDao dao=new BbcDaoImpl();
dao.create(bbcentity);
//BbcEntity bbcentity1=dao.getById(1);
//System.out.println(bbcentity1.getName());
//System.out.println(bbcentity1);
	}

}
