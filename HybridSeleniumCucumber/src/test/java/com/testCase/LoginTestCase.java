package com.testCase;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class LoginTestCase extends Library {
	@BeforeTest
	public void stratUp() {
		browserSetUp();
		logger.info("browser launched and navigate to url");
	}
	@Test
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.login(properties.getProperty("username"),properties.getProperty("pass"));
		//lpage.login("Admin","admin123");
	   logger.info("log in successful");
	}
	@AfterClass
	public void close() throws IOException {
		SeleniumUtilities sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src\\test\\resources\\ScreenShot\\OrangeHrmLogin.png");
		logger.info("taken screenshot");
		tearDown();
		
	}

}
