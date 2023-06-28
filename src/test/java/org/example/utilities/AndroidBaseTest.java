package org.example.utilities;

import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.example.pageobjects.FormPage;
import org.testng.annotations.AfterClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidBaseTest extends AppiumUtils{

	public AndroidDriver driver;

	public FormPage formPage;
	
	public AndroidDriver ConfigureAppium() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\example\\resources\\data.properties");
		
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		System.out.println(ipAddress);
		String port = prop.getProperty("port");
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName(prop.getProperty("AndroidDeviceName")); 
			options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\org\\example\\resources\\General-Store.apk");
			driver=new AndroidDriver(new URL("http://"+ipAddress+":"+port),options);
			return driver;
	}
	
	


	
	public void tearDown()
	{
		driver.quit();
		}
	
}
