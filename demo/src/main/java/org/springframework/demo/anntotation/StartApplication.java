package org.springframework.demo.anntotation;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.anntotation.bean.Person;

import java.util.Map;


// 使用注解的方式启动spring
public class StartApplication
{
	public static void main(String[] args) {

		// 初始化上下文
		/*
		 1.首先调用父类GenericApplicationContext的构造方法，初始化 beanFactory（new 出来的）

		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		applicationContext.scan("org.springframework.demo.anntotation.bean");

		//获取单个对象
//		Person wangzhen = (Person)applicationContext.getBean("wangzhen");
//		System.out.printf(wangzhen.toString());
//
//
//		// 根据 类 来获取对象
//		String []names =applicationContext.getBeanNamesForType(Person.class);
//		for (String name : names){
//			Person person = (Person)applicationContext.getBean(name);
//			System.out.printf(person.toString());
//		}
//
//		Map<String,Object> map =applicationContext.getBeansOfType(Object.class);
//		System.out.printf(map.toString());
		Person jiangshan1 = (Person)applicationContext.getBean("jiangshan");
		Person jiangshan2 = (Person)applicationContext.getBean("jiangshan");
		System.out.println(jiangshan1.hashCode()+"======"+jiangshan2.hashCode());


	}
}
