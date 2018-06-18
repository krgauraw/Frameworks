package demo.hib.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author gauraw
 *
 */
public class DBUtil {
	private static SessionFactory sFactory;
	static {
		Configuration config = new Configuration();
		config.configure("app-config.xml");
		sFactory = config.buildSessionFactory();
	}

	public static Session getSession() {
		return sFactory.openSession();

	}

}