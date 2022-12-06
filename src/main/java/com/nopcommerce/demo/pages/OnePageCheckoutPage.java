package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OnePageCheckoutPage extends Utility {
    //************************************************2.22 Fill the all mandatory field*************************************************//
    //Enter FirstName
    By firstNameField = By.id("BillingNewAddress_FirstName");
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName+getAlphaNumericString(2));
    }
    //Enter LastName
    By lastNameField = By.id("BillingNewAddress_LastName");
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName+getAlphaNumericString(2));
    }
    //Enter Email
    By emailField = By.id("BillingNewAddress_Email");
    public void enterEmail(String email){
        sendTextToElement(emailField,email+getAlphaNumericString(2));
    }
    //Select country
    By country = By.id("BillingNewAddress_CountryId");
    public void selectCountry(String countryName){
        selectByVisibleTextFromDropDown(country,countryName);
    }
    //Select country
    By state = By.id("BillingNewAddress_StateProvinceId");
    public void selectState(String stateName){
        selectByVisibleTextFromDropDown(state,stateName);
    }

    //Enter City
    By city = By.id("BillingNewAddress_City");
    public void selectCity(String cityName){
        sendTextToElement(city,cityName);
    }
    //Enter Address 1
    By address = By.id("BillingNewAddress_Address1");
    public void enterAddressLine1(String addressLine){
        sendTextToElement(address,addressLine);
    }
    //Enter Zip code
    By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
    public void enterZipCode(String zipCode){
        sendTextToElement(zipCodeField,zipCode);
    }
    //Enter PhoneNumber
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }
    //2.23 Click on “CONTINUE”
    By clickContinue = By.xpath("//div[@id='billing-buttons-container']/button[4]");
    public void clickOnContinueButton1(){
        clickOnElement(clickContinue);
    }
    //2.24 Click on Radio Button “Next Day Air($0.00)”
    By clickRadioButton = By.id("shippingoption_1");
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(clickRadioButton);
    }
    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By clickRadioButton1 = By.id("shippingoption_2");
    public void clickOn2ndDayAirRadioButton(){
        clickOnElement(clickRadioButton1);
    }

    //2.25 Click on “CONTINUE”
    By clickContinue1 = By.xpath("//div[@id='shipping-method-buttons-container']/button");
    public void clickOnContinueButton2(){
        clickOnElement(clickContinue1);
    }
    //2.26 Select Radio Button “Credit Card”
    By radioClick = By.xpath("//input[@id='paymentmethod_1']");
    public void clickOnCreditCardRadioButton(){
        clickOnElement(radioClick);
    }
    //Click on “CONTINUE”
    By click = By.xpath("//div[@id='payment-method-buttons-container']/button");
    public void clickOnContinueButton3(){
        clickOnElement(click);
    }
    //2.27 Select “Master card” From Select credit card dropdown
    By selectCard = By.id("CreditCardType");
    public void selectCreditCardFromDropDown(String card){
        selectByVisibleTextFromDropDown(selectCard,card);
    }
    //*********2.28 Fill all the details**************//
    //Enter CardHolder Name
    By cardHolder = By.id("CardholderName");
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolder,name);
    }
    //Enter card number
    By cardNumberField = By.id("CardNumber");
    public void enterCardNumber(String cardNumber){
        sendTextToElement(cardNumberField,cardNumber);
    }
    //Select Expiry month
    By expiryMonthField = By.id("ExpireMonth");
    public void selectExpiryMonthOfCard(String month){
        selectByVisibleTextFromDropDown(expiryMonthField,month);
    }
    //Select Expiry Year
    By expiryYearField = By.id("ExpireYear");
    public void selectExpiryYearOfCard(String year){
        selectByVisibleTextFromDropDown(expiryYearField,year);
    }
    //Enter Card code
    By cardCodeField = By.id("CardCode");
    public void enterCardCode(String code){
        sendTextToElement(cardCodeField,code);
    }
    //2.29 Click on “CONTINUE”
    By clickContinue2 = By.xpath("//div[@id='payment-info-buttons-container']/button");
    public void clickOnContinueButton4(){
        clickOnElement(clickContinue2);
    }
    //2.30 Verify “Payment Method” is “Credit Card”
    By creditCardText = By.xpath("//div[@class='payment-method-info']/ul/li");
    public String getPaymentMethodIsCreditCard(){
        return getTextFromElement(creditCardText);
    }
    //2.32 Verify “Shipping Method” is “Next Day Air”
    By nextDayAirText = By.xpath("//div[@class='shipping-method-info']/ul/li");
    public String getShoppingMethodIsNextDayAir(){
        return getTextFromElement(nextDayAirText);
    }
    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By secondDayAirText = By.xpath("//div[@class='shipping-method-info']/ul/li");
    public String getShoppingMethodIs2ndDayAir(){
        return getTextFromElement(secondDayAirText);
    }

    //2.33 Verify Total is “$2,950.00”
    By totalPriceText = By.xpath("//tr[@class ='order-total']/td[2]/span//strong");
    public String getTotalPriceOfProduct(){
        return getTextFromElement(totalPriceText);
    }

    //2.34 Click on “CONFIRM”
    By clickConfirm = By.xpath("//div[@id='confirm-order-buttons-container']//button");
    public void clickOnConfirm(){
        clickOnElement(clickConfirm);
    }
    //2.35 Verify the Text “Thank You”
    By thankYouText = By.xpath("//h1[text()='Thank you']");
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }
    //2.36 Verify the message “Your order has been successfully processed!”
    By successfullyText = By.xpath("//strong[text()='Your order has been successfully processed!']");
    public String getOrderSuccessfullyProcessed(){
        return getTextFromElement(successfullyText);
    }
    //2.37 Click on “CONTINUE”
    By continue1 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public void clickOnContinueButton(){
        clickOnElement(continue1);
    }
}
