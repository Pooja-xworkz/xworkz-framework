package com.xworkz.waterfall.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.waterfall.exception.SfCreationException;

public class SfUtil {
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("session factory created successfully");

			} else {
				throw new SfCreationException("unsuccessfull in creating sf");

			}

		} catch (Exception e) {
			throw new SfCreationException(e.getMessage());
		}

	}
}
