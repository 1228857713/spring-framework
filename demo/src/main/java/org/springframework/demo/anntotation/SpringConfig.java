package org.springframework.demo.anntotation;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.demo.anntotation.bean.Person;


// 表示这是一个配置文件
@Configurable
// 扫描这个文件夹下面的所有类
@ComponentScan("org.springframework.demo.anntotation" )
public class SpringConfig {

	@Bean
	public Person wangzhen(){
		Person p = new Person();
		p.setAge(18);
		p.setName("王震");
		p.setSex("nan");
		return p;

	}

	@Bean
	public Person wanguolan(){
		Person p = new Person();
		p.setAge(18);
		p.setName("wangguolan");
		p.setSex("nv");
		return p;

	}
}
