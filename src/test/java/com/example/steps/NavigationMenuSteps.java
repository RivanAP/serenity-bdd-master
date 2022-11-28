package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class NavigationMenuSteps extends BaseTest {
  NavigationMenu sidebarPage = new NavigationMenu();
  @When("user go to list menu")
  public void userGoToListMenu() {
    sidebarPage.clickHamburgerBtn()
            .clickListMenu();

  }

}
