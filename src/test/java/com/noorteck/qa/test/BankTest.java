package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "https://usdemo.vee24.com/#/transactions";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testOne();
		testTwo();
		CommonUI.quitBrowser();
		// TODO Compare if displayed message is the same
	}

	public static void testOne() {

		homeObj.clickTransfer();
		transferObj.selectOriginAccount("text","Rainy Day ");
		transferObj.selectDestinationAccount("text", "Investing ");
		transferObj.enterAmount("1000");
		transferObj.enterSocialSecurity("1234567");
		transferObj.enterAtmPin("1235");
		transferObj.clickTransferFunds();
		//TODO transferObj.getText(null)

	}

	public static void testTwo() {
		CommonUI.openBrowser("chrome");
		homeObj.clickLoans();
		loansObj.enterName("John Cena");
		loansObj.enterAddress("123 Java Drive");
		loansObj.selectLoanType("value", "Retirement");
		loansObj.enterYearsToRepayLoan("2");
		loansObj.clickNext();
		loansObj.enterAmount("5000");
		loansObj.enterMotherMaidenName("Kim");
		loansObj.enterSocialSecurityNumber("123456778");
		loansObj.clickNextTwo();
		loansObj.clickConfirm();
		//TODO verify "Submission Success!" message is displayed

	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */