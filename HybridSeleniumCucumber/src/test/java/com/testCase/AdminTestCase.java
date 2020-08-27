package com.testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;

public class AdminTestCase extends Library {
	AdminPage Apage;
	@BeforeTest
	public void stratUp() {
		browserSetUp();
		logger.info("browser launched and navigate to url");
		//launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test(priority =1)
	public void login() {
		 // LoginPage lpage=new LoginPage(driver);
		  //lpage.login("Admin","admin123");
		Apage=new AdminPage(driver);
		Apage.login("Admin","admin123");
	
	}
	
	
	
	@Test(priority =2)
	public void adminclick() {
		//page=new AdminPage(driver);
		 Apage.adminclick();
		Apage.searchuser("kelvin", "All", " kel mat", "Enabled");
		
	
	}
	
	

}
