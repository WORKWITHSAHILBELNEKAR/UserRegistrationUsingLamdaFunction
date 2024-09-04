package com.BL.java.UserRegistrationUsingLamda;

import java.util.regex.Pattern;

public class UserRegistrationUsingLamdaFunction {

    class InvalidUserDetailException extends Exception {
        public InvalidUserDetailException(String message) {
            super(message);
        }
    }
    public interface Validation {
        boolean validate(String input);
    }


    public static class UserRegistration {

        // UC1: Validate First Name
        public static Validation validateFirstName = firstName ->
                Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);

        // UC2: Validate Last Name
        public static Validation validateLastName = lastName ->
                Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName);

        // UC3: Validate Email
        public static Validation validateEmail = email ->
                Pattern.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$", email);

        // UC4: Validate Phone Number
        public static Validation validatePhoneNumber = phoneNumber ->
                Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", phoneNumber);

        // UC5: Password Minimum Length Validation
        public static Validation validatePasswordMinLength = password ->
                password.length() >= 8;

        // UC6: Password At Least 1 Upper Case Validation
        public static Validation validatePasswordUpperCase = password ->
                Pattern.matches(".*[A-Z].*", password);

        // UC7: Password At Least 1 Numeric Validation
        public static Validation validatePasswordNumeric = password ->
                Pattern.matches(".*[0-9].*", password);

        // UC8: Password Exactly 1 Special Character Validation
        public static Validation validatePasswordSpecialChar = password ->
                Pattern.matches(".*[!@#$%^&*()].*", password);
    }
}
