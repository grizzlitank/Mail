package ru.arkhipov.basetest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePageObject{

    @FindBy(xpath = "//input[@placeholder='Имя ящика']")
    public WebElement mailName;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Войти']")
    public WebElement enter;

    public void fillField(String fieldName, String value){
        switch (fieldName){
            case  "Логин":
                log("Заполняем " + fieldName + " значением: " + value);
                waiting(mailName);
                mailName.click();
                fillField(mailName, value);
            case  "Пароль":
                log("Заполняем " + fieldName + " значением: " + value);
                fillField(password, value);
                enter.click();
                break;
            default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }

}
