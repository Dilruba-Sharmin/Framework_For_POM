package com.fintechhub.testcases;

import com.fintechhub.pages.LoginPage;
import com.fintechhub.pages.OpenNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {


    @Test       // testcase template=2
    public void openAccountShouldSucceed() {
        OpenNewAccountPage newAccountPage = page.getInstance(LoginPage.class)
                .doLogin(getUsername(), getPassword())
                .clickOpenAccountLink()
                .selectAccountType(1)
                .selectAccountNumber(0)
                .clickNewAccountBtn();
        Assert.assertTrue(newAccountPage.hasAccountId());
    }
}
