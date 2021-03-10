package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.util.SfUtil;

public class StateDAOImpl implements StateDAO {

	private SessionFactory factory = SfUtil.getFactory();

	@Override
	public void create(StateEntity stateEntity) {
		System.out.println("invoked stateEntity Creation");
		System.out.println(stateEntity);
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			session.save(stateEntity);
			tr.commit();
		}

	}

	@Override
	public void create(List<StateEntity> entities) {

		System.out.println("invoked list of StateEntities Creation");
		System.out.println("StateEntity :" + entities);
		Transaction tr = null;
		try {
			int count=0;
			Session session = factory.openSession();
			tr = session.beginTransaction();
			for (StateEntity stateEntity : entities) {
				session.save(stateEntity);
				if(count==2) {
					session.flush();
					count=0;
				}
			
				count++;

			}
			tr.commit();

		} catch (Exception e) {
			tr.rollback();
		}
	}
}
