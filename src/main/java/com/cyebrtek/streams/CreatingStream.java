package com.cyebrtek.streams;

import com.cyebrtek.collection.ArrayLists;
import com.cyebrtek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {


        //Creatiung stream from an array


        String [] courses={"java","JS","TS","TS","API","Selenium"};
        Stream<String>  courseStream= Arrays.stream(courses);


        //creating a stream from collection
        Stream<Role> roleStream= ArrayLists.crateRoleList().stream();

        //creating a stream from specified value
        Stream<Integer> stream=Stream.of(1,2,3,4,5,6);



    }

}
