package com.BL.java.UserRegistrationUsingLamda;

import java.util.regex.Pattern;

public class UserRegistrationUsingLamdaFunction {

 public class UserRegistration {

  // UC1 validate first name
     public static boolean validateFirstName(String firstName) {
     return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
  }

  // UC2 Enter a valid last Name
     public static boolean ValidateLastName (String LastName){
         return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", LastName);
     }



 }
}
