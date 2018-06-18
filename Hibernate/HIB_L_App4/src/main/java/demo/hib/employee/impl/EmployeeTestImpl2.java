package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Read all data without any Restriction
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl2 {

	public static void main(String[] args) {
		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> employeeList = criteria.list();
		System.out.println("Employee Data:");
		System.out.println("--------------------------");
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
	}
}
