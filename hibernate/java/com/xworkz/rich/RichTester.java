package com.xworkz.rich;

import com.xworkz.rich.dao.RichDao;
import com.xworkz.rich.dao.RichDaoImpl;
import com.xworkz.rich.entity.RichEntity;

public class RichTester {

	public static void main(String[] args) {
		RichEntity entity = new RichEntity();
		// entity.setId(1);
		entity.setName("Bill Gates");
		entity.setCountry("USA");
		entity.setNetWorthInBillions(133);
		entity.setMarried(true);
		entity.setBusiness("Software");
		entity.setRank(3);
		RichDao dao = new RichDaoImpl();
		dao.crete(entity);

		RichEntity richentity = dao.getById(1);
		System.out.println(richentity.getName());
		System.out.println(richentity);

		RichEntity richEntity = dao.updateNetWorthInBillionsAndRank(1, 116, 6);
		System.out.println("updated successfully");
		System.out.println(richEntity);

		dao.delete(1);

	}

}
