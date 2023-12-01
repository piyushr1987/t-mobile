package com.tmobile.pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmobile.genericPage.BaseClass;

public class PhonesAndDevices_TabletsPage extends BaseClass {

	public PhonesAndDevices_TabletsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='unav-nav unav-headerNav']/li[2]")
	private WebElement phoneAndDevices;

	@FindBy(xpath = "//span[@class='ng-tns-c390-28 ng-star-inserted'][normalize-space()='Tablets']")
	private WebElement tablets;

	@FindBy(xpath = "//legend[normalize-space()='Deals']")
	private WebElement deals;

	@FindBy(xpath = "//div[@id='cdk-accordion-child-2']//label")
	private List<WebElement> allDeals;

	@FindBy(xpath = "//legend[normalize-space()='Brands']")
	private WebElement brands;

	@FindBy(xpath = "//div[@id='cdk-accordion-child-3']//label")
	private List<WebElement> allBrands;

	@FindBy(xpath = "//legend[normalize-space()='Operating System']")
	private WebElement operatingSystem;

	@FindBy(xpath = "//div[@id='cdk-accordion-child-4']//label")
	private List<WebElement> allOperatingSystem;

	@FindBy(xpath = "//mat-select-trigger[@class='ng-tns-c145-22 ng-star-inserted']")
	private WebElement drpSortBy;

	@FindBy(xpath = "//span[normalize-space()='Highest Rating']")
	private WebElement lblHighestRating;

	@FindBy(xpath = "//*[text()=' Galaxy Tab S7 FE 5G ']/parent::div/parent::a")
	private WebElement samsungGalaxy;

	public void goToPhoneAndDevices() {
		Actions act = new Actions(driver);
		act.moveToElement(phoneAndDevices).build().perform();
		act.moveToElement(tablets).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(tablets));
		tablets.click();
	}

	public boolean validateTabletsPage() {
		return driver.getCurrentUrl().contains("tablets?INTNAV");
	}

	public void clickOnDeals() {
		deals.click();
		selectDeals(allDeals, prop.getProperty("dealName"));
	}

	public void clickOnBrands() {
		brands.click();
		selectBrands(allBrands, prop.getProperty("brandName"));
	}

	public void clickOnOperatingSystem() {
		operatingSystem.click();
		selectOperatingSystem(allOperatingSystem, prop.getProperty("OSName"));
	}

	public void clickOnSortBy() {
		drpSortBy.click();
	}

	public void clickOnHighestRating() {
		lblHighestRating.click();
	}

	public void clickOnSamsung() {
		samsungGalaxy.click();
	}

	public boolean validateSamsungTabletsPage() {
		return driver.getCurrentUrl().contains("samsung-galaxy-tab-s7-");
	}

	public static List<WebElement> selectDeals(List<WebElement> dealFilters, String label) {
		for (int i = 0; i < dealFilters.size(); i++) {
			if (dealFilters.get(i).getText().equalsIgnoreCase(label)) {
				dealFilters.get(i).click();
				break;
			}
		}
		return dealFilters;
	}

	public static List<WebElement> selectBrands(List<WebElement> brandFilters, String label) {
		for (int i = 0; i < brandFilters.size(); i++) {
			if (brandFilters.get(i).getText().equalsIgnoreCase(label)) {
				brandFilters.get(i).click();
				break;
			}
		}
		return brandFilters;
	}

	public static List<WebElement> selectOperatingSystem(List<WebElement> OSFilters, String label) {
		for (int i = 0; i < OSFilters.size(); i++) {
			if (OSFilters.get(i).getText().equalsIgnoreCase(label)) {
				OSFilters.get(i).click();
				break;
			}
		}
		return OSFilters;
	}

}
