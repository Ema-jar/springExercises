package com.beansExample;

import com.customBeans.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.customBeans"})
@SpringBootApplication
public class BeansExampleApplication {


	@Bean
	public Person getPersonBean(){
		return new Person("Emanuele", "Giarlini", 10);
	}

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(BeansExampleApplication.class, args);


		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String name : beanNames){
			System.out.println(name);
		}
	}
}
