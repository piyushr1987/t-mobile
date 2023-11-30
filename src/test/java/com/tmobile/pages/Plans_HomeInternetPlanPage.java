package com.tmobile.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.genericPage.BaseClass;

public class Plans_HomeInternetPlanPage extends BaseClass {

	public Plans_HomeInternetPlanPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[1]")
	private WebElement plans;

	@FindBy(xpath = "//div[@class='unav-header__dropdown unav-header__dropdown--open']//li[5]")
	private WebElement homeInternet;

	@FindBy(xpath = "//a[@id='button-cc5bea8218']")
	private WebElement btnCheckAvailability;

	@FindBy(xpath = "//input[@id='field-eligibility-form-address-address']")
	private WebElement txtSearchAddress;

	@FindBy(xpath = "//button[text()=' Check availability ']")
	private WebElement btnCheck;

	@FindBy(xpath = "//div[@class='phx-form__header']/h1")
	private WebElement message;

	@FindBy(name = "firstName")
	private WebElement txtFirstName;

	@FindBy(name = "lastName")
	private WebElement txtLastName;

	@FindBy(name = "phone")
	private WebElement txtPhoneNo;

	@FindBy(name = "email")
	private WebElement txtEmail;

	@FindBy(xpath = "//button[text()=' Join the waitlist ']")
	private WebElement btnJoin;

	public void goToPlans() {
		Actions act = new Actions(driver);
		act.moveToElement(plans).build().perform();
		act.moveToElement(homeInternet).click().build().perform();
	}

	public boolean validateHomeInternetpage() {
		return driver.getCurrentUrl().contains("HomeInternet");
	}

	public void clickOnCheckAvailability() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnCheckAvailability);

	}

	public boolean validateHomeInternetAvailabilityPage() {
		return driver.getCurrentUrl().contains("home-internet/eligibility");
	}

	public void enterTheAddress(String addr) throws InterruptedException {
		txtSearchAddress.sendKeys(addr);
		Thread.sleep(3000);

		String text;
		do {
			txtSearchAddress.sendKeys(Keys.ARROW_DOWN);
			text = txtSearchAddress.getAttribute("value");
			if (text.equalsIgnoreCase(prop.getProperty("expAddress"))) {

				txtSearchAddress.sendKeys(Keys.ENTER);
				break;
			}
		} while (!text.isEmpty());
	}

	public void clickOnAddressAvailability() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnCheck);

	}

	public boolean validateAlertMessage(String expMessage) {
		String actMessage = message.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validateAddressSignUpPage() {
		return driver.getCurrentUrl().contains("waitlist-sign-up");
	}

	public void enterFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void enterPhoneNo(String phone) {
		txtPhoneNo.sendKeys(phone);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void clickOnJoin() {
		btnJoin.click();
	}

	public boolean validateWaitlistPage() {
		return driver.getCurrentUrl().contains("waitlist-confirmation");
	}

}
