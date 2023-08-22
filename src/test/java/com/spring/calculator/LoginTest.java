package com.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    void userLogin(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();
        String item = driver.findElement(By.xpath("/html/body/nav/div/ul[2]/a")).getText();
        Assertions.assertEquals("Logout, Jonas", item);
    }


}