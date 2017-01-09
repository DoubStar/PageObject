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



public class LoginForQQ {
    private AndroidDriver  driver;
	String qqnum = "23508712";
	String qqpwd = "shenjie1012";
	LoginPageOperation loginPageOperation = new LoginPageOperation();
	
	
 
  @BeforeClass
  public void beforeClass() throws MalformedURLException  {
	//  PublicMethod.Driverset(driver);
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("deviceName","Android Emulator");
      capabilities.setCapability("platformVersion", "4.4");
 //     capabilities.setCapability("automationName", "Selendroid");
      capabilities.setCapability("appPackage", "ctrip.android.view");
      capabilities.setCapability("appActivity", ".splash.CtripSplashActivity");
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @AfterClass
  public void afterClass() {
//	  driver.quit();
  }

  @Test
  public void pagetest() {
	  PublicMethod.Sleep(10);
	  loginPageOperation.loginbefore(driver);
	  loginPageOperation.selectQQlogin(driver, qqnum, qqpwd);
	  loginPageOperation.LoginQQcommit(driver);

  }
  

  



  


  
}

