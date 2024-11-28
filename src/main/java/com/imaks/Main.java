package com.imaks;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        userRepository.findUserById(11425)
                .ifPresent(System.out::println);//exists
        userRepository.findUserById(414342)
                .ifPresent(System.out::println);//doesn't exists
        userRepository.findUserByEmail("jalil@gmail.com")
                .ifPresent(System.out::println);//exists
        userRepository.findUserByEmail("sgfdhjalil@gmail.com")
                .ifPresent(System.out::println);//doesn't exists
        userRepository.findAllUsers().ifPresent(System.out::println);
    }

}