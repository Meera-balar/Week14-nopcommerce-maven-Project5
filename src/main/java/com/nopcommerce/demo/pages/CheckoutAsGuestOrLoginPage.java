package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutAsGuestOrLoginPage extends Utility {
    //2.20 Verify the Text “Welcome, Please Sign In!”
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String getWelcomePleaseSignInText(){
        return getTextFromElement(welcomeText);
    }
    //2.21 Click on “CHECKOUT AS GUEST” Tab
    By clickCheckout = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public void clickOnCheckoutAsGuest(){
        clickOnElement(clickCheckout);
    }


    //2.18 Click on “Register” Tab
    By clickRegister = By.xpath("//button[contains(text(),'Register')]");
    public void clickOnRegisterTab(){
        clickOnElement(clickRegister);
    }




}
