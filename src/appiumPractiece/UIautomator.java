package appiumPractiece;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class UIautomator {

	public static void main (String [] args) throws MalformedURLException {

		  DesiredCapabilities cap = new DesiredCapabilities (); 
		  File appDir = new File("src");
		  File app = new File(appDir, "ApiDemos-debug.apk");
		  
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hemanth");
		  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		  AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://192.168.10.104:4723/wd/hub"),cap); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElementByAndroidUIAutomator("(text(\"Views\")").click();
//to get properties of emulators true or false 
		 
		  
	   	  System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

		     
		  
		  
		  
		  
		  
		  
		  
		  
		  
}}
