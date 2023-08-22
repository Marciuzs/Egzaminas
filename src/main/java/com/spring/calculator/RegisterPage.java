package com.spring.calculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends AbstractObjectPage {
    @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
    private WebElement newAccount;
    @FindBy(id = "username")
    private WebElement inputUserName;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(id = "passwordConfirm")
    private WebElement inputPasswordConfirm;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickCreate;

    @FindBy(id = "username.errors")
    private WebElement warningMessage;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyNewAccount() {
        newAccount.click();
    }

    public void setInputUserName(String username) {
        inputUserName.sendKeys(username);
    }

    public void setInputPassword(String pass123) {
        inputPassword.sendKeys(pass123);
    }

    public void setInputPasswordConfirm(String pass123) {
        inputPasswordConfirm.sendKeys(pass123);
    }

    public void clickCreate() {
        clickCreate.click();
    }
    public String getWarningMessageText() {
        return warningMessage.getText();
    }



}