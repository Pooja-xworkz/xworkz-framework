package com.xworkz.waterfall.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.waterfall.util.SfUtil;

public class SearchWaterFallDaoImpl extends WaterFallDaoImpl implements SearchWaterFallDao{
	private SessionFactory factory = SfUtil.getFactory();
	@Override
	public String FindLocationByName(String name) {
		try(Session session=factory.openSession()){
		String hql="select waterfall.location from WaterFallEntity waterfall where waterfall.name=:nm";
		Query<String> hqlqu=session.createQuery(hql);
		hqlqu.setParameter("nm", name);
		String name1=hqlqu.uniqueResult();
		return name1;
		}
		
		
		
	}

	@Override
	public int FindNoOfDeathsByLocationAndName(String Loc, String name) {
		try(Session session=factory.openSession()){
		String i="select waterfall.noOfDeath from WaterFallEntity waterfall where waterfall.location=:lc and waterfall.name=:nm";
			Query<Integer> hqlqu=session.createQuery(i);
			hqlqu.setParameter("nm", name);
			hqlqu.setParameter("lc", Loc);
			Integer name1=hqlqu.uniqueResult();
			return name1;
			}
	}

	@Override
	public Object[] FindNoOfDeathdAndDestinationByLocationAndName(String loc, String name) {
		try(Session session=factory.openSession()){
		String i="select waterfall.noOfDeath,waterfall.destination from WaterFallEntity waterfall where waterfall.location=:lc and waterfall.name=:nm";
			Query<Object[]> objs=session.createQuery(i);
			objs.setParameter("nm", name);
			objs.setParameter("lc", loc);
			Object[] name1=objs.uniqueResult();
			return name1;
		
		
	}

}
}
