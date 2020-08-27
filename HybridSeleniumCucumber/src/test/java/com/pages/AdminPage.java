package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminPage extends Library {
	SeleniumUtilities util =new SeleniumUtilities(driver);
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(name="Submit")
	WebElement Loginbutton;
	
	@FindBy(xpath="//*[@id=\'menu_admin_viewAdminModule\']/b")
	WebElement Admin;
	
	//username in admin page
	@FindBy(id="searchSystemUser_userName")
	WebElement Uname;
	
	//emp name in admin search
	@FindBy(id="searchSystemUser_employeeName_empName")
	WebElement Empname;
	
	//userrole drop down in admin page
	@FindBy(id="searchSystemUser_userType")
	WebElement userrole;
	
	//status drop down in admin page
		@FindBy(id="searchSystemUser_status")
		WebElement status;
		
		//search
		@FindBy(id="searchBtn")
		WebElement searchbtn;
	
	
	//constructor
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}

	public void login(String uname,String pas) {
		username.sendKeys(uname);
		pwd.sendKeys(pas);
		
		Loginbutton.click();
		
	}

	//clicking admin functionality
	public void adminclick() {
		// TODO Auto-generated method stub
		Admin.click();
		
	}
	
	//searching user
	public void searchuser(String uname, String selectedValue, String element, String selectedValue1 ) {
		Uname.sendKeys("uname");
		util.dropdown(selectedValue, userrole);
		Empname.sendKeys("Empname");
		util.dropdown(selectedValue, status);
		
		searchbtn.click();
		
	}
	
	
}
