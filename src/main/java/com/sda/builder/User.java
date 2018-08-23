package com.sda.builder;

import jdk.nashorn.internal.runtime.UserAccessorProperty;

public class User {
    private String name;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String email;
    private String telephoneNumber;
    private int age;


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public static final class UserBuilder {
        private String name;
        private String lastName;
        private String address;
        private String city;
        private String postalCode;
        private String email;
        private String telephoneNumber;
        private int age;

        private UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder withTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public UserBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            User user = new User();
            user.lastName = this.lastName;
            user.name = this.name;
            user.city = this.city;
            user.telephoneNumber = this.telephoneNumber;
            user.address = this.address;
            user.postalCode = this.postalCode;
            user.age = this.age;
            user.email = this.email;
            return user;
        }
    }
}
