package org.springframework.demo.anntotation.bean;

import org.springframework.stereotype.Component;

@Component
public class PointDao2 implements IPointDao{
	private String name;
	public void query(){
		System.out.println("PointDao2....query");
	}


}
