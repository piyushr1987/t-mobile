package com.tmobile.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.genericPage.BaseClass;

public class JoinUsPage extends BaseClass {

	public JoinUsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[5]")
	private WebElement joinUs;

	@FindBy(xpath = "//a[normalize-space()='Travel']")
	private WebElement travel;

	@FindBy(xpath = "//li[@class='phx-shortcuts__item'][3]")
	private WebElement onTheRoad;

	@FindBy(xpath = "//a[@id='button-6ae8d3b5ee']")
	private WebElement findOutMore;

	@FindBy(xpath = "//a[contains(@id,'button-2d')]")
	private WebElement shopPlan;

	@FindBy(xpath = "//p[normalize-space()='Military & veteran']")
	private WebElement military;

	@FindBy(xpath = "//h2[normalize-space()='Go5G Next Military']")
	private WebElement go5G;

	@FindBy(xpath = "//button[@aria-label='Select Go5G Next Military Plan']//span[@class='mat-button-wrapper']")
	private WebElement selectPhonePlan;

	public void goToJoinUs() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(joinUs).build().perform();
		Thread.sleep(3000);
		act.moveToElement(travel).click().build().perform();
	}

	public boolean validateTravelPage() {
		return driver.getCurrentUrl().contains("travel?INTNAV");
	}

	public void clickOnTheRoad() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", onTheRoad);
	}

	public void clickOnFindOutMore() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", findOutMore);
	}

	public boolean validateAAAMembershipPlanPage() {
		return driver.getCurrentUrl().contains("aaa-membership-deal");
	}

	public void clickOnShopPlan() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", shopPlan);
	}

	public boolean validateCellphonePlanPage() {
		return driver.getCurrentUrl().contains("cell-phone-plans");
	}

	public void clickOnMilitaryAndVeteran() {
		military.click();
	}

	public boolean validateGo5GNextMilitaryTitle(String expTitle) {

		String actTitle = go5G.getText();
		if (actTitle.equalsIgnoreCase(expTitle)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnSelectPhonePlan() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", selectPhonePlan);
	}

	public boolean validateCartPage() {
		return driver.getCurrentUrl().contains("cart");
	}

}
