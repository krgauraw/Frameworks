package demo.hib.order.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

import demo.hib.order.Order;
import demo.hib.util.DBUtil;

/**
 * @author gauraw
 *
 */
public class OrderTestImpl9 {

	public static void main(String[] args) {

		FileReader fReader = null;
		BufferedReader bReader = null;
		Order order = null;
		Session session = DBUtil.getSession();

		try {
			fReader = new FileReader(getResourceFile("data.txt"));
			bReader = new BufferedReader(fReader);
			String row = bReader.readLine();
			session.beginTransaction();
			String[] rowData;
			while (row != null) {
				rowData = row.split(",");
				order = new Order();
				order.setOrderId(rowData[0].trim());
				order.setCustomerName(rowData[1].trim());
				order.setQuantity(Integer.parseInt(rowData[2].trim()));
				order.setPrice(Integer.parseInt(rowData[3].trim()));
				session.save(order);
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
		System.out.println("done");
	}

	private static File getResourceFile(String fileName) {
		File file = new File(OrderTestImpl9.class.getResource("/" + fileName).getFile());
		return file;
	}

}
