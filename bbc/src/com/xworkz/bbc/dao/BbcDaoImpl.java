package com.xworkz.bbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.bbcEntity.BbcEntity;

public class BbcDaoImpl implements BbcDao {
	public BbcDaoImpl() {
		System.out.println("invoked BbcDaoImpl");
	}

	public void create(BbcEntity bbcentity) {
		System.out.println("invoked create method");
		System.out.println("BBCEntity:" + bbcentity);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BbcEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(bbcentity);
		tr.commit();
		session.close();
		sf.close();
	}

	@Override
	public BbcEntity getById(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BbcEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		BbcEntity bbcEntityFromDb=session.get(BbcEntity.class, id);
		tr.commit();
		session.close();
		sf.close();
		return bbcEntityFromDb;
	}
}
