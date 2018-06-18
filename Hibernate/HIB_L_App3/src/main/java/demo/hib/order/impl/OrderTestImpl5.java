package demo.hib.order.impl;

import java.util.Scanner;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * Insert Record into DB .
 * 
 * @author gauraw
 *
 */
public class OrderTestImpl5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Session session = DBUtil.getSession();
		Order ord = null;
		session.beginTransaction();

		do {
			ord = new Order();
			System.out.println("enter order id");
			ord.setOrderId(scanner.next());

			System.out.println("enter customer name");
			ord.setCustomerName(scanner.next());
			System.out.println("enter quantity");
			ord.setQuantity(Integer.parseInt(scanner.next()));
			System.out.println("enter price");
			ord.setPrice(Integer.parseInt(scanner.next()));

			session.save(ord);
			System.out.println("do you want insert more?(y/n)");

		} while ("y".equals(scanner.next()));
		scanner.close();
		session.getTransaction().commit();
		System.out.println("done");

	}

}