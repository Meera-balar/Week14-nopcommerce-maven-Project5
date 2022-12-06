package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerProductPage extends Utility {

    //*****************************Build Your Own Computer Product**********************************************//
    //2.5 Verify the Text "Build your own computer"
    By computerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    public String getBuildYourComputerText(){
        return getTextFromElement(computerText);
    }
    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By processor = By.id("product_attribute_1");
    public void selectProcessor(String text){
        selectByVisibleTextFromDropDown(processor,text);
    }
    //2.7.Select "8GB [+$60.00]" using Select class.
    By selectRAMField = By.xpath("//select[@id='product_attribute_2']");
    public void selectRAM(String text){
        selectByVisibleTextFromDropDown(selectRAMField,text);
    }
    //2.8 Select HDD radio "400 GB [+$100.00]"
    By selectHDDButton = By.xpath("//input[@id='product_attribute_3_7']");
    public void selectHDDRadioButton(){
        clickOnElement(selectHDDButton);
    }
    //2.9 Select OS radio "Vista Premium [+$60.00]"
    By selectOSField = By.xpath("//input[@id='product_attribute_4_9']");
    public void selectOSVistaPremium(){
        clickOnElement(selectOSField);
    }
    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By selectCheckBoxField = By.xpath("//input[@id='product_attribute_5_12']");
    public void selectTwoCheckBox(){
        clickOnElement(selectCheckBoxField);
    }
    //2.11 Verify the price "$1,475.00"
    By price = By.xpath("//span[text()='$1,475.00']");
    public String getTotal(){
        return getTextFromElement(price);
    }
    //2.12 Click on "ADD TO CARD" Button.
    By clickButton = By.xpath("//button[@id='add-to-cart-button-1']");
    public void clickOnAddToCart(){
        clickOnElement(clickButton);
    }
    //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By textMessage = By.xpath("//div[@class='bar-notification success']");
    public String getProductAddedMessage(){
        return getTextFromElement(textMessage);
    }
    //2.13 After on green bar Close the bar clicking on the cross button.
    By closeMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void clickOnCrossButtonOnGreenBar(){
        clickOnElement(closeMessage);
    }
    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By hoverCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(hoverCart);
    }
    //2.14 Click on "GO TO CART" button.
    By clickCart = By.xpath("//button[contains(text(),'Go to cart')]");
    public void clickOnGoToCart(){
        clickOnElement(clickCart);
    }
}
