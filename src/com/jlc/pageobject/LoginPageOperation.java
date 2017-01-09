package com.jlc.pageobject;

import org.openqa.selenium.By;

import com.jlc.testng.*;

import io.appium.java_client.android.AndroidDriver;

public class LoginPageOperation {
	
	public void loginbefore(AndroidDriver driver) {
//		PublicMethod.Loginfo("跳过");
//	    driver.findElement(LoginPageFactory.next).click();
//		PublicMethod.Sleep(5);
		
	    PublicMethod.Loginfo("我的携程");
		driver.findElement(LoginPageFactory.myctrip).click();
		PublicMethod.Sleep(5);
		
		PublicMethod.Loginfo("登录／注册");
		driver.findElement(LoginPageFactory.login).click();
		PublicMethod.Sleep(3);
	}
	public void selectQQlogin(AndroidDriver driver, String number,String password) {
		PublicMethod.Loginfo("选择QQ icon");
		driver.findElement(LoginPageFactory.qqloginbutton).click();
		
		System.out.println("----"+driver.getContextHandles());
		PublicMethod.Sleep(10);
		PublicMethod.Loginfo("输入QQ号码和密码");
		driver.findElement(LoginPageFactory.qqnumber).sendKeys(number);
		PublicMethod.Sleep(2);
		driver.findElement(LoginPageFactory.qqpassword).sendKeys(password);
	}
	
	public void inputUser(AndroidDriver driver, String name,String password) {
		PublicMethod.Loginfo("输入用户名");
		driver.findElement(LoginPageFactory.userName).sendKeys(name);
		driver.findElement(LoginPageFactory.pwd).sendKeys(password);
	}
	public void LoginQQcommit(AndroidDriver driver) {
		PublicMethod.Loginfo("点击登录");
		driver.findElement(LoginPageFactory.qqcommit).click();
		PublicMethod.Sleep(5);
	}
	public void Loginlick(AndroidDriver driver) {
		PublicMethod.Loginfo("点击登录");
		driver.findElement(LoginPageFactory.loginbutton).click();
		PublicMethod.Sleep(5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
