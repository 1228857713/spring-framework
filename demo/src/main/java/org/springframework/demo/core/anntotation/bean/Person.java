package org.springframework.demo.core.anntotation.bean;




import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
