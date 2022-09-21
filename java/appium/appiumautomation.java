package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appiumautomation {
	
	
	 public AndroidDriver<MobileElement> driver;
	    public WebDriverWait   wait;
	
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("deviceName", "redmi");
        capability.setCapability("platformVersion", "11");
        capability.setCapability("platformName", "Android");
        capability.setCapability("appPackage","com.wt.apkinfo");
        capability.setCapability("appActivity","com.wt.apkinfo.activities.StartActivity");
        
        capability.setCapability("appActivity","com.wt.apkinfo.activities.AppDetailsActivity");
        
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
        //wait = new WebDriverWait(driver, 10);
	}

}
