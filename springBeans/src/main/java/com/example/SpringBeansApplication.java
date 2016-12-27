package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.customBeans"})
@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

		String[] beans = context.getBeanDefinitionNames();
		Arrays.sort(beans);

		for(String bean : beans){
			System.out.println(bean);
		}
	}
}
