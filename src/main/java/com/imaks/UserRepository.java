package com.imaks;

import java.util.*;

public class UserRepository {
    List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>(Arrays.asList(
                new User(11421, "John", "john@gmail.com"),
                new User(11422, "Alex", "alex@gmail.com"),
                new User(11423, "Jalil", "jalil@gmail.com"),
                new User(11424, "Dijkstra", "dijkstra@gmail.com"),
                new User(11425, "Viet", "viet@gmail.com")
        ));
    }

    public Optional<User> findUserById(int id){
        User userById = users.stream()
                .filter(user -> user.getId() == id)
                .findAny()
                .orElseGet(() -> {
                    System.out.println("User with such id doesn't exists");
                    return null;
                });
        return Optional.ofNullable(userById);
    }
    public Optional<User> findUserByEmail(String email){
        User userByEmail = users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findAny()
                .orElseGet(() -> {
                    System.out.println("User with such email doesn't exists");
                    return null;
                });
        return Optional.ofNullable(userByEmail);
    }
    public Optional<List<User>> findAllUsers(){
        return Optional.ofNullable(users);
    }
}
