package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.Plans_HomeInternetPlanPage;

public class Plans_HomeInternetPlanTest extends BaseClass {

	Plans_HomeInternetPlanPage internet;

	public Plans_HomeInternetPlanTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		internet = new Plans_HomeInternetPlanPage();

	}

	@Test(priority = 1)
	public void testPlans() throws Exception {
		Logger.info("go to plans and click on home internet plan");
		try {
			internet.goToPlans();
		} catch (Exception e) {
			captureScreen(driver, "plans");

		}

	}

	@Test(priority = 2)
	public void testHomeInternetpage() throws Exception {
		if (internet.validateHomeInternetpage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Home Internet page");
		} else {
			captureScreen(driver, "Home Internet page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testCheckAvailability() throws Exception {
		Logger.info("click on Check Availability");
		try {
			internet.clickOnCheckAvailability();
		} catch (Exception e) {
			captureScreen(driver, "Check Availability");

		}

	}

	@Test(priority = 4)
	public void testHomeInternetAvailabilityPage() throws Exception {
		if (internet.validateHomeInternetAvailabilityPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Home Internet Availability Page");
		} else {
			captureScreen(driver, "Home Internet Availability Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testAddress() throws Exception {
		Logger.info("enter the address");
		try {
			internet.enterTheAddress(prop.getProperty("address"));
		} catch (Exception e) {
			captureScreen(driver, "address");

		}

	}

	@Test(priority = 6)
	public void testAddressAvailability() throws Exception {
		Logger.info("click on Address Availability");
		try {
			internet.clickOnAddressAvailability();
		} catch (Exception e) {
			captureScreen(driver, "Address Availability");

		}

	}

	@Test(priority = 7)
	public void testAlertMessage() throws Exception {
		Logger.info("actual and expected alert messgae is matched");
		try {
			internet.validateAlertMessage(prop.getProperty("alertMessage"));
		} catch (Exception e) {
			captureScreen(driver, "alert message");

		}

	}

	@Test(priority = 8)
	public void testAddressSignUpPage() throws Exception {
		if (internet.validateAddressSignUpPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to Address SignUp Page");
		} else {
			captureScreen(driver, "Address SignUp Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testFirstName() throws Exception {
		Logger.info("enter the first name");
		try {
			internet.enterFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "first name");

		}

	}

	@Test(priority = 10)
	public void testLastName() throws Exception {
		Logger.info("enter the last name");
		try {
			internet.enterLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "last name");

		}

	}

	@Test(priority = 11)
	public void testPhone() throws Exception {
		Logger.info("enter the phone no");
		try {
			internet.enterPhoneNo(prop.getProperty("phoneNo"));
		} catch (Exception e) {
			captureScreen(driver, "phone no");

		}

	}

	@Test(priority = 12)
	public void testEmail() throws Exception {
		Logger.info("enter the email");
		try {
			internet.enterEmail(prop.getProperty("emailAddress"));
		} catch (Exception e) {
			captureScreen(driver, "email");

		}

	}

	@Test(priority = 13)
	public void testJoin() throws Exception {
		Logger.info("click on join the waitlist");
		try {
			internet.clickOnJoin();
		} catch (Exception e) {
			captureScreen(driver, "waitlist");

		}

	}

	@Test(priority = 14)
	public void testWaitlistPage() throws Exception {
		if (internet.validateWaitlistPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to waitlist Page");
		} else {
			captureScreen(driver, "Waitlist Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
