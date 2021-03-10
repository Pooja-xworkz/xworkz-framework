package com.xworkz.rich.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.rich.entity.RichEntity;

public class RichDaoImpl implements RichDao {
	public RichDaoImpl() {
		System.out.println("Invoked RichDaoImpl");
	}

	@Override
	public void crete(RichEntity entity) {
		System.out.println("invoked create method");
		System.out.println("entity: " + entity);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(RichEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(entity);
		tr.commit();
		session.close();
		sf.close();
	}

	@Override
	public RichEntity getById(int id) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(RichEntity.class);
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		RichEntity richentityfromdb = session.get(RichEntity.class, id);
		tr.commit();
		session.close();
		sf.close();

		return richentityfromdb;
	}

	@Override
	public RichEntity updateNetWorthInBillionsAndRank(int id, int NetWorthInBillions, int Rank) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(RichEntity.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		RichEntity richentityfromdb = session.get(RichEntity.class, id);

		if (richentityfromdb != null) {
			richentityfromdb.setNetWorthInBillions(NetWorthInBillions);
			richentityfromdb.setRank(Rank);
			session.update(richentityfromdb);
			tr.commit();
		} else {
			System.out.println("cannot update");
		}
		session.close();
		sf.close();
		return richentityfromdb;
	}

	@Override
	public void delete(int id) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(RichEntity.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		RichEntity richentityfromdb = session.get(RichEntity.class, id);

		if (richentityfromdb != null) {
			session.delete(richentityfromdb);
			tr.commit();
			System.out.println("deleted");
		} else {
			System.out.println("cannot delete");
		}
		session.close();
		sf.close();

	}

}
