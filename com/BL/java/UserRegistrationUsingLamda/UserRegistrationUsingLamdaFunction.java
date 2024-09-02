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

  //UC3 Enter the valid email

     public static Boolean ValidEmail (String Email){
         return Pattern.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$", Email);
     }

  //UC4 Enter a valid phone no

    public static boolean ValidPhoneNumber (String Phone){
         return Pattern.matches("^[0-9]{2}[0-9]{10}$" , Phone);
    }

    // UC5 - Password Minimum Length Validation
     public static boolean validatePasswordMinLength(String password) {
         return password.length() >= 8;
     }

     // UC6 - Password At least 1 Upper Case Validation
     public static boolean validatePasswordUpperCase(String password) {
         return Pattern.matches(".*[A-Z].*", password);
     }

     // UC7 - Password At least 1 Numeric Validation
     public static boolean validatePasswordNumeric(String password) {
         return Pattern.matches(".*[0-9].*", password);
     }
     // UC8 - Password Exactly 1 Special Character Validation
     public static boolean validatePasswordSpecialChar(String password) {
         return Pattern.matches(".*[!@#$%^&*()].*", password);
     }

     //UC 9 - Should clear all email sample provided separately

        public static boolean validateEmailSamples(String email) {
            return Pattern.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$", email);
        }



    }
}
