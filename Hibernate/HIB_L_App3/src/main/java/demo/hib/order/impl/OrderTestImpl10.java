package demo.hib.order.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Fetch All Records from ORDER Table
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl10 {

	public static void main(String[] args) {

		Session s1 = DBUtil.getSession();

		Criteria ctr = s1.createCriteria(Order.class);
		// List all records matching above criteria.
		List<Order> orders = ctr.list();

		for (Order order : orders) {
			System.out.println("Order Id: " + order.getOrderId());
			System.out.println("Customer Name: " + order.getCustomerName());
			System.out.println("Price: " + order.getPrice());
			System.out.println("Quantity:" + order.getQuantity());
			System.out.println("------------------");
		}

	}

}