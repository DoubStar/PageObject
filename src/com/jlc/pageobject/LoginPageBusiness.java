package com.jlc.pageobject;

import org.testng.annotations.Test;
import com.jlc.testng.*;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class LoginPageBusiness {
	
	private  AndroidDriver  driver;
	LoginPageOperation loginPageOperation = new LoginPageOperation();
	String loginname = "18939785775";
	String password = "000123";
	
	
  @Test
  public void LoginForCtrip() {
	  PublicMethod.Sleep(30);
	  
	  loginPageOperation.loginbefore(driver);
	  loginPageOperation.inputUser(driver,loginname, password);
	  loginPageOperation.Loginlick(driver);
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("deviceName","Android Emulator");
      capabilities.setCapability("platformVersion", "4.4");
      capabilities.setCapability("appPackage", "ctrip.android.view");
      capabilities.setCapability("appActivity", ".splash.CtripSplashActivity");
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
