package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CellPhonesPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumia1020CellPhoneProductPage nokiaLumia1020CellPhoneProductPage = new NokiaLumia1020CellPhoneProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestOrLoginPage checkoutAsGuestOrLoginPage = new CheckoutAsGuestOrLoginPage();
    RegisterPage registerPage = new RegisterPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhoneLinkAndClick();
        Assert.assertEquals(cellPhonesPage.getCellPhoneText(),"Cell phones","User not navigate to cell phone page");

    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully (){
        homePage.mouseHoverToElectronicTab();
        homePage.mouseHoverToCellPhoneLinkAndClick();
        Assert.assertEquals(cellPhonesPage.getCellPhoneText(),"Cell phones","User not navigate to cell phone page");
        cellPhonesPage.clickOnListViewTab();
        cellPhonesPage.clickOnNokiaLumia1020CellPhone();
        Assert.assertEquals(nokiaLumia1020CellPhoneProductPage.getNokiaLumia1020Text(),"Nokia Lumia 1020"," User Not Navigate to nokia lumia product page");
        Assert.assertEquals(nokiaLumia1020CellPhoneProductPage.getTotal(),"$349.00","Product price not matched");
        nokiaLumia1020CellPhoneProductPage.changeTheQuantityTo("2");
        nokiaLumia1020CellPhoneProductPage.clickOnAddToCartButton();
        Assert.assertEquals(nokiaLumia1020CellPhoneProductPage.getProductAddedSuccessfullyText(),"The product has been added to your shopping cart","Product not added to Cart");
        nokiaLumia1020CellPhoneProductPage.clickOnCrossButtonOnGreenBar();
        nokiaLumia1020CellPhoneProductPage.mouseHoverOnShoppingCart();
        nokiaLumia1020CellPhoneProductPage.clickOnGoToCart();
        Assert.assertEquals(shoppingCartPage.getShoppingCartPageText(),"Shopping cart","User not navigate to shopping cart page");
        Assert.assertEquals(shoppingCartPage.getQuantityDisplayedOnPage("value"),"2","Quantity not updated");
        Assert.assertEquals(shoppingCartPage.getTotalPriceOfProduct(),"$698.00","Price not displayed according to two products");
        shoppingCartPage.clickOnCheckBoxOfTermsAndService();
        shoppingCartPage.clickOnCheckOutButton();
        checkoutAsGuestOrLoginPage.getWelcomePleaseSignInText();
        checkoutAsGuestOrLoginPage.clickOnRegisterTab();
        Assert.assertEquals(registerPage.getRegisterText(),"Register","User not Navigate to register page");
        registerPage.enterFirstName("Manisha");
        registerPage.enterLastName("Mavani");
        registerPage.selectDateOfBirth("15");
        registerPage.selectMonthOfBirth("July");
        registerPage.selectYearOfBirth("1995");
        registerPage.enterEmail("Testuser"+getAlphaNumericString(2)+"@gmail.com");
        registerPage.enterPassword("Test123");
        registerPage.enterConfirmPassword("Test123");
        registerPage.clickOnRegister();
        Assert.assertEquals(registerPage.getRegistrationCompleted(),"Your registration completed","Registration not completed");
        registerPage.clickOnContinueButton();
        Assert.assertEquals(shoppingCartPage.getShoppingCartPageText(),"Shopping cart","User not navigate to shopping cart");
        shoppingCartPage.clickOnCheckBoxOfTermsAndService();
        shoppingCartPage.clickOnCheckOutButton();
        onePageCheckoutPage.selectCountry("United States");
        onePageCheckoutPage.selectState("California");
        onePageCheckoutPage.selectCity("London");
        onePageCheckoutPage.enterAddressLine1("35, Coventry Road");
        onePageCheckoutPage.enterZipCode("CV2 0LM");
        onePageCheckoutPage.enterPhoneNumber("06767567634");
        onePageCheckoutPage.clickOnContinueButton1();
        onePageCheckoutPage.clickOn2ndDayAirRadioButton();
        onePageCheckoutPage.clickOnContinueButton2();
        onePageCheckoutPage.clickOnCreditCardRadioButton();
        onePageCheckoutPage.clickOnContinueButton3();
        onePageCheckoutPage.selectCreditCardFromDropDown("Visa");
        onePageCheckoutPage.enterCardHolderName("MRs M D Mavani");
        onePageCheckoutPage.enterCardNumber("4111111111111111");
        onePageCheckoutPage.selectExpiryMonthOfCard("04");
        onePageCheckoutPage.selectExpiryYearOfCard("2026");
        onePageCheckoutPage.enterCardCode("123");
        onePageCheckoutPage.clickOnContinueButton4();
        Assert.assertTrue(onePageCheckoutPage.getPaymentMethodIsCreditCard().contains("Credit Card"), "Payment method is not selected as credit card");
        Assert.assertTrue(onePageCheckoutPage.getShoppingMethodIs2ndDayAir().contains("2nd Day Air"),"Shipping method is not selected 2nd Day Air");
        Assert.assertEquals(onePageCheckoutPage.getTotalPriceOfProduct(),"$698.00","Total not matched");
        onePageCheckoutPage.clickOnConfirm();
        Assert.assertEquals(onePageCheckoutPage.getThankYouText(),"Thank you","Not proceed");
        Assert.assertEquals(onePageCheckoutPage.getOrderSuccessfullyProcessed(),"Your order has been successfully processed!","Order not successfully proceed");
        onePageCheckoutPage.clickOnContinueButton();
        Assert.assertEquals(homePage.getWelcomeToOurStoreText(),"Welcome to our store","Ordered Successfully completed");
        homePage.clickOnLogOutLink();
        Assert.assertEquals(getCurrentUrl(),"https://demo.nopcommerce.com/","User not Logout");






    }
}
