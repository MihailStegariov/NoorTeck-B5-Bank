package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[2]/a/span")
	WebElement transferButton;
	
	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[4]/a/span")
	WebElement loansButton;
	
	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div[3]/ul/li[5]/a/span")
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
