package com.cyebrtek.lamda.lamdaShape;

public class ShapeTest {
    public static void main(String[] args) {


        Drawable drawable= () -> System.out.println("Drawing a circle");

        drawable.draw();



        Drawable2 drawable2=(shape)-> System.out.println("Drawing a shape ");

        drawable2.draw("Triangle");



        Drawable3 drawable3=(shape,name)-> System.out.println(name +"is drawing a" +shape);

        drawable3.draw("circle","Mardan");



        Drawable4 drawable4=(shape, side) -> "Drawing a " +shape+ "and it si side is " +side;
        drawable4.draw("triangle",3);



    }
}
