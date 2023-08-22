package com.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RegisterNegativeTest extends BaseTest {
    @Test
    void registerUserNegative() {
        RegisterPage registerPage = new RegisterPage(driver);
        String expectedWarning = "Toks vartotojo vardas jau egzistuoja";

        registerPage.clickMyNewAccount();
        registerPage.setInputUserName("Jonas");

        registerPage.setInputPassword("pass123");
        registerPage.setInputPasswordConfirm("pass123");
        registerPage.clickCreate();

        Assertions.assertEquals(expectedWarning, registerPage.getWarningMessageText());
    }
}
