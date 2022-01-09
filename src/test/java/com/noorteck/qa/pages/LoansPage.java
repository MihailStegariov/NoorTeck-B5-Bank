package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {

	@FindBy(xpath = "//input[@placeholder = 'First name, Last name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@placeholder = 'Street, City, Zip Code']")
	WebElement addressField;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-loans/div/div[2]/mat-horizontal-stepper/div[2]/div[1]/form/mat-form-field[3]/div/div[1]/div/mat-select/div/div[1]/span")
	WebElement loanTypeDropDown;

	@FindBy(xpath = "//input[@placeholder = 'Ex. 1 Year']")
	WebElement yearsToRepayLoanField;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-loans/div/div[2]/mat-horizontal-stepper/div[2]/div[1]/form/div/button/span")
	WebElement nextButton;

	@FindBy(xpath = "//input[@placeholder = 'Ex. 10000']")
	WebElement amountField;

	@FindBy(xpath = "//input[@placeholder = 'Ex. Smith']")
	WebElement motherMaidenNameField;

	@FindBy(xpath = "//input[@placeholder = 'Format: XXX-XX-XXXX']")
	WebElement socialSecurityNumber;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-loans/div/div[2]/mat-horizontal-stepper/div[2]/div[2]/form/div/button[2]/span")
	WebElement backButton;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-loans/div/div[2]/mat-horizontal-stepper/div[2]/div[2]/form/div/button[2]/span")
	WebElement nextButtonTwo;

	@FindBy(xpath = "//span[text() = 'Confirm']")
	WebElement confirmButton;

	@FindBy(xpath = "/html/body/app-root/mat-sidenav-container/mat-sidenav-content/main/app-loans/div/div[2]/mat-horizontal-stepper/div[2]/div[3]/div/button[2]/span")
	WebElement backButtonTwo;

	@FindBy(xpath = "//span[text() = 'Reset']")
	WebElement resetButton;
	
	//TODO Submission Success text

	public void LoanPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterName(String name) {
		enter(nameField, name);
	}

	public void enterAddress(String address) {
		enter(addressField, address);
	}

	public void selectLoanType(String methodName, String indexTextValue) {
		selectFromDropdown(loanTypeDropDown, methodName, indexTextValue);
	}

	public void enterYearsToRepayLoan(String yearsToRepayLoan) {
		enter(yearsToRepayLoanField, yearsToRepayLoan);
	}

	public void clickNext() {
		click(nextButton);
	}

	public void enterAmount(String amount) {
		enter(amountField, amount);
	}

	public void enterMotherMaidenName(String motherName) {
		enter(motherMaidenNameField, motherName);
	}

	public void enterSocialSecurityNumber(String ssn) {
		enter(socialSecurityNumber, ssn);
	}

	public void clickBack() {
		click(backButton);
	}

	public void clickNextTwo() {
		click(nextButtonTwo);
	}

	public void clickConfirm() {
		click(confirmButton);
	}

	public void clickBackTwo() {
		click(backButtonTwo);
	}

	public void clickReset() {
		click(resetButton);
	}
}
