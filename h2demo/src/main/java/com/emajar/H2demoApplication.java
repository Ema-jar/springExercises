package com.emajar;

import com.emajar.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2demoApplication {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

}
