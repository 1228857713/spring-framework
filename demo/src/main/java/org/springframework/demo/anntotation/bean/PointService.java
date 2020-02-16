package org.springframework.demo.anntotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PointService {
	@Autowired
	@Qualifier(value = "pointDao1")
	private  IPointDao pointDao;

	private String pointName;

	public void query(){
		this.pointDao.query();
	}
}
