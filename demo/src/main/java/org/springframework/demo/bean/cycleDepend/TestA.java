package org.springframework.demo.bean.cycleDepend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TestA {
	@Autowired
	TestB testB;



	public void setTestB(TestB testB) {
		this.testB = testB;
	}

	public TestA(TestB testB) {
		this.testB = testB;
	}
}
