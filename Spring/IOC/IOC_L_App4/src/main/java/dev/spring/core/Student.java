package dev.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Student Bean Class
 * 
 * @author gauraw
 *
 */
public class Student {
	private int studentId;
	private String studentName;
	private char gender;
	private String[] skills;
	@SuppressWarnings("rawtypes")
	private List education;
	@SuppressWarnings("rawtypes")
	private Set projects;
	@SuppressWarnings("rawtypes")
	private Map subjectWithMarks;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char sex) {
		this.gender = sex;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@SuppressWarnings("rawtypes")
	public List getEducation() {
		return education;
	}

	@SuppressWarnings("rawtypes")
	public void setEducation(List education) {
		this.education = education;
	}

	@SuppressWarnings("rawtypes")
	public Set getProjects() {
		return projects;
	}

	@SuppressWarnings("rawtypes")
	public void setProjects(Set projects) {
		this.projects = projects;
	}

	@SuppressWarnings("rawtypes")
	public Map getSubjectWithMarks() {
		return subjectWithMarks;
	}

	@SuppressWarnings("rawtypes")
	public void setSubjectWithMarks(Map subjectWithMarks) {
		this.subjectWithMarks = subjectWithMarks;
	}

}