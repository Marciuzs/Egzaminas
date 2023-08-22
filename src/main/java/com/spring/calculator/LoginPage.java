package com.spring.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractObjectPage {

    @FindBy(xpath = "//input[@placeholder='Prisijungimo vardas']")
    private WebElement inputUserName;

    @FindBy(xpath = "//input[@placeholder='Slaptažodis']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickSubmit;

    @FindBy(xpath = "//body//div//span[2]")
    private WebElement warningLoginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setInputUserName(String Jonas) {
        inputUserName.sendKeys(Jonas);
    }

    public void setInputPassword(String pass) {
        inputPassword.sendKeys(pass);
    }
    public void clickSubmit() {
        clickSubmit.click();
    }

    public String getWarningLoginMessageText() {
        return warningLoginMessage.getText();
    }




}