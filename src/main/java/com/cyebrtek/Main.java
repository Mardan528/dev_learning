package com.cyebrtek;

import com.cyebrtek.core.Loops;
import com.cyebrtek.core.Method;
import com.cyebrtek.core.SelectionStament;
import com.cyebrtek.enums.Gender;
import com.cyebrtek.enums.Status;
import com.cyebrtek.oop.abstraction.implemetation.UserServiceImplementation;
import com.cyebrtek.oop.abstraction.implemetation.service.UserService;
import com.cyebrtek.oop.encapsulation.Role;
import com.cyebrtek.oop.encapsulation.User;
import com.cyebrtek.oop.inheritance.BaseEntity;
import com.cyebrtek.oop.inheritance.Project;
import com.cyebrtek.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello worold ");


        //*****core*********

        Method method= new Method();

        method.methodA();
        method.mB("a");
        System.out.println("method.mC() = " + method.mC());
        Method.mE();



        //*****loop*********

        Loops.demoEach();
        Loops.demoForLoop();


        //*****if staitment*********

        SelectionStament.demoIfStatment();
        SelectionStament.demoSwtich();



        //*****encapsulation*********

        User user=new User("Mardan","Abla",new Role(2,"Manager"), Gender.MALE);


        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());




        //*****inheritance*********
        System.out.println("****************************");

        Project project=new Project(2, LocalDateTime.now(),1,LocalDateTime.now().minusHours(5),1,
                "pr001","Human resource ", new User("Mike","lee",new Role (1,"manager"),Gender.FEMALE)
                ,LocalDate.now(),LocalDate.now().plusMonths(6),Status.IN_PROGRESS,"HMRC detail information");


        System.out.println(project.getAsigneManager().getRole().getId());
        System.out.println(project.getEndDate());





        //*****iterface*********

        UserService userService=new UserService();

        System.out.println("userService.userByFirstName(\" murat\") = " + userService.userByFirstName(" murat").getLastName());


        //*****polymorphism*********

        Employee employee= new Employee();

        BaseEntity eomployee2=new Employee();
        UserServiceImplementation userServiceImplementation=new UserService();

        employee.getEmployeeHours();
        ((Employee) eomployee2).getEmployeeHours();



        //*****enum*********

        System.out.println(Gender.FEMALE);

        System.out.println(Status.IN_PROGRESS.getValue());




    }



}
