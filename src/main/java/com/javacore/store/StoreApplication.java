package com.javacore.store;

import com.javacore.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		var user = new User();
		user.getEmail();
//		var orderService = context.getBean(OrderService.class);
//		var orderService = new OrderService(new StripePaymentService());
//		orderService.setPaymentService(new StripePaymentService()); // Setter Injection
//		orderService.placeOrder();

//		var notificationManagerService = context.getBean(NotificationManager.class);
//		notificationManagerService.sendNotification("Kindly activate your e-sim");

//		var userService = context.getBean(UserService.class);
//		userService.registerUser(new User(1L, "sunday@gmail.com", "1234", "Sunday"));
//		userService.registerUser(new User(1L, "james@gmail.com", "1234", "Sunday"));

	}

}
