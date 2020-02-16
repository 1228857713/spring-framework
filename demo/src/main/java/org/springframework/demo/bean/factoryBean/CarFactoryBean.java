package org.springframework.demo.bean.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CarFactoryBean implements FactoryBean<Car> {
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setName("wangzhen 的车");
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}


}
