package dev.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Test Program
 * 
 * @author gauraw
 *
 */
public class StudentImpl {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("spring-config.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(cpr);

		Student s1 = (Student) factory.getBean("studentDetails");

		System.out.println("Student Id: " + s1.getStudentId());
		System.out.println("Student Name: " + s1.getStudentName());
		System.out.println("Gender: " + s1.getGender());

		System.out.print("Skills: ");
		for (String str : s1.getSkills()) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("Education: " + s1.getEducation());
		System.out.println("Projects: " + s1.getProjects());
		System.out.println("Subjects & Marks: " + s1.getSubjectWithMarks());
	}
}
