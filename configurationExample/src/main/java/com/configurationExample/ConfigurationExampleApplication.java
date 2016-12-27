package com.configurationExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.customBeans"})
@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationExampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ConfigurationExampleApplication.class, args);

		String[] beans = context.getBeanDefinitionNames();
		Arrays.sort(beans);

		for(String bean : beans){
			System.out.println(bean);
		}

		System.out.println(context.getBean("person"));

	}
}
