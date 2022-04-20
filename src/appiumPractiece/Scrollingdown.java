package appiumPractiece;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scrollingdown  extends Installation{
	
		public static void main (String[] args) throws  MalformedURLException, InterruptedException
		{

		
		 AndroidDriver<AndroidElement> driver= Capabilities();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
			driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
			 //andriod appium code 
			driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoview(text(\"WebView\"));");        
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}