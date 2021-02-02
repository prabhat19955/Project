package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage2 {
	
	WebDriver driver;
	public ContactPage2(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='edit']")
	private WebElement editbtn;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void editContact() {
		editbtn.click();
		saveBtn.click();
	}
	

}
