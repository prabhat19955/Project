package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.objectrepository.ContactPage2;
import com.crm.objectrepository.Contacts;

public class TC_15_EditContact extends BaseClass{
	
	@Test(groups="RegressionTest")
	public void editCustomer() {
		
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		
		/* step 2 : edit contacts & save */
		ContactPage2 cp2=new ContactPage2(driver);
		cp2.editContact();
		
		
		
	}

}
