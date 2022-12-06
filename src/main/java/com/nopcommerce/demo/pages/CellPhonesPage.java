package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    //1.3 Verify the text “Cell phones”
    By cellPhoneText = By.xpath("//h1[text()='Cell phones']");
    public String getCellPhoneText(){
        return getTextFromElement(cellPhoneText);
    }
    //2.4 Click on List View Tab
    By clickListview = By.xpath("//a[text()='List']");
    public void clickOnListViewTab(){
        clickOnElement(clickListview);
    }
    //2.5 Click on product name “Nokia Lumia 1020” link
    By clickNokiaLumia = By.linkText("Nokia Lumia 1020");
    public void clickOnNokiaLumia1020CellPhone() {
        try {
            Thread.sleep(500);
            mouseHoverToElementAndClick(clickNokiaLumia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
