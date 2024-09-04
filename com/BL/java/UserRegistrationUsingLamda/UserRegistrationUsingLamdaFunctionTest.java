package com.BL.java.UserRegistrationUsingLamda;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserRegistrationUsingLamdaFunctionTest {

    @Test
    public void testValidFirstName() {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validateFirstName.validate("Sahil"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validateFirstName.validate("sahil"));
    }

    @Test
    public void testValidLastName() {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validateLastName.validate("Doe"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validateLastName.validate("doe"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validateEmail.validate("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validateEmail.validate("abc.xyz@bl@co.in"));
    }

    @Test
    public void testValidMobile() {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePhoneNumber.validate("91 9919819801"));
    }

    @Test
    public void testInvalidMobile() {
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePhoneNumber.validate("919919819801"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordMinLength.validate("Password@123"));
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordUpperCase.validate("Password@123"));
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordNumeric.validate("Password@123"));
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordSpecialChar.validate("Password@123"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordMinLength.validate("pass"));
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordUpperCase.validate("password123"));
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordNumeric.validate("Password@"));
        assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordSpecialChar.validate("Password123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "test.sds@example.co.ij",
            "user.name+tag+sorting@example.com",
            "user.name@example.co.uk"
    })
    void validEmail(String email) {
        assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validateEmail.validate(email));
    }
}
