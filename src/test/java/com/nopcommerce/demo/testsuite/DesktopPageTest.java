package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    BuildYourOwnComputerProductPage buildYourOwnComputerProductPage = new BuildYourOwnComputerProductPage();

    CheckoutAsGuestOrLoginPage checkoutAsGuestOrLoginPage = new CheckoutAsGuestOrLoginPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        homePage.clickOnComputerTab();
        homePage.clickOnDesktopTab();
        desktopPage.selectSortedPosition("Name: Z to A");
        //1.4 Verification not possible as this filter not working in actual website itself.
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        homePage.clickOnComputerTab();
        homePage.clickOnDesktopTab();
        desktopPage.selectSortedPosition("Name: A to Z");
        desktopPage.clickOnAddToCartOfBuildYourOwnComputer();
        Assert.assertEquals(buildYourOwnComputerProductPage.getBuildYourComputerText(),"Build your own computer","Product not added");
        buildYourOwnComputerProductPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerProductPage.selectRAM("8GB [+$60.00]");
        buildYourOwnComputerProductPage.selectHDDRadioButton();
        buildYourOwnComputerProductPage.selectOSVistaPremium();
        buildYourOwnComputerProductPage.selectTwoCheckBox();
        Assert.assertEquals(buildYourOwnComputerProductPage.getTotal(),"$1,475.00","Price not match");
        buildYourOwnComputerProductPage.clickOnAddToCart();
        Assert.assertEquals(buildYourOwnComputerProductPage.getProductAddedMessage(),"The product has been added to your shopping cart");
        buildYourOwnComputerProductPage.clickOnCrossButtonOnGreenBar();
        buildYourOwnComputerProductPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerProductPage.clickOnGoToCart();
        Assert.assertEquals(shoppingCartPage.getShoppingCartPageText(),"Shopping cart","Page not navigated to shopping cart ");
        shoppingCartPage.changeQuantity("2");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getTotalPrice(),"$2,950.00","Shopping cart not updated");
        shoppingCartPage.clickOnCheckBoxOfTermsAndService();
        shoppingCartPage.clickOnCheckOutButton();
        Assert.assertEquals(checkoutAsGuestOrLoginPage.getWelcomePleaseSignInText(),"Welcome, Please Sign In!","Not navigated to login page");
        checkoutAsGuestOrLoginPage.clickOnCheckoutAsGuest();
        onePageCheckoutPage.enterFirstName("Mani");
        onePageCheckoutPage.enterLastName("Patel");
        onePageCheckoutPage.enterEmail("ManiPatel@gmail.com");
        onePageCheckoutPage.selectCountry("United Kingdom");
        onePageCheckoutPage.selectCity("London");
        onePageCheckoutPage.enterAddressLine1("40, Coventry Road");
        onePageCheckoutPage.enterZipCode("CV2 0LM");
        onePageCheckoutPage.enterPhoneNumber("06767567634");
        onePageCheckoutPage.clickOnContinueButton1();
        onePageCheckoutPage.clickOnNextDayAirRadioButton();
        onePageCheckoutPage.clickOnContinueButton2();
        onePageCheckoutPage.clickOnCreditCardRadioButton();
        onePageCheckoutPage.clickOnContinueButton3();
        onePageCheckoutPage.selectCreditCardFromDropDown("Master card");
        onePageCheckoutPage.enterCardHolderName("MRs M M Patel");
        onePageCheckoutPage.enterCardNumber("5555 5555 5555 4444");
        onePageCheckoutPage.selectExpiryMonthOfCard("04");
        onePageCheckoutPage.selectExpiryYearOfCard("2026");
        onePageCheckoutPage.enterCardCode("123");
        onePageCheckoutPage.clickOnContinueButton4();
        Assert.assertTrue(onePageCheckoutPage.getPaymentMethodIsCreditCard().contains("Credit Card"), "Payment method is not selected as credit card");
        Assert.assertTrue(onePageCheckoutPage.getShoppingMethodIsNextDayAir().contains("Next Day Air"),"Shipping method is not selected Next Day Air");
        Assert.assertEquals(onePageCheckoutPage.getTotalPriceOfProduct(),"$2,950.00","Total not matched");
        onePageCheckoutPage.clickOnConfirm();
        Assert.assertEquals(onePageCheckoutPage.getThankYouText(),"Thank you","Not proceed");
        Assert.assertEquals(onePageCheckoutPage.getOrderSuccessfullyProcessed(),"Your order has been successfully processed!","Order not successfully proceed");
        onePageCheckoutPage.clickOnContinueButton();
        Assert.assertEquals(homePage.getWelcomeToOurStoreText(),"Welcome to our store","Ordered Successfully completed");
    }
}
