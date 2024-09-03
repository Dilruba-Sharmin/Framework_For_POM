package com.fintechhub.testcases;

import com.fintechhub.pages.HomePage;
import com.fintechhub.pages.LoginPage;
import com.fintechhub.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void doLoginWithUsernameShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class)
                .fillUsername(getUsername())
                .clickLoginBtnFail();
        Assert.assertTrue(loginPage.hasError());
    }

    @Test
    public void doLoginShouldPass(){
        HomePage homePage=page.getInstance(LoginPage.class)
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtnPass();
        Assert.assertTrue(homePage.hasLogoutLink());

    }

    @Test
    public void checkTitle(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
    }

}
