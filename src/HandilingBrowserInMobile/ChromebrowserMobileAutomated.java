package HandilingBrowserInMobile;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChromebrowserMobileAutomated extends BrowserEntery {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		
		driver.findElement(By.cssSelector("a[herf*='prodcuts']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");		
		
		String  ThirdElement = driver.findElement(By.xpath("//li[@class='list-group-item'])[3]/div/div/a")).getText();
		
		System.out.println(ThirdElement);
		Assert.assertEquals(ThirdElement, "Devops");
		
		
		
		

}}
