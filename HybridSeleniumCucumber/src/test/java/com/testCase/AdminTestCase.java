package com.testCase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminTestCase extends Library {
	AdminPage Apage;
	@BeforeTest
	public void stratUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test(priority =1)
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.login("Admin","admin123");
	
	}
	
	
	
	@Test(priority =2)
	public void adminclick() {
		 Apage=new AdminPage(driver);
		 Apage.adminclick();
		Apage.searchuser("kelvin", "All", " kel mat", "Enabled");
		
	
	}
	
	
	
	
	@AfterClass
	public void close() throws IOException {
		SeleniumUtilities sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src\\test\\resources\\ScreenShot\\OrangeHrmLogin.png");
		
		quit();
		
	}

}
