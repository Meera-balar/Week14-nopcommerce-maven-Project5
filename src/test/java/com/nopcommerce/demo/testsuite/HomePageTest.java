package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    //"TopMenuTest"
    @Test
    public void verifyUserShouldNavigateToPageSuccessfully() {
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(),"Books","Page Navigated Successfully");

    }

}

