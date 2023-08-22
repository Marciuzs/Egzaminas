package com.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OperationTest extends BaseTest {

    @Test
    void operations() {

        LoginPage loginPage = new LoginPage(driver);
        OperationsPage operationsPage = new OperationsPage(driver);

        loginPage.setInputUserName("Jonas");
        loginPage.setInputPassword("pass123");
        loginPage.clickSubmit();
        driver.findElement(By.xpath("/html/body/nav/div/ul[1]/li/a")).click();
      String item = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[1]")).getText();
        Assertions.assertEquals("2", item);
    }
}