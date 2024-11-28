package com.imaks;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UserRepository {
    static List<User> users = new ArrayList<>();

    public static Optional<User> findUserById(int id){
        User userById = users.stream()
                .filter(user -> user.getId() == id)
                .findAny()
                .orElseGet(() -> {
                    System.out.println("User with such id doesn't exists");
                    return null;
                });
        return Optional.ofNullable(userById);
    }
    public static Optional<User> findUserByEmail(String email){
        User userByEmail = users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny()
                .orElseGet(() -> {
                    System.out.println("User with such email doesn't exists");
                    return null;
                });
        return Optional.ofNullable(userByEmail);
    }
    public static Optional<List<User>> findAllUsers(){
        return Optional.ofNullable(users);
    }
}
