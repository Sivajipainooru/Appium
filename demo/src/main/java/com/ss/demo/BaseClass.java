package com.ss.demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		File appLocation = new File("src");
		File app = new File(appLocation, "HUllo.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Testing");
		cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	

}
