package org.springframework.demo.bean.factoryBean;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 表示这是一个配置文件
@Configurable
// 扫描这个文件夹下面的所有类
@ComponentScan("org.springframework.demo" )
public class Config {
}
