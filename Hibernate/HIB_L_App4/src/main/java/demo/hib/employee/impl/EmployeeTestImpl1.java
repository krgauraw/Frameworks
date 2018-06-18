package demo.hib.employee.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

import demo.hib.employee.Employee;
import demo.hib.util.DBUtil;

/**
 * Load Data into EMPLOYEE Table for Rest of Test Impls
 * 
 * @author gauraw
 *
 */
public class EmployeeTestImpl1 {

	private static File getResourceFile(String fileName) {
		File file = new File(EmployeeTestImpl1.class.getResource("/" + fileName).getFile());
		return file;
	}

	public static void main(String[] args) {

		FileReader fReader = null;
		BufferedReader bReader = null;
		Employee employee = null;
		Session session = DBUtil.getSession();

		try {
			fReader = new FileReader(getResourceFile("Employee.txt"));
			bReader = new BufferedReader(fReader);
			String row = bReader.readLine();
			session.beginTransaction();
			String[] rowData;
			while (row != null) {
				rowData = row.split(",");
				employee = new Employee();
				employee.setId(Integer.parseInt(rowData[0].trim()));
				employee.setName(rowData[1].trim());
				employee.setAddress(rowData[2].trim());
				employee.setEducation(rowData[3].trim());
				employee.setAge(Integer.parseInt(rowData[4].trim()));
				employee.setSalary(Integer.parseInt(rowData[5].trim()));
				session.save(employee);
				row = bReader.readLine();

			}
			session.getTransaction().commit();

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
			try {
				if (null != bReader)
					bReader.close();
				if (null != fReader)
					fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data Inserted Successfully");
	}
}
