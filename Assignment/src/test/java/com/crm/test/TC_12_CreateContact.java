package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.generics.ExcelUtility;
import com.crm.generics.FileUtility;
import com.crm.objectrepository.Contacts;
import com.crm.objectrepository.NewContact;

public class TC_12_CreateContact extends BaseClass {
	
	@Test(groups="smokeTest")
	public void createCustomer() throws Throwable {
		
		/* TestData*/
		FileUtility jLib=new FileUtility();
		int randomNum = jLib.generateRandomNum();
		ExcelUtility exl=new ExcelUtility();
		String lastName = exl.getExcelData("CreateContact", 1, 2)+randomNum;
		String assignedoption = exl.getExcelData("CreateContact", 1, 3);
		
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		
		/* step 3 : navigate ot create contact Page */
		   con.getCreateOrgImg().click();
		   
		/* step 4 : create new contact with assignedTo */
		   NewContact nc=new NewContact(driver);
		   nc.creatContact(lastName, assignedoption);
	}

	
}
