package com.javacore.store;


import com.javacore.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var user = User.builder()
				.name("John")
				.password("password")
				.email("john@codewithmosh.com")
				.build();
		System.out.println(user.getName());
	}

}
