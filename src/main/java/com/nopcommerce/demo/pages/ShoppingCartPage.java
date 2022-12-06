package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
   //2.15 Verify the message "Shopping cart"
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String getShoppingCartPageText(){
        return getTextFromElement(shoppingCartText);
    }
   // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By quantity = By.xpath("//td[@class='quantity']/input");
    public void changeQuantity(String text){
        sendTextToElement(quantity,text);
    }
    //2.16and Click on "Update shopping cart"
    By clickUpdateCart = By.xpath("//button[@id='updatecart']");
    public void clickOnUpdateShoppingCart(){
        clickOnElement(clickUpdateCart);
    }
    //2.17 Verify the Total"$2,950.00"
    By totalPrice = By.xpath("//td[@class= 'subtotal']/span");
    public String getTotalPrice(){
        return getTextFromElement(totalPrice);
    }
    //2.18 click on checkbox “I agree with the terms of service”
    By clickCheckBox = By.xpath("//input[@id='termsofservice']");
    public void clickOnCheckBoxOfTermsAndService(){
        clickOnElement(clickCheckBox);
    }
    //2.19 Click on “CHECKOUT
    By checkoutButton = By.xpath("//button[@id='checkout']");
    public void clickOnCheckOutButton(){
        clickOnElement(checkoutButton);
    }

    ////2.13 Verify the quantity is 2
    By quantityField = By.xpath("//input[@class='qty-input']");
    public String getQuantityDisplayedOnPage(String text){
        return getAttributeFromElement(quantityField,text);
    }
    //2.14 Verify the Total $698.00
    By total = By.xpath("//td[@class='subtotal']//span[text()='$698.00']");
    public String getTotalPriceOfProduct(){
        return getTextFromElement(total);
    }

}
