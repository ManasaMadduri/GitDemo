package Realpractice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AmoutcheckingasperSKU extends base {

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

		Amount1 = Amount1.substring(1);
		double Amount1price= Double.parseDouble(Amount1);
		
		String Amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();

		Amount2=Amount2.substring(1);
		double Amount2price= Double.parseDouble(Amount2);

		double totalpriceexpected =Amount1price+Amount2price;
		System.out.println(totalpriceexpected);
		
		String Price= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
			
		Price = Price.substring(1);
		double TotalPriceactual= Double.parseDouble(Price);
		System.out.println(TotalPriceactual);
		
		Assert.assertEquals(totalpriceexpected,TotalPriceactual);
		
		
//		public static double getAmount(String value)
//		{  
//			
//			value = value.substring(1);
//			double amount2value=Double.parseDouble(value);
//			return amount2value;
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}