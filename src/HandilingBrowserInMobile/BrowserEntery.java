package HandilingBrowserInMobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserEntery {
	
	public static   AndroidDriver<AndroidElement>Capabilities() throws MalformedURLException {
	
	 AndroidDriver<AndroidElement> driver;

	  DesiredCapabilities cap = new DesiredCapabilities (); 

	  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hemanth");
	  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	  cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	  driver = new AndroidDriver<>(new URL("http://192.168.10.104:4723/wd/hub"),cap); 
	  
 return driver;

}

}



