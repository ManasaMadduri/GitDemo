package Realpractice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class addingamountusingloops  extends base {

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
		
		int  Allselecteditemsamounts = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sum=0;
		for(int j=0;j<Allselecteditemsamounts;j++)	
		{
			
			String itemprice= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(j).getText();
			itemprice = itemprice.substring(1);
			double price = Double.parseDouble(itemprice);
			sum= sum + price;
		}
		
		System.out.println(sum);
		String Price= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Price = Price.substring(1);
		double TotalPriceactual= Double.parseDouble(Price);
		System.out.println(TotalPriceactual);
		Assert.assertEquals(sum,TotalPriceactual);
		
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	



