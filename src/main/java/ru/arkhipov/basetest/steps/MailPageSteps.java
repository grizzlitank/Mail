package ru.arkhipov.basetest.steps;



import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.MailPage;


public class MailPageSteps {



    @Step("поле письма {field} заполняется значением {value}")
    public void fillFieldMail(String field, String value) {
        new MailPage().fillFieldMail(field, value);
    }



}
