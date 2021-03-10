package com.xworkz.waterfall;

import com.xworkz.waterfall.dao.WaterFallDao;
import com.xworkz.waterfall.dao.WaterFallDaoImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class waterfalltester {

	public static void main(String[] args) {
		WaterFallEntity entity = new WaterFallEntity();
		entity.setName("jogfalls");
		entity.setLocation("shivmoga");
		entity.setDepth(1.6);
		entity.setDestination("india");
		entity.setElectricityGenerated(true);
		entity.setEntryFee(50);
		entity.setHeight(3.9);
		entity.setNoOfDeath(6);
		entity.setNoofvisitors(4000);
		entity.setSourceRiver("ganga");
		entity.setRating(5);
		
		WaterFallEntity entity2 = new WaterFallEntity();
		entity2.setName("Balmurifalls");
		entity2.setLocation("hasan");
		entity2.setDepth(1.6);
		entity2.setDestination("india");
		entity2.setElectricityGenerated(true);
		entity2.setEntryFee(20);
		entity2.setHeight(9.9);
		entity2.setNoOfDeath(4);
		entity2.setNoofvisitors(9000);
		entity2.setSourceRiver("thunga");
		entity2.setRating(3);
		
		WaterFallEntity entity3 = new WaterFallEntity();
		entity3.setName("treefall");
		entity3.setLocation("tumkur");
		entity3.setDepth(7.0);
		entity3.setDestination("india");
		entity3.setElectricityGenerated(true);
		entity3.setEntryFee(20);
		entity3.setHeight(9.7);
		entity3.setNoOfDeath(8);
		entity3.setNoofvisitors(6000);
		entity3.setSourceRiver("badra");
		entity3.setRating(5);

		WaterFallDao waterFallDao = new WaterFallDaoImpl();


		waterFallDao.create(entity3);
		
		waterFallDao.updateHeightAndDepth(1, 4.5, 5.6);
		waterFallDao.deteteById(1);


	}

}
