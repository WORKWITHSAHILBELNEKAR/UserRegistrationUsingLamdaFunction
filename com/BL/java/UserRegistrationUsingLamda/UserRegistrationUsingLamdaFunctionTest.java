package com.BL.java.UserRegistrationUsingLamda;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationUsingLamdaFunctionTest {

    @Test
    public void testValidFirstName() {
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validateFirstName("Sahil"));
    }

    @Test
    public void testInvalidFirstName() {
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validateFirstName("sahil"));
    }

    @Test
    public void testValidLastName() {
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.ValidateLastName("Doe"));
    }

    @Test
    public void testInvalidLastName() {
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.ValidateLastName("doe"));
    }

    @Test
    public void testValidEmail() {
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.ValidEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() {
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.ValidEmail("abc.xyz@bl@co.in"));
    }

    @Test
    public void testValidMobile() {
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.ValidPhoneNumber("91 9919819801"));
    }

    @Test
    public void testInvalidMobile() {
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.ValidPhoneNumber("919919819801"));
    }

    @Test
    public void testValidPassword() {
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordMinLength("Password@123"));
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordUpperCase("Password@123"));
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordNumeric("Password@123"));
        Assert.assertTrue(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordSpecialChar("Password@123"));
    }

    @Test
    public void testInvalidPassword() {
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordMinLength("pass"));
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordUpperCase("password123"));
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordNumeric("Password@"));
        Assert.assertFalse(UserRegistrationUsingLamdaFunction.UserRegistration.validatePasswordSpecialChar("Password123"));
    }
}