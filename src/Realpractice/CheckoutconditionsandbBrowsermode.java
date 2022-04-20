package Realpractice;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.offset.ElementOption.element;;

public class CheckoutconditionsandbBrowsermode extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("Manasa");	
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Manasa");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoview(text(\"Argentina\"));");
   //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));   
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		int Sizeofitems = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		System.out.println(Sizeofitems);
		for(int i=0;i<Sizeofitems;i++)
		{
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		Thread.sleep(5000);
		String Amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		double Amount1price=Double.parseDouble(Amount1);

		String Amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();

		double Amount2price=Double.parseDouble(Amount2);


		double totalpriceexpected =Amount1price+Amount2price;
		System.out.println(totalpriceexpected);
		
		String Price= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
			
		Price = Price.substring(1);
		double TotalPriceactual= Double.parseDouble(Price);
		System.out.println(TotalPriceactual);
		
		//Assert.assertEquals(totalpriceexpected,TotalPriceactual);
		
		WebElement Checkbox= driver.findElement(By.className("android.widget.CheckBox"));
		
		 TouchAction t = new TouchAction(driver);
		 
		 t.tap(tapOptions().withElement(element(Checkbox))).perform();

		 //longpress 

		 WebElement linklongpress= driver.findElementByXPath("//*[@text='Please read our terms of conditions']");
		 
		 t.longPress(longPressOptions().withElement(element(linklongpress)).withDuration(ofSeconds(2))).release().perform();
		 
		 WebElement close = driver.findElement(By.id(" android:id/button1"));
		
		 t.tap(tapOptions().withElement(element(close))).perform();

		 driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();//this will navigate to webpage of chrome
		 
		 Thread.sleep(7000);
		 
		 Set<String> contextNames = driver.getContextHandles();
		 for (String contextName : contextNames) 
		 {
		     System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		 } 
		 driver.context("Webview"); 
		 
		    WebDriver driver1= new ChromeDriver();
		    

		    driver1.findElement(By.name("q")).sendKeys("Hello");
		    
		    driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.pressKey(new KeyEvent(AndroidKey.BACK));
		    driver.context("NATIVE_APP"); 
		   	
		
	}
		
		public static double getAmount(String value)
		{  
			
			value = value.substring(1);
			double amount2value=Double.parseDouble(value);
			return amount2value;
			
		}
		
	
		
	
			

}
