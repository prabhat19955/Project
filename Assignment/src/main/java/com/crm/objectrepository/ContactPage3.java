package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage3 {
	
	WebDriver driver;
	public ContactPage3(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Last Viewed']")
	private WebElement viewimg;
	
	public WebElement getViewimg() {
		return viewimg;
	}

	public void setViewimg(WebElement viewimg) {
		viewimg.click();
	}
	
	
	

}
