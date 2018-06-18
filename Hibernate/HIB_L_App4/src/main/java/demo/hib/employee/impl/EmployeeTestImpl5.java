package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Read data using like operator
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl5 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.like("address", "%halli")); // address like %halli%
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
