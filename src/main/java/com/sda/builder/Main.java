package com.sda.builder;

public class Main {
    public static void main(String[] args) {


        User user = User.UserBuilder.anUser()

            .withAge(21)
                .build();

        System.out.println(user.getAge());



    }
}
