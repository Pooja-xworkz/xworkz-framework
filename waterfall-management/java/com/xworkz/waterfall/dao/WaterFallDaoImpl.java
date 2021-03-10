package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SfUtil;

public class WaterFallDaoImpl implements WaterFallDao {
	private SessionFactory factory = SfUtil.getFactory();
	WaterFallEntity entity=new WaterFallEntity();

	public WaterFallDaoImpl() {
		System.out.println("created sf");
		System.out.println("factory1" + this.getClass());
	}

	@Override
	public void create(WaterFallEntity waterFallEntity) {
		System.out.println("invoked creation of waterfalls");
		System.out.println("entity:" + waterFallEntity);
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			session.save(waterFallEntity);
			tr.commit();
		}
	}

	@Override
	public WaterFallEntity getById(int id) {
		System.out.println("invoked to get id");
		try {Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
				WaterFallEntity waterFallEntityfromdb=session.get(WaterFallEntity.class,id);
			tr.commit();
				session.close();
				return waterFallEntityfromdb;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return entity;
		
	}

	@Override
	public void updateHeightAndDepth(int id, double height, double depth) {
		System.out.println("invoked update");
		try {Session session=factory.openSession();
	 Transaction tr= session.beginTransaction();
	WaterFallEntity waterFallEntityfromDb=session.get(WaterFallEntity.class,id);
	if(waterFallEntityfromDb!=null){
		waterFallEntityfromDb.setDepth(depth);
		waterFallEntityfromDb.setHeight(height);
		session.update(waterFallEntityfromDb);
		tr.commit();
		
		session.close();
		
	}
		
		
	}
		catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}

	@Override
	public void deteteById(int id) {
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();                  
		WaterFallEntity waterfallentityfromdb=session.get(WaterFallEntity.class, 1);
		if(waterfallentityfromdb!=null)
			session.delete(waterfallentityfromdb);
tr.commit();
		
		session.close();
		
	}
}
	
	
		
		
		
		
	


