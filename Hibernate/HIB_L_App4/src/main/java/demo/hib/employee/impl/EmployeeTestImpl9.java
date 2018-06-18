package demo.hib.employee.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Fetch data using complex queries (combination of more than one query)
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl9 {

	public static void main(String[] args) {
		Session session = DBUtil.getSession();
		Criteria criteria = session.createCriteria(Employee.class);
		Criterion c1 = Restrictions.lt("salary", 40000); //salary < 40000
		Criterion c2 = Restrictions.ge("age", 30); // age >= 30
		Criterion c3 = Restrictions.or(c1, c2); // either salary < 40000 or age >= 30

		Criterion c4 = Restrictions.eq("address", "btm"); //address = "btm"
		Criterion c5 = Restrictions.eq("education", "mca"); //education ="mca"
		Criterion c6 = Restrictions.or(c4, c5); //either address = "btm" or education ="mca"

		Criterion c7 = Restrictions.and(c3, c6); // c3 and c7

		criteria.add(c7);
		List<Employee> employees = criteria.list();
		System.out.println("No Of Employee Record Found : " + employees.size());
		System.out.println("Employee Data:\n---------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
