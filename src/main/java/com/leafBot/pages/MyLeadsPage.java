package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	public MyLeadsPage()
	{
		PageFactory.initElements(driver,this);
	}
    @FindBy(linkText="Create Lead") WebElement lead1;
	public CreateLeadPage clickCreateLead()
	{
		click(lead1);
		return new CreateLeadPage();
	}
}
