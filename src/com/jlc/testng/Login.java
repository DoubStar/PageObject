package com.jlc.testng;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;



public class Login {
	private  AndroidDriver  driver;
	String loginname = "18939785775";
	String Password = "000123";
  
  @BeforeClass
  public void beforeClass() throws Exception {
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
  
  @Test
  public void LoginForCtrip()  {
	
	  PublicMethod.Sleep(30);
	  
//	  PublicMethod.Loginfo("点击滑动");
//	  driver.findElement(By.id("ctrip.android.publicproduct:id/guide_skip_text")).click();
//	  PublicMethod.Sleep(5);
	  
	  PublicMethod.Loginfo("点击去我的携程");
	  driver.findElement(By.id("ctrip.android.publicproduct:id/myctrip")).click();
	  PublicMethod.Sleep(3);
	  

	  PublicMethod.Loginfo(driver.getContext());
	  
	  PublicMethod.Loginfo("登录／注册");
	  driver.findElement(By.id("ctrip.android.myctrip:id/myctrip_login_btn")).click();
	  PublicMethod.Sleep(3);
	  
	  PublicMethod.Loginfo("输入用户名");
	  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys(loginname);
	  PublicMethod.Sleep(3);
	  
	  PublicMethod.Loginfo("输入密码");
	  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys(Password);
	  PublicMethod.Sleep(1);
//	  driver.sendKeyEvent(66);
	  PublicMethod.Loginfo("点击提交");
	  driver.findElement(By.id("ctrip.android.login:id/button_login_update")).click();
	  PublicMethod.Sleep(3);
	  
  }

}
