package com.example.SpringBoot1;

import com.example.SpringBoot1.bean.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot1Application.class, args);

		// Retrieve EmployeeBean from ApplicationContext (IoC Demonstration)
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		System.out.println("IoC Container Managed Bean: " + employee.getEmployeeDetails());
	}
}
