package com.jlc.base;

import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Properties prop = new Properties();
			InputStream in = ReadProperties.class.getClassLoader().getResourceAsStream("user.properties");
			prop.load(in);
			System.out.println("直接输出prop对象："+prop);
			String loginname = prop.getProperty("loginname");
			String Password = prop.getProperty("Password");
			System.out.println("loginname:"+loginname+"---"+"Password:"+Password);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
