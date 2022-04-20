package appiumPractiece;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Installation {

	public static   AndroidDriver<AndroidElement>Capabilities() throws MalformedURLException {
		
		 AndroidDriver<AndroidElement> driver;

		  File appDir = new File("src");
		  File app = new File(appDir, "ApiDemos-debug.apk");
		  //File app = new File(appDir, "General-Store.apk");
		  
		  DesiredCapabilities cap = new DesiredCapabilities (); 

		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hemanth1");
		  cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		  cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		  driver = new AndroidDriver<>(new URL("http://192.168.10.104:4723/wd/hub"),cap); 
		  
	  return driver;

	}

}
