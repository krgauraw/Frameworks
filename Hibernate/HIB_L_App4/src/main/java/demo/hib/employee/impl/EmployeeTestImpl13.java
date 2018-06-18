package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * @author gauraw
 *
 */
public class EmployeeTestImpl13 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);

		criteria.setFirstResult(3); // count will start from 0 (Zero)
		criteria.setMaxResults(5);

		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
