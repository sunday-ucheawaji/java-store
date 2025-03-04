package com.javacore.store;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class InMemoryUserRepository implements UserRepository{

    private HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        String email = user.getEmail();
        if (users.containsKey(email)){
            System.out.println("User already exist");
        }
        users.put(email, user);
    }

    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
