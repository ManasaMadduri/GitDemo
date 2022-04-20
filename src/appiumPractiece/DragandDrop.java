package appiumPractiece;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragandDrop extends Installation {
	
	public static void main(String[] args) throws MalformedURLException
	{
		
		AndroidDriver<AndroidElement> driver =Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		WebElement firstdragoption= driver.findElementsByClassName("android.widget.TextView").get(0);
		WebElement destinationdragoption= driver.findElementsByClassName("android.widget.TextView").get(1);

		TouchAction t = new TouchAction(driver);
		
	  // t.longPress(longPressOptions().withElement(element(firstdragoption))).moveTo(element(destinationdragoption)).release().perform();                                        

	   t.longPress(element(firstdragoption)).moveTo(element(destinationdragoption)).release().perform();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
