package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.Coverage_RuralAndSmallTowns;

public class Coverage_RuralAndSmallTownsTest extends BaseClass {

	Coverage_RuralAndSmallTowns coverage;

	public Coverage_RuralAndSmallTownsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		coverage = new Coverage_RuralAndSmallTowns();

	}

	@Test(priority = 1)
	public void testCoverage() throws Exception {
		Logger.info("go to coverage and click on rural&small towns ");
		try {
			coverage.goToCoverage();
		} catch (Exception e) {
			captureScreen(driver, "coverage");

		}

	}

	@Test(priority = 2)
	public void testSmallTownRuralAreaPage() throws Exception {
		if (coverage.validateSmallTownRuralAreaPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Small Town Rural Area Page");
		} else {
			captureScreen(driver, "Small Town Rural Area Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testBusinessPlan() throws Exception {
		Logger.info("click on Business Plan");
		try {
			coverage.clickOnBusinessPlan();
		} catch (Exception e) {
			captureScreen(driver, "Business Plan");

		}

	}

	@Test(priority = 4)
	public void testBusinessPlanPage() throws Exception {
		if (coverage.validateBusinessPlanPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Business Plan Page");
		} else {
			captureScreen(driver, "Business Plan Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testLetsTalk() throws Exception {
		Logger.info("click on Lets Talk");
		try {
			coverage.clickOnLetsTalk();
		} catch (Exception e) {
			captureScreen(driver, "Lets Talk");

		}

	}

	@Test(priority = 6)
	public void testCustomerInfo() throws Exception {
		Logger.info("enter the customer infromation");
		try {
			coverage.enterCustomerInfo(prop.getProperty("firstName"), prop.getProperty("lastName"),
					prop.getProperty("phoneNo"), prop.getProperty("emailAddress"), prop.getProperty("zipCode"),
					prop.getProperty("brandName"));
		} catch (Exception e) {
			captureScreen(driver, "Customer Info");

		}

	}

	@Test(priority = 7)
	public void testSubmit() throws Exception {
		Logger.info("click on submit");
		try {
			coverage.clickOnSubmit();
		} catch (Exception e) {
			captureScreen(driver, "submit");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
