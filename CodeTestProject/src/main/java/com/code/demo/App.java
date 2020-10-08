package com.code.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author byte
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.code.demo.mapper")
@EnableSwagger2
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

}
