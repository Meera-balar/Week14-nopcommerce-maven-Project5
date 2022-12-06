package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020CellPhoneProductPage extends Utility {
    //*****************************Nokia Lumia 1020 Product**********************************************//

    // verify text “Nokia Lumia 1020”
    By nokialumiaText = By.xpath("//h1[text()='Nokia Lumia 1020']");
    public String getNokiaLumia1020Text(){
        return getTextFromElement(nokialumiaText);
    }
    //2.7 Verify the price “$349.00”
    By price = By.xpath("//div[@class='product-price']//span[text()=' $349.00 ']");
    public String getTotal(){
        return getTextFromElement(price);
    }
    //2.8 Change quantity to 2
    By editQuantity = By.id("product_enteredQuantity_20");
    public void changeTheQuantityTo(String text){
        sendTextToElement(editQuantity,text);
    }
    //2.9 Click on “ADD TO CART” tab
    By clickAddToCart = By.id("add-to-cart-button-20");
    public void clickOnAddToCartButton(){
        try{
            Thread.sleep(500);
            mouseHoverToElementAndClick(clickAddToCart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By productAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]");
    public String getProductAddedSuccessfullyText(){
        return getTextFromElement(productAddedText);
    }
    // 2.10 After that close the bar clicking on the cross button.
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
