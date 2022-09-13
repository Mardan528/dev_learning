package com.cyebrtek.collection;

import com.cyebrtek.enums.Gender;
import com.cyebrtek.oop.encapsulation.Role;
import com.cyebrtek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {


    public static  void createList(){


        List<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(20);


    }


    public static void createUserList(){

        List<User> userList= new ArrayList<>();
        userList.add(new User("mike","smith",new Role(1,"manger"), Gender.MALE));
        userList.add(new User("mardan","smith",new Role(1,"employee"), Gender.MALE));





    }



    public static List<Role> crateRoleList(){

        List<Role> roleList=new ArrayList<>();
        roleList.add(new Role(1,"manager"));
        roleList.add(new Role(2,"admin"));
        roleList.add(new Role(3,"employee"));


        return roleList;




    }
}
