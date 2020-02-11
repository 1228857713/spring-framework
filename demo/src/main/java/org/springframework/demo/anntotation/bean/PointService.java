package org.springframework.demo.anntotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PointService {
	@Autowired
	private  PointDao pointDao;

	private String pointName;

	public void query(){
		this.pointDao.Query();
	}
}
