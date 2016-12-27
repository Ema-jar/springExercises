package com.example;

import com.customBeans.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.customBeans", "com.example"})
@SpringBootApplication
public class SpringBeansApplication {

	@Bean
	public Computer computer(){
		return new Computer("12A34B", "Intel", "300$");
	}

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBeansApplication.class, args);

		String[] beans = context.getBeanDefinitionNames();
		Arrays.sort(beans);

		for(String bean : beans){
			System.out.println(bean);
		}

		System.out.println(context.getBean("computer").toString());
	}
}
