package com.tmobile.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tmobile.genericPage.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='unav-header__logo unav-header__logo--desktop']//a")
	private WebElement companyLogo;

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[1]")
	private WebElement plans;

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[5]")
	private WebElement joinUs;

	@FindBy(xpath = "//div[contains(@class,'unav-header__aside')]/div[3]")
	private WebElement cart;

	@FindBy(xpath = "//div[contains(@class,'unav-header__aside')]/div[4]")
	private WebElement search;

	@FindBy(xpath = "//div[contains(@class,'unav-header__aside')]/div[5]")
	private WebElement myAccount;

	@FindBy(xpath = "//div[contains(@class,'unav-footer__aside')]/div[2]//li[1]")
	private WebElement english;

	@FindBy(xpath = "//div[contains(@class,'unav-footer__aside')]/div[2]//li[2]")
	private WebElement spain;

	public boolean validateCompanyLogo() {
		return companyLogo.isDisplayed();
	}

	public boolean validatePlans() {
		return plans.isDisplayed();
	}

	public boolean validateJoinUs() {
		return joinUs.isDisplayed();
	}

	public boolean validateCart() {
		return cart.isDisplayed();
	}

	public boolean validateSearch() {
		return search.isDisplayed();
	}

	public boolean validateMyAccount() {
		return myAccount.isDisplayed();
	}

	public void clickOnEnglish() {

		english.click();
	}

	public void clickOnSpain() {

		spain.click();
	}

}
