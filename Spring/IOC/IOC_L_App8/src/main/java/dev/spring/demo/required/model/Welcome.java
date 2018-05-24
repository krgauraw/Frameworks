package dev.spring.demo.required.model;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author gauraw
 *
 */
public class Welcome {

	private String msg;

	public String getMsg() {
		return msg;
	}

	// @Required makes msg field mandatory
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
