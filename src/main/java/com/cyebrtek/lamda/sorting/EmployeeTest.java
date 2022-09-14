package com.cyebrtek.lamda.sorting;

import com.cyebrtek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1=new Employee(101,"Mardan",
                "Abla","Urumqi",new Role(1,"developper"));
        Employee e2=new Employee(102,"Mardan",
                "Abla","Urumqi",new Role(1,"qa"));
        Employee e3=new Employee(103,"Mardan",
                "Abla","Urumqi",new Role(1,"po"));
        Employee e4=new Employee(104,"Mardan",
                "Abla","Urumqi",new Role(1,"sm"));


        List<Employee> employeesList=new ArrayList<Employee>();
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);

        System.out.println(employeesList);

        employeesList.sort((emp1,emp2) ->emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));
        System.out.println(employeesList);

    }
}
