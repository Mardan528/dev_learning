package com.cyebrtek.enums;

import lombok.Getter;

@Getter
public enum Status {

   OPEN("Open"),IN_PROGRESS("Inprogress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");
   private final String value;
   Status(String value){
       this.value=value;
   }


}
