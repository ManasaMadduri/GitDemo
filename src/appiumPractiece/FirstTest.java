package appiumPractiece;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class FirstTest{
public static void main (String [] args) throws MalformedURLException {

	  File appDir = new File("src");
	  File app = new File(appDir, "ApiDemos-debug.apk");
	  DesiredCapabilities cap = new DesiredCapabilities (); 

	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hemanth1");
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	  AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://192.168.10.104:4723/wd/hub"),cap); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		//System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").getText());
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Preferences from XML']").click();
		driver.findElementById("(android:id/checkbox)[0]").click();
		driver.findElementsById("(android:id/checkbox)[0]").get(1).click();
		//driver.findElementsByClassName("android.widget.TextView").get(1).click();
		
}
		

		

	
	

}
