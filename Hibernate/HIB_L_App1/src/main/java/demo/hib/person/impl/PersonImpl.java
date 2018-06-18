package demo.hib.person.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.hib.person.pojo.Person;

public class PersonImpl {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setfName("Kumar");
		p1.setlName("Gauraw");
		p1.setAge(24);
		Configuration c1 = new Configuration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		s1.beginTransaction();
		String val = (String) s1.save(p1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("Record Inserted Successfully for : " + val);
	}
}