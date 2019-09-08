package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002CreateLead extends ProjectSpecificMethods{
  @BeforeTest
  public void setData()
  {
	  testcaseName="TC002CreateLead";
	testcaseDec="createLead";
	author="dhaya";
	category="Regression";
	 excelFileName="CreateLead";
	  
        
  }

	 

  
  @Test(dataProvider="fetchData")
  public void runCreateLead(String CompanyName,String FirstName,String LastName,String CompanyName1)
  {
	  new LoginPage()
	  .enterUsername("DemoSalesManager")
	  .enterPassword("crmsfa")
	  .clickLogin()
	  .clickCRMSFA()
	  .clickLeads()
	  .clickCreateLead()
	  .enterCompanyName(CompanyName)
	  .enterFirstName(FirstName)
	  .enterLastName(LastName)
	  .ClickCreateLeadButton()
	  .VerifyFirstName(CompanyName1);
  }
}
