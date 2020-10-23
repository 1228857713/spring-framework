package org.springframework.demo.test;

import java.util.HashSet;
import java.util.Set;

public class testSet {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		for(int i=0;i<10;i++){
			set.add(new Person("王震",10));

		}
		System.out.println(set.size());
	}
}
