package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.Contacts;

public class TC_13_DeleteContact extends BaseClass {
	
	@Test(groups="smokeTest")
	public void deleteCustomer() {
		
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		
		/* step 2 : select all contacts & delete */
		ContactPage cp=new ContactPage(driver);
		cp.deleteContact();
		
		
	}

}
