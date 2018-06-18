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
		// If Config file name is hibernate.cfg.xml, then we don't need to pass file name.
		config.configure("app-config.xml");
		sFactory = config.buildSessionFactory();
	}

	public static Session getSession() {
		return sFactory.openSession();

	}

}