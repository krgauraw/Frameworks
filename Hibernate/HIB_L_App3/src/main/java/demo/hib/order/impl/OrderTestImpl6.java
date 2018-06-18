package demo.hib.order.impl;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * @author gauraw
 *
 */
public class OrderTestImpl6 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();

		// load() throws ObjectNotFoundException if data not found in DB
		Order ord = (Order) session.load(Order.class, "ord501");
		System.out.println("----");
		System.out.println(ord.getOrderId());
		System.out.println(ord.getCustomerName());

	}

}