package com.fintechhub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

 public LoginPage fillUsername (String username){
        getWebElement(By.cssSelector("input[name='username']")).sendKeys(username);
        return this;
}

    public LoginPage fillPassword (String password){
        getWebElement(By.cssSelector("input[name='password']")).sendKeys(password);
        return this;
    }

    // method for go to Homepage  from Loginpage

    public HomePage clickLoginBtnPass(){
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return getInstance(HomePage.class);
    }


    public LoginPage clickLoginBtnFail(){
        getWebElement(By.cssSelector("input[value='Log In']")).click();
        return this;
    }



    public ForgetPage clickForgetLink(){
        getWebElement(By.cssSelector("a[href='lookup.htm']")).click();
        return getInstance(ForgetPage.class);
    }

    public boolean hasError(){
        return getWebElements(By.className("error")).size()>0;
    }


    //login using method//
    public HomePage doLogin (String username, String password){
        return fillUsername(username)
                .fillPassword(password)
                .clickLoginBtnPass();
    }
}

