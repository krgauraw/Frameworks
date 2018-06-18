package demo.hib.order.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Insert Record into DB.
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl1 {
	public static void main(String[] args) {
		Order o1 = new Order();
		o1.setOrderId("ord101");
		o1.setCustomerName("vijay");
		o1.setQuantity(22);
		o1.setPrice(30000);

		Order o2 = new Order();
		o2.setOrderId("ord102");
		o2.setCustomerName("kiran");
		o2.setQuantity(50);
		o2.setPrice(60000);

		Session session = DBUtil.getSession();
		Transaction tx = session.beginTransaction();

		session.save(o1);
		session.save(o2);

		tx.commit();
		session.flush();
		session.close();
		System.out.println("Record Inserted Successfully");
	}

}