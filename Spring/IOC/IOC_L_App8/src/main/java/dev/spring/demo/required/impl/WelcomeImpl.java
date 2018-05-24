package dev.spring.demo.required.impl;

import dev.spring.core.util.IOCUtil;
import dev.spring.demo.required.model.Welcome;

/**
 * Test Impl to demonstrate use of @Required annotation
 * 
 * @author gauraw
 *
 */
public class WelcomeImpl {

	public static void main(String[] args) {
		Welcome obj = (Welcome) IOCUtil.getObject("welcome"); // Here "welcome" is bean id
		System.out.println(obj.getMsg());
	}
}
