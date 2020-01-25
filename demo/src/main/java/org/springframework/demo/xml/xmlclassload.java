package org.springframework.demo.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.demo.xml.beans.Person;


// 通过xml 的方式 在application 中获取bean
public class xmlclassload {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person.xml");
		Person wangzhen = applicationContext.getBean("wangzhen",Person.class);
		Person wanguolan = applicationContext.getBean("wanguolan",Person.class);
		System.out.println(wangzhen.toString());
		System.out.println(wanguolan.toString());
	}
}
