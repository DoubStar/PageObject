package com.jlc.testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class PublicMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "xixihaha";
		Loginfo(info);
	}
	
	//输入需要的相关信息
	public static void Loginfo(String log){
		System.out.println("------"+log);
	}
	
	public static void Driverset(AndroidDriver driver) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
	      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	      capabilities.setCapability("platformName", "Android");
	      capabilities.setCapability("deviceName","Android Emulator");
	      capabilities.setCapability("platformVersion", "4.4");
	      capabilities.setCapability("appPackage", "ctrip.android.view");
	      capabilities.setCapability("appActivity", ".splash.CtripSplashActivity");
	      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	public static void Sleep(int x){
		try {
			Thread.sleep(x*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
