package appiumPractiece;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class checking {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	File f= new File("src");

	File fs=new File(f,"ApiDemos-debug.apk");

	DesiredCapabilities cap=new DesiredCapabilities();
	DesiredCapabilities.android();
	cap.setCapability("deviceName", "Hemanth");
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Hemanth");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());



	AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
}
}