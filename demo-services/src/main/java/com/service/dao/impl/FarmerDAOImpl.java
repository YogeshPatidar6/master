package com.service.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.service.dao.FarmerDAO;
import com.service.request.FarmerRequest;
@Repository
@Transactional
public class FarmerDAOImpl implements FarmerDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Boolean addFarmeruser(FarmerRequest farmerRequest) {
		Session session = sessionFactory.getCurrentSession();

		String strQuery = "INSERT INTO Farmer(Name,Contact_no,Address,Villagename,Agricultural_land) "
				+ "VALUES " + "(" + ":name," + ":contactno,"+":address," + ":villagename," + ":land)";
		try {

			Query query = session.createSQLQuery(strQuery);

			query.setParameter("name", farmerRequest.getName());
			query.setParameter("contactno", farmerRequest.getContact_no());
			query.setParameter("address", farmerRequest.getAddress());
			query.setParameter("villagename", farmerRequest.getVillagename());
			query.setParameter("land", farmerRequest.getAgricultural_land());
		

			query.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("response Body " + e.getMessage());
		} finally {
			session.flush();
			session.clear();
		}
		return false;
	}
	

}
