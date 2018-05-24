package dev.spring.core;

/**
 * @author gauraw
 *
 */
public class Welcome {

	private String welcomeMsg;

	public Welcome() {
		System.out.println("Welcome object is getting constructed...");
	}

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		System.out.println("Setting welcomeMsg property value..");
		this.welcomeMsg = welcomeMsg;
	}

	public void greetCustomer() {
		System.out.println(welcomeMsg);
	}

}
