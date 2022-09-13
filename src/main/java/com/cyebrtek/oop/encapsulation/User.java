package com.cyebrtek.oop.encapsulation;


import com.cyebrtek.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.ref.PhantomReference;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;


}
