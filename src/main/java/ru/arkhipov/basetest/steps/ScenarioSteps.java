package ru.arkhipov.basetest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;


public class ScenarioSteps {

    MailPageSteps mailPageSteps = new MailPageSteps();

    HouseStep houseStep = new HouseStep();

    MainStep mainStep = new MainStep();

    @When("^заполняются поля письма:$")
    public void fillFormMailStep(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> mailPageSteps.fillFieldMail(field, value));    }

    @When("^выбираем Написать письмо$")
    public void writeStep(){
        houseStep.write();
    }

    @When("^заполняются поля:$")
    public void fillFormStep(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> mainStep.fillField(field, value));

    }











}
