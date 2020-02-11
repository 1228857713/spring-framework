package org.springframework.demo.anntotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.anntotation.bean.PointService;

public class TestAutowire {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		PointService pointService = (PointService) applicationContext.getBean("pointService");
		pointService.query();

	}
}
