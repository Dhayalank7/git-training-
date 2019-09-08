package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="viewLead_firstName_sp") WebElement user;
	public void VerifyFirstName(String username1)
	{
		verifyPartialText(user,username1);
		
	}	
}
