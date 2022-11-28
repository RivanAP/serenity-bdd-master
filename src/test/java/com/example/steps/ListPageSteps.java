package com.example.steps;

import com.example.BaseTest;
import com.example.app.pages.NavigationMenu;
import io.cucumber.java.en.And;

public class ListPageSteps extends BaseTest {
  NavigationMenu sidebarPage = new NavigationMenu();
  @And("user do scroll menu")
  public void userDoScrollMenu() {
    sidebarPage.swipeInSecondMenu();
  }

  @And("User Long Press On List Menu")
  public void userLongPressOnListMenu() {
    sidebarPage.longPressInTheList();
  }

  @And("User doing Multiple tap on the list")
  public void userDoingMultipleTapOnTheList() {
    sidebarPage.tapMultipleTimeInTheList();
  }
}
