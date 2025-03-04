package com.javacore.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private NotificationService2 notificationService2;

    public UserService(UserRepository userRepository, NotificationService2 notificationService2){
        this.userRepository = userRepository;
        this.notificationService2 = notificationService2;
    }

    public void registerUser(User user){
        if (userRepository.findByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("User with email "+ user.getEmail() + " already exist.");
        }
        userRepository.save(user);
        notificationService2.send("Registration successful!", user.getEmail());
    }
}
