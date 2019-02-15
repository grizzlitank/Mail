package ru.arkhipov.basetest.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;


public class MailPage extends BasePageObject{


    @FindBy(xpath = "//textarea[@tabindex='4']")
    WebElement address;

    @FindBy(xpath = "//input[@name='Subject']")
    WebElement theme;

    @FindBy(xpath = "//td[@class='cell shell__text_cell w100']")
    WebElement text;

    @FindBy(xpath = "//span[text()='Отправить']")
    WebElement send;

    @FindBy(xpath = "//a[text()='Перейти во Входящие']")
    WebElement done;

    public void fillFieldMail(String fieldName, String value){
        switch (fieldName){
            case  "Адрес":
                log("Заполняем " + fieldName + " значением: " + value);
                waiting(address);
                address.click();
                fillField(address, value);
                break;
            case  "Тема":
                log("Заполняем " + fieldName + " значением: " + value);
                waiting(theme);
                theme.click();
                fillField(theme, value);
                break;
            case  "Текст письма":
                log("Заполняем " + fieldName + " значением: " + value);
                Actions builder = new Actions(BaseSteps.getDriver());
                builder.moveToElement(text).click(text);
                Action mouseoverAndClick = builder.build();
                mouseoverAndClick.perform();
                Action keyXPressed = builder.sendKeys(value).build();
                keyXPressed.perform();
                log("Жмем кнопку Отправить");
                send.click();
                waiting(done);
                Assert.assertEquals("Появился текст Перейти во Входящие",
                        "Перейти во Входящие", done.getText());
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }








}


