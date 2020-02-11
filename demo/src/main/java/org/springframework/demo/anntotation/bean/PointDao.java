package org.springframework.demo.anntotation.bean;

import org.springframework.stereotype.Component;

@Component
public class PointDao {
	private String name;
	public void Query(){
		System.out.println("query====="+this.name);
	}
}
