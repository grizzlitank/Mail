package ru.arkhipov.basetest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HousePage extends BasePageObject {

    @FindBy(xpath = "//span[text()='Написать письмо']")
    public WebElement enterWrite;

    public void write(){
        Assert.assertEquals("Есть кнопка Написать письмо",
                "Написать письмо", enterWrite.getText());
        enterWrite.click(); }
}
