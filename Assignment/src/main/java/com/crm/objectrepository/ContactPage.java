package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generics.WebDriverUtiles;

public class ContactPage {
	WebDriverUtiles wd=new WebDriverUtiles();
	
	WebDriver driver;
	public ContactPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement selectall;
	
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deletebtn;

	public WebElement getSelectall() {
		return selectall;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}
	
	public void deleteContact() {
		selectall.click();
		deletebtn.click();
		wd.alertOK(driver);
		
	}

}
