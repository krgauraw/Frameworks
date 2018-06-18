package demo.hib.order.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Update Record without any change in data
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl4 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Order o1 = (Order) session.load(Order.class, "ord101");
		Transaction tx = session.beginTransaction();

		// if there is no change in data, framework won't go for Record Update, even don't fetch data from db because of lazy loading.
		session.update(o1);
		tx.commit();
		System.out.println("done");

	}

}