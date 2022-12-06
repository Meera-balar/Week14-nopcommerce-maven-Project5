package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends Utility {
    //1.2 This method should click on the menu whatever name is passed as parameter.
    By topMenuTabs = By.xpath("//div[@class = 'header-menu']/ul/li");


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenuTabs);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenuTabs);
        }
    }

    //********************Computer**********************************//
    //1.1 Click on Computer Menu.
    By computerTab = By.xpath("//div[@class='header-menu']/ul[1]/li//a[text()='Computers ']");

    public void clickOnComputerTab() {
        mouseHoverToElementAndClick(computerTab);
    }

    //1.2 Click on Desktop
    By desktopLink = By.xpath("//div[@class='item-grid']/div[1]/div[1]/h2/a");

    public void clickOnDesktopTab() {
        mouseHoverToElementAndClick(desktopLink);
    }
    //2.37 Verify the text “Welcome to our store”
    By welcomeToOurStoreText = By.xpath("//h2[text()='Welcome to our store']");
    public String getWelcomeToOurStoreText(){
        return getTextFromElement(welcomeToOurStoreText);
    }

    //********************Electronics**********************************//

    //1.1 Mouse Hover on “Electronics” Tab
    By electronicTab = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");

    public void mouseHoverToElectronicTab() {
        mouseHoverToElement(electronicTab);
    }

    //1.2 Mouse Hover on “Cell phones” and click
    By cellPhoneLink = By.xpath("//div[@class='header-menu']/ul[1]/li[2]/ul/li[2]/a[1]");

    public void mouseHoverToCellPhoneLinkAndClick() {
        mouseHoverToElementAndClick(cellPhoneLink);
    }

    //Verify page navigate to each tab whatever passed
    By pageTitle = By.cssSelector("div.page-title");
    public String getTitleOfPage(){
        return getTextFromElement(pageTitle);
    }
    //2.43 Click on “Logout” link
    By clickLogOut = By.linkText("Log out");
    public void clickOnLogOutLink(){
        clickOnElement(clickLogOut);
    }
}
