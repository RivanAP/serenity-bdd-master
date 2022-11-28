package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MathsStepDefinitions {
CalculatorPage resultCalculator = new CalculatorPage();
    @And("User input FirtsNumber for Sum")
    public void userInputFirtsNumberForSum() {
        resultCalculator.firtsNumberOne();
    }
    @And("User click Formula")
    public void userClickFormula() {
        resultCalculator.clickFormula();
    }
    @Then("User click Sum")
    public void userClickSum() {
        resultCalculator.clickSum();
    }
    @And("User input SecondNumber for Sum")
    public void userInputSecondNumberForSum() {
        resultCalculator.secondNumberOne();
    }
    @And("User click equals")
    public void userClickEquals() {
        resultCalculator.Equals();
    }
    @And("User Will see the Result")
    public void userWillSeeTheResult() {
        resultCalculator.result();
    }
    //Scenario2
    @Then("User input FirtsNumber for Reduce")
    public void userInputFirtsNumberForReduce() {
        resultCalculator.firtsNumberTwo();
    }
    @Then("User click Reduce")
    public void userClickReduce() {
        resultCalculator.clickReduce();
    }
    @And("User input SecondNumber for Reduce")
    public void userInputSecondNumberForReduce() {
        resultCalculator.secondNumberTwo();
    }
    //Scenario3
    @Then("User input FirtsNumber for Multiplication")
    public void userInputFirtsNumberForMultiplication() {
        resultCalculator.firtsNumberThree();
    }
    @Then("User click Multiplication")
    public void userClickMultiplication() {
        resultCalculator.clickMultipliction();
    }
    @And("User input SecondNumber for Multiplication")
    public void userInputSecondNumberForMultiplication() {
        resultCalculator.secondNumberThree();
    }
    //Scenario4
    @Then("User input FirtsNumber for Distribution")
    public void userInputFirtsNumberForDistribution() {
        resultCalculator.firtsNumberFour();
    }
    @Then("User click Distribution")
    public void userClickDistribution() {
        resultCalculator.clickFor();
    }

    @And("User input SecondNumber for Distribution")
    public void userInputSecondNumberForDistribution() {
        resultCalculator.secondNumberFour();
    }









    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Then("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @And("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a, b);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }



}





