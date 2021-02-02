package com.crm.generics;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

/**
 * Base class having all the common test steps required for every test script
 * @author Prabhat
 *
 */

public class BaseClass {
	
	public static WebDriver driver;
	
	public FileUtility fu=new FileUtility();
	public WebDriverUtiles wlib=new WebDriverUtiles();
	public DataBaseUtilities dbLib = new DataBaseUtilities();
	
	public ExcelUtility excelLib = new ExcelUtility();
	

	
	
	@BeforeSuite(groups = {"smokeTest" , "regressionTest"})
	public void configBS() {
		System.out.println("connect to database\n configure extent report");
		dbLib.connectToDB();
	}
	
	@BeforeTest(groups = {"smokeTest" , "regressionTest"})
	public void configBT() {
		//used for cross browser exceution
	}
	
	@Parameters("browser")
	
	@BeforeClass(groups = {"smokeTest" , "regressionTest"})
	public void openBrowser() throws Throwable {
		String browser = fu.getPropertyKeyValue("BROWSER");
		 if(browser.equalsIgnoreCase("firefox")) {
		    driver= new FirefoxDriver();  
		 }else if(browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		 }else if(browser.equalsIgnoreCase("ie")) {
			 driver = new InternetExplorerDriver();
		 }
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
	
	
	@BeforeMethod
	public void loginApp() throws Throwable {
		driver.get(fu.getPropertyKeyValue("URL"));
		driver.findElement(By.name("user_name")).sendKeys(fu.getPropertyKeyValue("UN"));
		driver.findElement(By.name("user_password")).sendKeys(fu.getPropertyKeyValue("PW"));
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod
	public void logoutApp() {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	
	@AfterTest(groups = {"smokeTest" , "regressionTest"})
	public void configAT() {
		//close browser launched in cross browser testing
	}
	
	
	@AfterSuite(groups = {"smokeTest" , "regressionTest"})
	public void configAS() throws SQLException {
		
		System.out.println("close connection to database\n flush extent report");
		dbLib.closeDb();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
