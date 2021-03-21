package com.mobileFramwork.mobile_framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File apkFile=new File ("C:\\Users\\iqbal\\git\\TestRepo\\mobile-framework\\src\\test\\java\\com\\mobileFramwork\\mobile_framework\\ApiDemos-debug.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus" );
		cap.setCapability(MobileCapabilityType.APP,apkFile.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		

	}

}
