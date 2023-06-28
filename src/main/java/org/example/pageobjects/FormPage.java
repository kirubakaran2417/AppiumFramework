package org.example.pageobjects;

import org.example.utilities.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions{
	
	AndroidDriver driver;

	
	public FormPage(AndroidDriver driver)
	{
		super(driver);
		this.driver =driver;
		
	}
	//	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Shetty");
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameField;
	//	driver.findElement(By.id("com.androidsample.generalstore:id/nameField"))
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	private WebElement femaleOption;
	//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']"))
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male']")
	private WebElement maleOption;
	
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement shopButton;
	
	
	public void setNameField(String name)
	{
		nameField.sendKeys(name);
		driver.hideKeyboard();
		
	}
	
	public void setActivity()
	{
		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
		driver.startActivity(activity);
	}
	
	public void setGender(String gender)
	{
		if (gender.contains("female"))
			femaleOption.click();
		else
			maleOption.click();
			
	}
	
	public void setCountrySelection(String countryName)
	
	{
		
		WebElement countrySelection=driver.findElement(By.id("android:id/text1"));
		countrySelection.click();
		scrollToText(countryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
		
	}
	
	
	
	
	
	
	
}
