package org.jagan.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jagan.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(2);
		userDetails.setUserName("Second User");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(userDetails);		
		session.getTransaction().commit();

	}

}
