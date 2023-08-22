package com.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class RegisterTest extends BaseTest {

    @Test
    void registerUser() {
        RegisterPage registerPage = new RegisterPage(driver);
        String name = "Ilona";
        registerPage.clickMyNewAccount();
        registerPage.setInputUserName(name);
        registerPage.setInputPassword("pass123");
        registerPage.setInputPasswordConfirm("pass123");
        registerPage.clickCreate();
        String item = driver.findElement(By.xpath("/html/body/nav/div/ul[2]/a")).getText();
        Assertions.assertEquals("Logout, " + name, item);
    }
}