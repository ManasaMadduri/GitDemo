package Realpractice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ErorMesgPrint extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoview(text(\"Argentina\"));");
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
	//togettoastmessage class name =andriod.widget.Toast for all the apps
		
		String Errormsg = driver.findElement(By.xpath("andriod.widget.Toast[1]")).getAttribute("name");
		System.out.println(Errormsg);		
		Assert.assertEquals("Please enter Your name", Errormsg);
		
	}

}



