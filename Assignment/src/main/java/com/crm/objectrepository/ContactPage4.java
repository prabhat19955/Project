package com.crm.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generics.WebDriverUtiles;

public class ContactPage4 {
	
	WebDriverUtiles wb=new WebDriverUtiles();
	
	WebDriver driver;
	public ContactPage4(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "lastname")
	private WebElement lastNameEdt;
	
	@FindBy(xpath="(//input[@class='crmbutton small create'])[1]")
	private WebElement duplicatebtn;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(name="search_text")
	private WebElement searchtext;
	
	@FindBy(name="search_field")
	private WebElement searchdropdown;
	
	
	@FindBy(xpath="(//option[.='Last Name'])[1]")
	private WebElement selectlname;
	
	@FindBy(xpath="(//input[@class='crmbutton small create'])[1]")
	private WebElement searchbtn;
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getSearchtext() {
		return searchtext;
	}


	public WebElement getSearchdropdown() {
		return searchdropdown;
	}


	public WebElement getSelectlname() {
		return selectlname;
	}


	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}


	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void CreateCustomer(String lastName) {
		lastNameEdt.sendKeys(lastName);
		saveBtn.click();
	}
	
	public void duplicateContact(String lastName ) {
		searchtext.sendKeys(lastName);
		searchdropdown.click();
		selectlname.click();
		searchbtn.click();
		driver.findElement(By.xpath("//a[.='"+lastName+"']")).click();
		duplicatebtn.click();
		saveBtn.click();
		
	}
}
