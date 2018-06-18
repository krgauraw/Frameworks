package demo.hib.order.impl;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * get() returns null if data not found in db.
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl8 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();

		// data dosn't exist in db
		Order ord = (Order) session.get(Order.class, "ord507");

		System.out.println(ord); // null will be returned

		System.out.println("----");

		System.out.println(ord.getOrderId()); // throw NullPointerException from Here.
		System.out.println(ord.getCustomerName());
		System.out.println(ord.getQuantity());
		System.out.println(ord.getPrice());
		System.out.println("done");
	}

}