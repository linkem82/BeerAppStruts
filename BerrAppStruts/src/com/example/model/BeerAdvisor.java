package com.example.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.HibernateUtil;

public class BeerAdvisor {
	
	@SuppressWarnings("unchecked")
	public List<Beer> getBeers(String color) {
		
		List<Beer> beers;		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();		
		Query query = session.getNamedQuery("beers_of_same_type");
		query.setString("color", color);
		beers = query.list();
		tx.commit();
		//session.close();
		// Shutting down the application
		//HibernateUtil.shutdown();		
		return beers;				
		
	}
}
