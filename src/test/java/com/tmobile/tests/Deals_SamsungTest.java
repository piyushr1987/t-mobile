package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.Deals_SamsungPage;

public class Deals_SamsungTest extends BaseClass {

	Deals_SamsungPage samsung;

	public Deals_SamsungTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		samsung = new Deals_SamsungPage();

	}

	@Test(priority = 1)
	public void testDeals() throws Exception {
		Logger.info("go to deals and click on samsung");
		try {
			samsung.goToDeals();
		} catch (Exception e) {
			captureScreen(driver, "deals");

		}

	}

	@Test(priority = 2)
	public void testSamsungPage() throws Exception {
		if (samsung.validateSamsungPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the samsung phone page");
		} else {
			captureScreen(driver, "samsung page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testPhones() throws Exception {
		Logger.info("click on phones");
		try {
			samsung.clickOnPhones();
		} catch (Exception e) {
			captureScreen(driver, "phones");

		}

	}

	@Test(priority = 4)
	public void testSamsungGalaxy() throws Exception {
		Logger.info("click on Samsung Galaxy");
		try {
			samsung.clickOnSamsungGalaxy();
		} catch (Exception e) {
			captureScreen(driver, "Samsung Galaxy");

		}

	}

	@Test(priority = 5)
	public void testSamsungGalaxyPage() throws Exception {
		if (samsung.validateSamsungGalaxyPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Samsung Galaxy Page");
		} else {
			captureScreen(driver, "Samsung Galaxy Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testSee2Deals() throws Exception {
		Logger.info("click on See2Deals");
		try {
			samsung.clickOnSee2Deals();
		} catch (Exception e) {
			captureScreen(driver, "See2Deals");

		}

	}

	@Test(priority = 7)
	public void testLocation() throws Exception {
		Logger.info("click on location");
		try {
			samsung.clickOnLocation();
		} catch (Exception e) {
			captureScreen(driver, "location");

		}

	}

	@Test(priority = 8)
	public void testCity() throws Exception {
		Logger.info("enter the city name");
		try {
			samsung.enterCityName(prop.getProperty("city"));
		} catch (Exception e) {
			captureScreen(driver, "city name");

		}

	}

	@Test(priority = 9)
	public void testBroadwayStore() throws Exception {
		Logger.info("click on Broadway Store");
		try {
			samsung.clickOnBroadwayStore();
		} catch (Exception e) {
			captureScreen(driver, "Broadway Store");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
