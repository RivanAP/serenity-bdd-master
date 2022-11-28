package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {
By elementFirst = MobileBy.id("com.isl.simpleapp:id/et_1");
By elementFormula = MobileBy.id("com.isl.simpleapp:id/spinner_1");
By elementSum = MobileBy.id("android:id/text1");
By elementReduce = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
By elementMultiplication = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
By elementFor = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
By elementSecond = MobileBy.id("com.isl.simpleapp:id/et_2");
By elementEquals = MobileBy.id("com.isl.simpleapp:id/acb_calculate");
By elemetnResult = MobileBy.id("com.isl.simpleapp:id/tv_result");
//penjumlahan
public CalculatorPage firtsNumberOne (){
  type(elementFirst,"1");
  return this;
}
public CalculatorPage clickFormula(){
 click(elementFormula);
  return this;
}
public CalculatorPage clickSum(){
  click(elementSum);
  return this;
}
public CalculatorPage secondNumberOne(){
  type(elementSecond, "2");
  return this;
}
public CalculatorPage Equals(){
  click(elementEquals);
  return this;
}
public CalculatorPage result(){
  click(elemetnResult);
  return this;
}
//pengurangan

  public CalculatorPage firtsNumberTwo (){
    type(elementFirst,"2");
    return this;
  }
  public CalculatorPage clickReduce(){
    click(elementReduce);
    return this;
  }
  public CalculatorPage secondNumberTwo(){
    type(elementSecond, "1");
    return this;
  }
  //Perkalian
  public CalculatorPage firtsNumberThree (){
    type(elementFirst,"4");
    return this;
  }
  public CalculatorPage clickMultipliction(){
    click(elementMultiplication);
    return this;
  }
  public CalculatorPage secondNumberThree(){
    type(elementSecond, "2");
    return this;
  }
  //Pembagian
  public CalculatorPage firtsNumberFour (){
    type(elementFirst,"10");
    return this;
  }
  public CalculatorPage clickFor(){
    click(elementFor);
    return this;
  }
  public CalculatorPage secondNumberFour(){
    type(elementSecond, "5");
    return this;
  }


  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Buka panel navigasi");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

}
