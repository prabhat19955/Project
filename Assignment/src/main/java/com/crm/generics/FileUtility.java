package com.crm.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

/**
 * 
 * @author Prabhat
 *
 */
public class FileUtility {
	
	/**
	 * used to get data from property file based on key
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getPropertyKeyValue(String key) throws Throwable  {
		  
			FileInputStream fis = new FileInputStream(IConstant.commonDataFilePath);
			 Properties pObj = new Properties();
			 pObj.load(fis);
			 String value = pObj.getProperty(key);
		
		return value;
	}
	
	/**
	 * used to generate Ramdom number  start from 0 to 10000
	 * @return
	 */
	public int  generateRandomNum() {
		Random random = new Random();
		 int randomInt = random.nextInt(10000);

		 return randomInt;
	}

}
