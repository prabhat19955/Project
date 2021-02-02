package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.objectrepository.ContactPage3;
import com.crm.objectrepository.Contacts;

public class TC_16_ViewContact extends BaseClass{
	
	@Test
	public void viewContact() {
		
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		
		/* step 2 : view contacts  */
		ContactPage3 cp3=new ContactPage3(driver);
		cp3.getViewimg();
	}

}
