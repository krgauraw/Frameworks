package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Fetch data using multiple Restrictions
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl7 {

	public static void main(String[] args) {
		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion c1 = Restrictions.lt("salary", 40000); //salary < 40000
		Criterion c2 = Restrictions.gt("age", 30); // age > 30
		criteria.add(c1);
		criteria.add(c2);
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Record Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
