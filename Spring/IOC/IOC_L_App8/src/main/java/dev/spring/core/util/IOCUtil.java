package dev.spring.core.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Util class to provide factory/context instance
 * 
 * @author gauraw
 *
 */
public class IOCUtil {

	private static ApplicationContext context;

	static {
		context = new ClassPathXmlApplicationContext("app-config.xml");
	}

	public static Object getObject(String beanId) {
		return context.getBean(beanId);
	}
}
