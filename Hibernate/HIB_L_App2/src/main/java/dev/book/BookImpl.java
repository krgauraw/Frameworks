package dev.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author gauraw
 *
 */
public class BookImpl {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBookTitle("Introduction to Java");
		b1.setAuthorName("Kumar Gauraw");
		b1.setPublishYear(2018);

		Configuration c1 = new Configuration();
		c1.configure("app-config.xml");
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		s1.beginTransaction();
		int val = (Integer) s1.save(b1);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("Record Inserted Successfully : " + val);
	}
}