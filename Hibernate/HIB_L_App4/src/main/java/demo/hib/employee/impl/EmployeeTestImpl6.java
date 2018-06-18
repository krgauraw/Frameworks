package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Read all data using "between"
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl6 {

	public static void main(String[] args) {

		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion ctr = Restrictions.between("salary", 40000, 50000); // salary between 40000 & 50000
		criteria.add(ctr);
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Record Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
