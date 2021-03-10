package com.xworkz.waterfall;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class CreateCollectionTester {
	public static void main(String[] args) {
		StateEntity entity = new StateEntity("karnataka", 7.5, "kannada", 31);
		StateEntity entity2 = new StateEntity("rajastan", 10, "hindi", 35);
		StateEntity entity3 = new StateEntity("goa", 2, "konkani", 23);
		StateEntity entity4 = new StateEntity("kerala", 6, "malyalam", 21);
		StateEntity entity5 = new StateEntity("delhi", 8.9, "hindi", 18);
		List<StateEntity> list = new ArrayList();
		list.add(entity);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		StateDAO dao = new StateDAOImpl();
		dao.create(list);

	}

}
