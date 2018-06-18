package demo.hib.order.impl;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Read Data From DB using load().
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl2 {
	public static void main(String[] args) {

		Session session = DBUtil.getSession();

		//Read Data using load(). load() follow lazy loading property which is by default true.

		Order obj = (Order) session.load(Order.class, "ord102");

		System.out.println("Order Id: " + obj.getOrderId());
		System.out.println("-------------------------");
		System.out.println("Customer Name: " + obj.getCustomerName());
		System.out.println("Queantity: " + obj.getQuantity());
		System.out.println("Price: " + obj.getPrice());

	}

}