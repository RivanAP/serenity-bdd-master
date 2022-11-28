package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps extends BaseTest {

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    Assert.assertTrue(loginPage.isButtonRegisterDisplayed());
  }

  @When("user input username")
  public void userInputUsername() {
    loginPage.inputUsername();
  }

  @And("user input password")
  public void userInputPassword() {
    loginPage.inputPassword();
  }

  @When("user click button login")
  public void userClickButtonLogin() {
    loginPage.clickLoginBtn();
  }

  @Then("user successfully login")
  public void userSuccessfullyLogin() {
    //getText
    String titleText = calculatorPage.getTitle();
    Assertions.assertEquals("Calculator", titleText);
    //isDisplayed
    boolean isDisplayed = calculatorPage.checkHamburgerBtnAppear();
    Assertions.assertTrue(isDisplayed);
    //Hamcrest
    MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
  }


}
