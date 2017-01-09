package com.jlc.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Login {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
	    AndroidDriver  driver;
		String loginname = "18939785775";
		String Password = "000123";
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
	      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	      capabilities.setCapability("platformName", "Android");
	      capabilities.setCapability("deviceName","Android Emulator");
	      capabilities.setCapability("platformVersion", "4.4");
	      capabilities.setCapability("appPackage", "ctrip.android.view");
	      capabilities.setCapability("appActivity", ".splash.CtripSplashActivity");
	      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	      
	      System.out.println("等待30秒加载数据");
	      Thread.sleep(30000);		  
		 
		  System.out.println("跳过");
		  driver.findElement(By.id("ctrip.android.publicproduct:id/guide_skip_text")).click();
		   Thread.sleep(5000);
		  	  
		  System.out.println("我的携程");
		  driver.findElement(By.id("ctrip.android.publicproduct:id/myctrip")).click();
		  Thread.sleep(5000);
		  
		  System.out.println("登录／注册");
		  driver.findElement(By.id("ctrip.android.myctrip:id/myctrip_login_btn")).click();
		  Thread.sleep(5000);
		  
		  System.out.println("输入姓名");
		  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys(loginname);
		  Thread.sleep(5000);
		  
		  System.out.println("输入密码");
		  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys(Password);
		  Thread.sleep(1000);

		  System.out.println("点击登陆");
		  driver.findElement(By.id("ctrip.android.login:id/button_login_update")).click();
		  Thread.sleep(1000);
		  
		  driver.quit();

	}

}
