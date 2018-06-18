package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Restrict Number of Result, Uses of Order
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl11 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Order order = Order.asc("address"); // age in ascending order (order by age asc)
		criteria.addOrder(order);
		criteria.setMaxResults(4); // only first 4 result will be fetched.
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
