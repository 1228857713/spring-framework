package org.springframework.demo.bean.cycleDepend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 1.BeanCurrentlyInCreationException 如果创建的相互依赖那么会报出这个异常

 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		TestA testA = (TestA) applicationContext.getBean("testA");
		System.out.println(testA.toString());
	}
}
