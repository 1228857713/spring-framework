package org.springframework.demo.core.anntotation.bean;

import org.springframework.stereotype.Component;

@Component
public class PointDao1 implements IPointDao{
	private String name;
	public void query(){
		System.out.println("PointDao1....query");
	}


}
