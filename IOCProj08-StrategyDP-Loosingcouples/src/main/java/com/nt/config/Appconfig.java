package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@Configuration
@ComponentScan(basePackages = "com.nt.sbean")
@ImportResource("com/nt/cfig/applicationContext.xml")
public class Appconfig {
	


}
