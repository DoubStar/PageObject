package com.jlc.pageobject;

import org.openqa.selenium.By;

public class LoginPageFactory {
	//next是appium需要指定安装apk使用
	public static By next = By.id("ctrip.android.publicproduct:id/guide_skip_text");
	public static By myctrip = By.id("ctrip.android.publicproduct:id/myctrip");
	public static By login = By.id("ctrip.android.myctrip:id/myctrip_login_btn");
    public static By userName = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]");
    public static By pwd = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]");
    public static By loginbutton=By.id("ctrip.android.login:id/button_login_update");
    //button2是androidpad的
    public static By loginbutton2 = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.Button[1]");
    //qq登录需要的元素
    public static By qqloginbutton = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]");
    public static By qqnumber = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1]");
    public static By qqpassword = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[3]/android.widget.EditText[1]");
    public static By qqcommit = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[4]/android.widget.Button[1]");
    

}
