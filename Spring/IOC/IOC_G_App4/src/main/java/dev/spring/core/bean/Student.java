package dev.spring.core.bean;

public class Student {

	private int sid;
	private String sName;

	public Student() {
		System.out.println("Student object is getting constructed....");
	}

	// init method - Post Construction of bean object, this method will be called
	public void init() {
		System.out.println("Student bean is going through init()....");
	}

	/*// destroy method - before destruction of bean object, this method will be invoked.
	public void destroy() {
		System.out.println("Stuent bean is going through destroy()....");
	}
	*/
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}
