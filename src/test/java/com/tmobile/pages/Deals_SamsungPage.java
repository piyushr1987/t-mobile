package com.tmobile.pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tmobile.genericPage.BaseClass;

public class Deals_SamsungPage extends BaseClass {

	public Deals_SamsungPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[3]")
	private WebElement deals;

	@FindBy(xpath = "//a[normalize-space()='Samsung']")
	private WebElement samsung;

	@FindBy(xpath = "//span[normalize-space()='Phones']")
	private WebElement phones;

	@FindBy(xpath = "//div[@class='xpr-card__cta ']/a[@id='button-66478831bf']")
	private WebElement samsungGalaxy;

	@FindBy(xpath = "//button[@data-testid='close-button']")
	private WebElement btnClose;

	@FindBy(xpath = "//div[@class='promo-badge-component wrapper--promo-badge-component-AXyWsE3A-bQ aem-GridColumn aem-GridColumn--default--12']//span[contains(text(),'See 2 deals')]")
	private WebElement seeDeals;

	@FindBy(xpath = "//div[@id='check-location']")
	private WebElement checkLocation;

	@FindBy(xpath = "//input[@id='mat-input-3']")
	private WebElement txtFindStore;

	@FindBy(xpath = "//button[@aria-label='Broadway & Park Place Choose this store']//span[@class='mat-button-wrapper'][normalize-space()='Choose this store']")
	private WebElement chooseThisStore;

	public void goToDeals() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(deals).build().perform();
		Thread.sleep(3000);
		act.moveToElement(samsung).click().build().perform();
	}

	public boolean validateSamsungPage() {
		return driver.getCurrentUrl().contains("samsung-phone-deals");
	}

	public void clickOnPhones() {
		Actions act = new Actions(driver);
		act.moveToElement(phones).build().perform();
		phones.click();
	}

	public void clickOnSamsungGalaxy() {
		samsungGalaxy.click();
	}

	public boolean validateSamsungGalaxyPage() {
		return driver.getCurrentUrl().contains("/samsung-galaxy-a54");
	}

	public void clickOnSee2Deals() {
		seeDeals.click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
		}
		btnClose.click();
	}

	public void clickOnLocation() {
		checkLocation.click();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
		}
	}

	public void enterCityName(String city) throws InterruptedException {
		txtFindStore.sendKeys(city);
		Thread.sleep(5000);
		txtFindStore.sendKeys(Keys.ENTER);
	}

	public void clickOnBroadwayStore() {
		chooseThisStore.click();
	}

}
