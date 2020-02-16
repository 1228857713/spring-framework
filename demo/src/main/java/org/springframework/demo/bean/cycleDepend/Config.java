package org.springframework.demo.bean.cycleDepend;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("org.springframework.demo")
public class Config {

}
