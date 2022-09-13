package com.cyebrtek.core;

public class SelectionStament {


    public static void demoIfStatment(){

        String  userNamr="Mardan";

        if(userNamr.equals("Mardan")){

            System.out.println("passed");
        }else {

            System.out.println("fail");
        }


    }

    public static void demoSwtich(){

        String userName="abla";
        switch (userName){
            case "abla":
                System.out.println("pass");
                break;

                case "mardan":
                System.out.println("fail");
                break;

            default:
                System.out.println("invalid");

        }


    }


}
