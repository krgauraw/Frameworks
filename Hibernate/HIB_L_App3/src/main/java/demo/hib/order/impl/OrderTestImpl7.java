package demo.hib.order.impl;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Read Data from DB using get().
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl7 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		//Read data from db using get().
		Order ord = (Order) session.get(Order.class, "ord102");

		System.out.println("----");
		System.out.println(ord.getOrderId());
		System.out.println(ord.getCustomerName());
		System.out.println(ord.getQuantity());
		System.out.println(ord.getPrice());

		System.out.println("done");
	}

}