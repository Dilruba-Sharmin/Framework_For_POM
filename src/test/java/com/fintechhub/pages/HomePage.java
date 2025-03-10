package com.fintechhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink() {
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size() > 0;
    }

    // method for go to OpenNewAccountPage from Homepage
    public OpenNewAccountPage clickOpenAccountLink() {
        getWebElement(By.cssSelector("a[href='openaccount.htm']")).click();
        return getInstance(OpenNewAccountPage.class);

    }
}
