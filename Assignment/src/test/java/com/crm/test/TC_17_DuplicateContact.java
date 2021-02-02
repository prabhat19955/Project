package com.crm.test;



import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.generics.ExcelUtility;
import com.crm.generics.FileUtility;
import com.crm.objectrepository.ContactPage4;
import com.crm.objectrepository.Contacts;




public class TC_17_DuplicateContact extends BaseClass  {
	
	@Test
	public void createDuplicateContact() throws Throwable {
	
	/* Test Data */
	FileUtility jLib=new FileUtility();
	ExcelUtility exl=new ExcelUtility();
	int randomNum = jLib.generateRandomNum();
	String lastName = exl.getExcelData("CreateContact", 1, 2)+randomNum;
	
	
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		con.getCreateOrgImg().click();
		
		/* Step 2 : Create new Contact */
		ContactPage4 cp4=new ContactPage4(driver);
		cp4.CreateCustomer(lastName);
		
        /* step 3 : navigate to Contact page */
		con.getContactLnk().click();
		
		/* step 4 : search contact & make duplicate */
		   cp4.duplicateContact(lastName);
		
		}
	
}
