package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends  ProjectSpecificMethods {
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username") WebElement username1;
	@FindBy(id="password") WebElement password1;
	@FindBy(className="decorativeSubmit") WebElement submit;
	public LoginPage enterUsername(String username) {
		//driver.findElementById("username").sendKeys(username);
	clearAndType(username1, username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		//driver.findElementById("password").sendKeys(password);
		clearAndType(password1, password);
		return this;
	}

	public HomePage clickLogin() {
		click(submit);
		//HomePage page = new HomePage();
		return new HomePage();
	}

}










