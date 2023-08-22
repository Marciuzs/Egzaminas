package com.spring.calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginNegativeTest extends BaseTest {
    @Test
    void userLoginNegative(){
//        System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(options);
        LoginPage loginPage = new LoginPage(driver);
        String expectedLoginWarning = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";

        loginPage.setInputUserName("Jo");
        loginPage.setInputPassword("pa");
        loginPage.clickSubmit();


        Assertions.assertEquals(expectedLoginWarning, loginPage.getWarningLoginMessageText());




    }
}