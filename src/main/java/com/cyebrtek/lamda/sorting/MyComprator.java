package com.cyebrtek.lamda.sorting;

import java.util.Comparator;

public class MyComprator  implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>02)?-1:(o1<o2)?1 :0;
    }


//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1>o2){
//
//            return -1;
//        }else if(o1<o2){
//
//            return 1;
//        }else {
//            return 0;
//        }
//    }
}