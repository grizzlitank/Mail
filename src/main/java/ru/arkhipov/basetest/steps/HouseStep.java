package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.HousePage;

public class HouseStep {

    @Step("выбираем Написать письмо")
    public void write(){
        new HousePage().write();
    }
}
