package demo.hib.order.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Fetch All Record using HQL
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl11 {

	public static void main(String[] args) {

		Session s1 = DBUtil.getSession();
		//HQL Using Query API. Query to fetch all record
		Query qry = s1.createQuery("from Order");
		List<Order> orders = qry.list();

		for (Order order : orders) {
			System.out.println("Order Id: " + order.getOrderId());
			System.out.println("Customer Name: " + order.getCustomerName());
			System.out.println("Price: " + order.getPrice());
			System.out.println("Quantity:" + order.getQuantity());
			System.out.println("------------------");
		}

	}

}