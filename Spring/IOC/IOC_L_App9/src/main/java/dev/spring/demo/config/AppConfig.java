package dev.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import dev.spring.demo.model.Address;
import dev.spring.demo.model.Employee;

/**
 * @author gauraw
 *
 */
@Configuration
public class AppConfig {

	// Simple Bean Declaration
	/*
	@Bean
	@Scope("prototype") // scope can be declared with @Scope
	public Employee emp1() {
		return new Employee();
	}*/

	@Bean
	@Scope("prototype") // scope can be declared with @Scope
	public Employee employee() {
		return new Employee(address());
	}

	@Bean(initMethod = "init", destroyMethod = "clean") // init & destroy method can be configured with @Bean
	public Address address() {
		return new Address();
	}
}
