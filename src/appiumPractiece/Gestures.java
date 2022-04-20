package appiumPractiece;

import java.net.MalformedURLException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures  extends Installation{
	
	public static void main (String[] args) throws  MalformedURLException, InterruptedException
	{

	
	 AndroidDriver<AndroidElement> driver= Capabilities();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

	 WebElement Expandtap= driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	 //tap
	 
	 TouchAction t = new TouchAction(driver);
	 t.tap(tapOptions().withElement(element(Expandtap))).perform();
	 
	 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	 
	 //longpress 

	 WebElement Peoplenameslongpress= driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	 
	 t.longPress(longPressOptions().withElement(element(Peoplenameslongpress)).withDuration(ofSeconds(2))).release().perform();
	 
	 Thread.sleep(2000);
	System.out.println(driver.findElementById("android:id/title").isDisplayed());
	System.out.println(driver.findElementById("android:id/title").getText());
	 
	 
	 
		
}

	

}