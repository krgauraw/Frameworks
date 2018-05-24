package dev.spring.demo.jsr.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author gauraw
 *
 */
public class Greet {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {
		System.out.println("bean is going through init...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("bean is going through destroy...");
	}
}
