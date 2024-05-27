package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		Employee e = (Employee) appContext.getBean("e1");
		System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getAddress().getCity() + ","
				+ e.getAddress().getState() + "," + e.getAddress().getCountry());
	}
}
