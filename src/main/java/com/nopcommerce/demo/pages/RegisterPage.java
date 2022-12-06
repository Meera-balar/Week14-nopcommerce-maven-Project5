package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    //2.19 Verify the text “Register”
    By registerText = By.xpath("//h1[text()='Register']");
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    //*************************************************************2.20 Fill the mandatory fields for Register*************************************//
    //Enter FirstName
    By firstNameField = By.id("FirstName");
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName+getAlphaNumericString(2));
    }
    //Enter LastName
    By lastNameField = By.id("LastName");
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName+getAlphaNumericString(2));
    }
    //Select Date
    By dateField = By.name("DateOfBirthDay");
    public void selectDateOfBirth(String date){
        selectByVisibleTextFromDropDown(dateField,date);
    }
    //Select month
    By monthField = By.name("DateOfBirthMonth");
    public void selectMonthOfBirth(String month){
        selectByVisibleTextFromDropDown(monthField,month);
    }
    //Select Year
    By yearField = By.name("DateOfBirthYear");
    public void selectYearOfBirth(String year){
        selectByVisibleTextFromDropDown(yearField,year);
    }
    //Enter Email
    By emailField = By.id("Email");
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    //Enter Password
    By passwordField = By.id("Password");
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    //Enter Confirm Password
    By confirmPasswordField = By.id("ConfirmPassword");
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    //2.21 Click on “REGISTER” Button
    By clickRegister = By.id("register-button");
    public void clickOnRegister(){
        clickOnElement(clickRegister);
    }
    //2.22 Verify the message “Your registration completed”
    By registrationCompleteText = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String getRegistrationCompleted(){
        return getTextFromElement(registrationCompleteText);
    }
    //2.23 Click on “CONTINUE” tab
    By clickContinue = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinueButton(){
        try {
            Thread.sleep(500);
            mouseHoverToElementAndClick(clickContinue);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }





}
