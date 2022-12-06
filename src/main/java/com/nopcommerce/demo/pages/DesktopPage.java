package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    //1.3 Select Sort By position "Name: Z to A"
    By selectSorted = By.id("products-orderby");

    public void selectSortedPosition(String text) {
        clickOnElement(selectSorted);
        selectByVisibleTextFromDropDown(selectSorted, text);
    }

    //Click on add to cart of product "Build your own computer"
    By clickComputer = By.xpath("//div[@data-productid='1']/div[2]/div[3]/div[2]/button[1]");
    public void clickOnAddToCartOfBuildYourOwnComputer(){
        try{
            Thread.sleep(1000);
            mouseHoverToElementAndClick(clickComputer);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
