package com.cyebrtek.lamda.course;

public class Seenium implements Course {
    @Override
    public void study() {


        Course java=new Java();
        java.study();

        Course selenium= new Seenium();
        selenium.study();






        Course javaCourse= ()-> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse=()-> System.out.println("stuying selenium");
        seleniumCourse.study();

    }
}
