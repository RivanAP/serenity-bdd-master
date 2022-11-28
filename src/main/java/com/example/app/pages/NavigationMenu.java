package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class NavigationMenu extends BasePageObject {

  By elementHamburgerMenu = MobileBy.xpath(
"//android.widget.ImageButton[@content-desc='Buka panel navigasi']");
  By elementList = MobileBy.id("com.isl.simpleapp:id/nav_list");
  By elementTouchScroll = MobileBy.id("com.isl.simpleapp:id/recycler_view");
  By elementLongPress = MobileBy.id("com.isl.simpleapp:id/text_view");
  public NavigationMenu clickHamburgerBtn(){
    click(elementHamburgerMenu);
    return this;
  }
  public void clickListMenu(){
    click(elementList);
  }
public boolean isHumbergurMenuIsDisplay () {
    return find(elementHamburgerMenu).isDisplayed();
}
public void swipeInSecondMenu(){
    swipeScreen(elementTouchScroll);
}

public void longPressInTheList(){
      longPress(findelements(elementLongPress).get(5));
}
public void tapMultipleTimeInTheList (){
      tapMultipleTimes(findelements(elementLongPress).get(1));
}
}
