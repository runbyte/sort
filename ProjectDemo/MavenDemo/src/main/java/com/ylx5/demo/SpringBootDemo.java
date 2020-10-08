package com.ylx5.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ylx5.demo.dao")
public class SpringBootDemo {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootDemo.class, args);
		
	}

}
