package com.cyebrtek.lamda.sorting;

import com.cyebrtek.oop.encapsulation.Role;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLasttName;
    private String employeeCity;
    private Role role;

}
