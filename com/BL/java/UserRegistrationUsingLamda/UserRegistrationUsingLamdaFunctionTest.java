package com.BL.java.UserRegistrationUsingLamda;

import org.junit.Test;
import static org.junit.Assert.*;



class UserRegistrationUsingLamdaFunctionTest {


    @Test
    public void testFirstName() {
        assertTrue(UserRegistration.validateFirstName("John"));
        assertFalse(UserRegistration.validateFirstName("john"));
    }

    @Test
    public void testLastName() {
        assertTrue(UserRegistration.ValidateLastName("Doe"));
        assertFalse(UserRegistration.ValidateLastName("doe"));
    }

    @Test
    public void testEmail() {
        assertTrue(UserRegistration.ValidEmail("abc.xyz@bl.co.in"));
        assertFalse(UserRegistration.ValidEmail("abc@bl@com"));
    }

    @Test
    public void testPhoneNumber() {
        assertTrue(UserRegistration.ValidPhoneNumber("919876543210"));
        assertFalse(UserRegistration.ValidPhoneNumber("19876543210"));
    }

    @Test
    public void testPassword() {
        assertTrue(UserRegistration.validatePasswordMinLength("Password1!"));
        assertFalse(UserRegistration.validatePasswordMinLength("Pass1!"));

        assertTrue(UserRegistration.validatePasswordUpperCase("Password1!"));
        assertFalse(UserRegistration.validatePasswordUpperCase("password1!"));

        assertTrue(UserRegistration.validatePasswordNumeric("Password1!"));
        assertFalse(UserRegistration.validatePasswordNumeric("Password!"));

        assertTrue(UserRegistration.validatePasswordSpecialChar("Password1!"));
        assertFalse(UserRegistration.validatePasswordSpecialChar("Password1"));
    }
}
