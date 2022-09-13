package com.cyebrtek.oop.abstraction.implemetation.service;

import com.cyebrtek.enums.Gender;
import com.cyebrtek.oop.abstraction.implemetation.UserServiceImplementation;
import com.cyebrtek.oop.encapsulation.Role;
import com.cyebrtek.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {


    @Override
    public String UserByRoleId(int id) {


        User user=new User("mike","mardan",new Role(id,"admin"),Gender.MALE);

        return user.getFirstName()+ " " +user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {

        User user=new User(firstName,"abla",new Role(1,"manager"), Gender.FEMALE);


        return user;
    }
}
