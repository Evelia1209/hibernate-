package Demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import pojo.User;

public class UserDemo {
	public static void main(String[] args) {
		
		User user = new User("zhangsan", "123", 4);
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Configuration configuration = new Configuration();
		System.out.println("11111111");
//		configuration.configure("hibernate.cfg.xml");
		

//		System.out.println("2");
//		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
//		standardServiceRegistryBuilder.applySettings(configuration.getProperties());
	
//		SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());

		Session session = sessionFactory.openSession();
		
		Transaction trans = session.beginTransaction();
		
		session.save(user);
		
		trans.commit();
		
		session.close();
	
	
	
	}
}
