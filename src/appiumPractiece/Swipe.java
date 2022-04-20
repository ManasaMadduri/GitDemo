package appiumPractiece;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends Installation{
	public static void main (String[] args) throws  MalformedURLException, InterruptedException
	{

	
	 AndroidDriver<AndroidElement> driver= Capabilities();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		
		driver.findElementByAndroidUIAutomator("(text(\"2. Inline\")").click();
	
		driver.findElementByXPath("//*[@conctect-desc='9']").click();
 
		TouchAction t = new TouchAction(driver);
	 
		WebElement fifteenlongpress= driver.findElementByXPath("//*[@conctect-desc='15']");
		WebElement secondlongpress= driver.findElementByXPath("//*[@conctect-desc='45']");
		t.longPress(longPressOptions().withElement(element(fifteenlongpress)).withDuration(ofSeconds(2))).moveTo(element(secondlongpress)).release().perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


}
}