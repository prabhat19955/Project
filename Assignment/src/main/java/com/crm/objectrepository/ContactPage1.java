package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generics.WebDriverUtiles;

public class ContactPage1 {
	
WebDriverUtiles wd=new WebDriverUtiles();
	
	WebDriver driver;
	public ContactPage1(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='del']")
	private WebElement dbtn;
	
	public WebElement getDbtn() {
		return dbtn;
	}
	
	public void delContact() {
		dbtn.click();
		wd.alertOK(driver);
	}

}
