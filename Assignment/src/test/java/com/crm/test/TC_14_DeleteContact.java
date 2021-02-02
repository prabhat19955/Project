package com.crm.test;

import org.testng.annotations.Test;

import com.crm.generics.BaseClass;
import com.crm.objectrepository.ContactPage1;
import com.crm.objectrepository.Contacts;

public class TC_14_DeleteContact extends BaseClass {
	
	@Test(groups="RegressionTest")
	public void deleteCustomer() {
		
		/* step 1 : navigate to Contact page */
		Contacts con=new Contacts(driver);
		con.getContactLnk().click();
		
		/* step 2 : In action column click on del & delete contact */
		ContactPage1 con1=new ContactPage1(driver);
		con1.delContact();
	}

}
