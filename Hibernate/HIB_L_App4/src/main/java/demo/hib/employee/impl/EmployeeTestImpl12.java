package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Uses of Order (order by <column> desc)
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl12 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Order order = Order.desc("salary"); // salary in descending order (order by salary desc)
		criteria.addOrder(order);
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
