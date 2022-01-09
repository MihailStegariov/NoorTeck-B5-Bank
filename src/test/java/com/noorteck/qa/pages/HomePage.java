package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath = "//li//a//span[text() = 'Transfer']")
	WebElement transferButton;
	
	@FindBy(xpath = "//li//a//span[text() = 'Loans']")
	WebElement loansButton;
	
	@FindBy(xpath = "//li//a//span[text() = 'LogOut']")
	WebElement logOutButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTransfer() {
		click(transferButton);
	}
	
	public void clickLoans() {
		click(loansButton);
	}
	
	public void clickLogOut() {
		click(logOutButton);
	}
}
