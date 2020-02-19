package org.springframework.demo.core.anntotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.core.anntotation.bean.Person;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Person person = (Person) applicationContext.getBean("person");
		person.toString();
	}
}
