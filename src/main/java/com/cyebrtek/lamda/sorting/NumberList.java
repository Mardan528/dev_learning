package com.cyebrtek.lamda.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {


        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(55);
        list.add(56);
        list.add(95);
        list.add(51);
        Collections.sort(list);
        System.out.println(list);



        Collections.sort(list,new MyComprator());
        System.out.println(list);

        //with lamda
        //Ascending order
        Collections.sort(list);


        //Descending order

        Collections.sort(list,((o1,o2) -> (o1>o2)?-1 : (o2>o1)?1:0));
        System.out.println(list);



        //Ascending order
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);


        //Descending order
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);


    }
}
