package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.List;

public class BasePageObject {
TouchAction touchAction;
  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }

  public AndroidElement find(By locatorName){
    return getDriver().findElement(locatorName);
  }
  public List<AndroidElement> findelements(By locatorName){
    return getDriver().findElements(locatorName);
  }
  public void type(By locatorName, String value){
    find(locatorName).sendKeys(value);
  }
  public void click(By locatorName){
    find(locatorName).click();
  }
  public String getText(By by){
    return find(by).getText();
  }

  public boolean isDisplayed(By by){
    return find(by).isDisplayed();
  }
  public TouchAction getTouchAction(){
    touchAction = new TouchAction(getDriver());
    return touchAction;
  }
  public void swipeScreen (By elementToSwipe){
    Point cordinate = find(elementToSwipe).getCenter() ;
    getTouchAction().press(PointOption.point(cordinate))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
            .moveTo(PointOption.point(cordinate.getX(), cordinate.getY() + -500))
            .release()
            .perform();
  }
  public void longPress (AndroidElement elementToPress){
    getTouchAction().longPress(PointOption.point(elementToPress.getCenter()))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
            .release()
            .perform();
  }
  public void tapMultipleTimes (AndroidElement elementToTap){
    getTouchAction().tap(TapOptions.tapOptions().withTapsCount(5)
            .withElement(ElementOption.element(elementToTap)))
            .perform();
  }

}
