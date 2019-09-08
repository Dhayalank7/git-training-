package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="inputBox")WebElement company1;
	@FindBy(id="createLeadForm_firstName") WebElement firstname1;
	@FindBy(id="createLeadForm_lastName") WebElement lastname1;
	@FindBy(xpath="//input[@class='smallSubmit']") WebElement submit;
	public CreateLeadPage enterCompanyName(String company)
	{
		clearAndType(company1, company);
		return this;
	}
   public CreateLeadPage enterFirstName (String firstname)
   {
	   clearAndType(firstname1, firstname);
	   return this;
   }
   public CreateLeadPage enterLastName(String lastname)
   {
	  clearAndType(lastname1, lastname);
	   return this;
   }
   
   public ViewLeadPage ClickCreateLeadButton()
   {
	   click(submit);
	   return new ViewLeadPage();
   }
   
}
