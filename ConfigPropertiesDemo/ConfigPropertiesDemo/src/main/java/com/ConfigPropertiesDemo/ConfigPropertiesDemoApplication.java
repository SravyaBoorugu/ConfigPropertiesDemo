package com.ConfigPropertiesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.ConfigPropertiesDemo.Component.ConfigPropertiesComponent;

@SpringBootApplication
//@ComponentScan(basePackages={"com.ConfigPropertiesDemo.Component","com.ConfigPropertiesDemo.Controller"})
@EnableConfigurationProperties(ConfigPropertiesComponent.class)
public class ConfigPropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
	}

}
