package com.example.chapter03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Chapter03Application {
	//Context：Beanを保存する場所
	private static ApplicationContext app;
	public static void main(String[] args) {
		SpringApplication.run(Chapter03Application.class, args);
		
		//DI使わない
		MyBean bean1 = new MyBean("This is Bean sample!");
		System.out.println(bean1);

		//DIフィールドインジェクションver
		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBeanInterface bean2 = (MyBeanInterface)app.getBean("mybean2");
		System.out.println(bean2);

		//DIコンストラクタver


	}

}
