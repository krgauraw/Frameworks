package demo.hib.student;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import demo.hib.util.HIBUtil;

/**
 * @author gauraw
 *
 */
public class StudentTestImpl {

	public static void main(String[] args) {

		Student student = new Student();
		//student.setRollNum(10); // No Need to set primary key value, if @GeneratedValue is used in model class
		student.setName("Vijay");
		student.setAddress("BTM");
		student.setDateOfBirth(new Date());

		//SessionFactory sessionFactory = new AnnotationConfiguration().configure("app-config.xml").buildSessionFactory();
		SessionFactory sessionFactory = HIBUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student object into the database
		session.save(student);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
