package com.imaks;

import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        UserRepository.users.addAll(List.of(
                new User(11421, "John", "john@gmail.com"),
                new User(11422, "Alex", "alex@gmail.com"),
                new User(11423, "Jalil", "jalil@gmail.com"),
                new User(11424, "Dijkstra", "dijkstra@gmail.com"),
                new User(11425, "Viet", "viet@gmail.com")
        ));
        findById(11425);//exists
        findById(414342);//doesn't exists
        findByEmail("jalil@gmail.com");//exists
        findByEmail("sgfdhjalil@gmail.com");//doesn't exists
        findAll();
    }

    public static void findById(int id){
        UserRepository.findUserById(id)
                .ifPresent(System.out::println);
    }
    public static void findByEmail(String email){
        UserRepository.findUserByEmail(email)
                .ifPresent(System.out::println);
    }
    public static void findAll(){
        UserRepository.users.forEach(System.out::println);
    }

}