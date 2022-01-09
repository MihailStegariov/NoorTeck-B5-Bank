package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-transfers/div/div/div/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement originAccountDropDown;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-transfers/div/div/div/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement destinationAccountDropDown;

	@FindBy(xpath = "//input[@placeholder = 'Amount']")
	WebElement amountField;

	@FindBy(xpath = "//input[@placeholder = 'Social Security Number']")
	WebElement socialSecurityNumberField;

	@FindBy(xpath = "//input[@placeholder = 'ATM PIN']")
	WebElement atmPinField;

	@FindBy(xpath = "//span[text() = 'Transfer Funds']")
	WebElement transferFundsButton;

	@FindBy(css = ".card.mat-card")
	WebElement messageText;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}

	public void selectOriginAccount(String methodName, String indexTextValue) {
		selectFromDropdown(originAccountDropDown, methodName, indexTextValue);

	}

	public void selectDestinationAccount(String methodName, String indexTextValue) {
		selectFromDropdown(destinationAccountDropDown, methodName, indexTextValue);
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterSocialSecurity(String socialSecurity) {
		enter(socialSecurityNumberField, socialSecurity);
	}
	
	public void enterAtmPin(String pin) {
		enter(atmPinField, pin);
	}
	
	public void clickTransferFunds() {
		click(transferFundsButton);
	}
	public String message() {
		return getText(messageText);
	}
}