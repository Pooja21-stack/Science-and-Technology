package com.sci.technology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SciTechnologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SciTechnologyApplication.class, args);
	}

}
