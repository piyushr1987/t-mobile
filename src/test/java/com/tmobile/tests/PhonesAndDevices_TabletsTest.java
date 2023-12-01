package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.PhonesAndDevices_TabletsPage;

public class PhonesAndDevices_TabletsTest extends BaseClass {

	PhonesAndDevices_TabletsPage phones;

	public PhonesAndDevices_TabletsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		phones = new PhonesAndDevices_TabletsPage();

	}

	@Test(priority = 1)
	public void testPhoneAndDevices() throws Exception {
		Logger.info("go to phone&devices and click on tablets");
		try {
			phones.goToPhoneAndDevices();
		} catch (Exception e) {
			captureScreen(driver, "Phone&Devices");

		}

	}

	@Test(priority = 2)
	public void testTabletsPage() throws Exception {
		if (phones.validateTabletsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the tablets page");
		} else {
			captureScreen(driver, "tablet page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testDeals() throws Exception {
		Logger.info("click on deals and select Special offer");
		try {
			phones.clickOnDeals();
		} catch (Exception e) {
			captureScreen(driver, "deals");

		}

	}

	@Test(priority = 4)
	public void testBrands() throws Exception {
		Logger.info("click on brands and select samsung");
		try {
			phones.clickOnBrands();
		} catch (Exception e) {
			captureScreen(driver, "brands");

		}

	}

	@Test(priority = 5)
	public void testOperatingSystem() throws Exception {
		Logger.info("click on operating system and select Android");
		try {
			phones.clickOnOperatingSystem();
		} catch (Exception e) {
			captureScreen(driver, "operating system");

		}

	}

	@Test(priority = 6)
	public void testSortBy() throws Exception {
		Logger.info("click on sort by");
		try {
			phones.clickOnSortBy();
		} catch (Exception e) {
			captureScreen(driver, "sort by");

		}

	}

	@Test(priority = 7)
	public void testHighestRating() throws Exception {
		Logger.info("click on Highest Rating");
		try {
			phones.clickOnHighestRating();
		} catch (Exception e) {
			captureScreen(driver, "Highest Rating");

		}

	}

	@Test(priority = 8)
	public void testSamsung() throws Exception {
		Logger.info("click on samsung galaxy tab s7");
		try {
			phones.clickOnSamsung();
		} catch (Exception e) {
			captureScreen(driver, "samsung galaxy");

		}

	}

	@Test(priority = 9)
	public void testSamsungTabletsPage() throws Exception {
		if (phones.validateSamsungTabletsPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Samsung Tablets Page");
		} else {
			captureScreen(driver, "Samsung Tablets Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
