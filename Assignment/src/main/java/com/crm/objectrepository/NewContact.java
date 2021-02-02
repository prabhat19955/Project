package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generics.WebDriverUtiles;

public class NewContact extends WebDriverUtiles{

	
	WebDriver driver;
	public NewContact(WebDriver driver) {  
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "lastname")
	private WebElement lastNameEdt;
	
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="(//input[@onclick='toggleAssignType(this.value)'])[2]")
	private WebElement radiobtn;
	
	@FindBy(xpath="(//select[@class='small'])[5]")
	private WebElement assignedTo;
	
	public WebElement getAssignedTo() {
		return assignedTo;
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}
	
	public void creatContact(String lastName , String assignedoption) throws Throwable {
		lastNameEdt.sendKeys(lastName);
		radiobtn.click();
		select(assignedTo, assignedoption);
		saveBtn.click();
		
	}

}
