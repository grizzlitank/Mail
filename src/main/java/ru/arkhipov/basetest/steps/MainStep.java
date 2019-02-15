package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.MainPage;

public class MainStep {
    @Step("поле {field} заполняется значением {value}")
    public void fillField(String field, String value) {
        new MainPage().fillField(field, value);
    }
}
