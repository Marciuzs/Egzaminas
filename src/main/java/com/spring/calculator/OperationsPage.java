package com.spring.calculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperationsPage extends AbstractObjectPage {
    @FindBy(css = "a[href='/skaiciai']")
    private WebElement usedOperations;

    @FindBy(xpath = "//tbody//tr//a[1]")
    private WebElement findOperation;

    public OperationsPage(WebDriver driver) {
        super(driver);
    }

    public void clickUsedOperations() {
        usedOperations.click();}

    public void clickFindOperation() {
        findOperation.click();}


}