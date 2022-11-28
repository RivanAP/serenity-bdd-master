package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

  By elementInputUsername = MobileBy.id("com.isl.simpleapp:id/username");
  By elementInputPassword = MobileBy.id("com.isl.simpleapp:id/password");
  By elementButtonRegister = MobileBy.id("com.isl.simpleapp:id/login");

  public LoginPage inputUsername() {
//    AndroidElement inputUsername = AndroidDriverInit.driver.findElement(elementInputUsername);
//    inputUsername.sendKeys("admin");
    type(elementInputUsername,"admin");
  return this;
  }
  public LoginPage inputPassword() {
//    AndroidElement inputPassword = AndroidDriverInit.driver.findElement(elementInputPassword);
//    inputPassword.sendKeys("admin");
    type(elementInputPassword,"admin");
    return this;
  }

  public void clickLoginBtn() {
//    AndroidElement btnSignInRegister = AndroidDriverInit.driver.findElement(elementButtonRegister);
//    btnSignInRegister.click();
    click(elementButtonRegister);
  }
  public boolean isButtonRegisterDisplayed () {
//    AndroidElement btnSignInRegister = AndroidDriverInit.driver.findElement(elementButtonRegister);
    return find(elementButtonRegister).isDisplayed();
  }

}
