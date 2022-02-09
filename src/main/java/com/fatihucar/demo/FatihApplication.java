package com.fatihucar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FatihApplication {

	public static void main(String[] args) {
		SpringApplication.run(FatihApplication.class, args);
	}

}
