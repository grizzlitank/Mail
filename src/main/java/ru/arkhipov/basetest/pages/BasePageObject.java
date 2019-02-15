package ru.arkhipov.basetest.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.arkhipov.basetest.steps.BaseSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePageObject {

    protected BaseSteps baseSteps = new BaseSteps();

    public void log(String message) {
        baseSteps.getLogger().info(message);
    }

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value){

        field.clear();
        field.sendKeys(value);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waiting(WebElement element){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }



}
