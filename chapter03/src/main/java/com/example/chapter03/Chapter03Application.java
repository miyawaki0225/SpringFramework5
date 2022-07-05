package com.example.chapter03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter03Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter03Application.class, args);
		MyBean bean = new MyBean("This is Bean sample!");
		System.out.println(bean);
	}

}
