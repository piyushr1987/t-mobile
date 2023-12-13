package com.tmobile.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.genericPage.BaseClass;

public class Coverage_RuralAndSmallTowns extends BaseClass {

	public Coverage_RuralAndSmallTowns() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[4]")
	private WebElement coverage;

	@FindBy(xpath = "//a[normalize-space()='Rural & Small Towns']")
	private WebElement rurAndSmaTown;

	@FindBy(xpath = "//span[normalize-space()='See business plans']")
	private WebElement btnBusinessPlan;

	@FindBy(xpath = "//button[@aria-label='Click to talk to an expert']")
	private WebElement btnLetsTalk;

	@FindBy(name = "First Name")
	private WebElement txtFirstName;

	@FindBy(name = "Last Name")
	private WebElement txtLastName;

	@FindBy(name = "Phone Number")
	private WebElement txtPhoneNo;

	@FindBy(name = "email")
	private WebElement txtEmail;

	@FindBy(name = "Zip Code")
	private WebElement txtZip;

	@FindBy(name = "Company Name")
	private WebElement txtCompanyName;

	@FindBy(xpath = "//div[@class='form-checkbox-global__inner']")
	private WebElement chkAccept;

	@FindBy(xpath = "//button[@id='captcha-button']")
	private WebElement btnSubmit;

	public void goToCoverage() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(coverage).build().perform();
		Thread.sleep(3000);
		act.moveToElement(rurAndSmaTown).click().build().perform();
	}

	public boolean validateSmallTownRuralAreaPage() {
		return driver.getCurrentUrl().contains("coverage/small-towns-rural-areas");
	}

	public void clickOnBusinessPlan() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnBusinessPlan);
	}

	public boolean validateBusinessPlanPage() {
		return driver.getCurrentUrl().contains("business/small-midsize-business");
	}

	public void clickOnLetsTalk() {
		btnLetsTalk.click();
		String childWindow = driver.getWindowHandle();
		driver.switchTo().window(childWindow);
	}

	public void enterCustomerInfo(String fname, String lname, String phone, String email, String zip, String cname) {
		txtFirstName.sendKeys(fname);
		txtLastName.sendKeys(lname);
		txtPhoneNo.sendKeys(phone);
		txtEmail.sendKeys(email);
		txtZip.sendKeys(zip);
		txtCompanyName.sendKeys(cname);
		chkAccept.click();
	}

	public void clickOnSubmit() {
		btnSubmit.click();
	}

}
