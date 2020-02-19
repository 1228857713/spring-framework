package org.springframework.demo.core.anntotation;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.demo.core.anntotation.bean.Person;


// 表示这是一个配置文件
@Configurable
// 扫描这个文件夹下面的所有类
@ComponentScan("org.springframework.demo.core.anntotation")
public class Config {

}
