package org.springframework.demo.bean.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 说明：
 * 		1. 这个例子用来说明 FactoryBean 的作用，如果一个Bean 实现了FactoryBean
 * 	       那么 applicationContext.getBean() 返回的 值就不是 Bean 本身而是 FactoryBnan.getObject 返回的对象
 * 	    2.如果名字 加了 & 字符就返回的是 本身这个对象
 *
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Car car = (Car) applicationContext.getBean("carFactoryBean");
		System.out.println(car.toString());

		Object object =applicationContext.getBean("&carFactoryBean");

		System.out.println(object.toString());



	}
}
