package demo.hib.order.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Update Record
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl3 {
	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		// for load(), no need to open a transaction.
		Order ord = (Order) session.load(Order.class, "ord102");

		ord.setPrice(1000);
		ord.setQuantity(5000);

		Transaction tx = session.beginTransaction();
		session.update(ord);
		tx.commit();

		session.flush();
		session.close();
		System.out.println("Record Update Successfully.");

	}

}