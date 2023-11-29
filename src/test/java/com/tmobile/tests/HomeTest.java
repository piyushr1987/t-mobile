package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.HomePage;

public class HomeTest extends BaseClass {

	HomePage home;

	public HomeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		home = new HomePage();

	}

	@Test(priority = 1)
	public void testCompanyLogo() throws Exception {
		if (home.validateCompanyLogo()) {
			Assert.assertTrue(true);
			Logger.info("company logo is displayed on home page");
		} else {
			captureScreen(driver, "company logo");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 2)
	public void testPlans() throws Exception {
		if (home.validatePlans()) {
			Assert.assertTrue(true);
			Logger.info("plans is displayed on home page");
		} else {
			captureScreen(driver, "plans");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testJoinUs() throws Exception {
		if (home.validateJoinUs()) {
			Assert.assertTrue(true);
			Logger.info("join us is displayed on home page");
		} else {
			captureScreen(driver, "join us");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testCart() throws Exception {
		if (home.validateCart()) {
			Assert.assertTrue(true);
			Logger.info("cart is displayed on home page");
		} else {
			captureScreen(driver, "cart");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testSearch() throws Exception {
		if (home.validateSearch()) {
			Assert.assertTrue(true);
			Logger.info("search is displayed on home page");
		} else {
			captureScreen(driver, "search");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testMyAccount() throws Exception {
		if (home.validateMyAccount()) {
			Assert.assertTrue(true);
			Logger.info("my account is displayed on home page");
		} else {
			captureScreen(driver, "my account");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testSpain() throws Exception {
		Logger.info("click on spain");
		try {
			home.clickOnSpain();
		} catch (Exception e) {
			captureScreen(driver, "spain");

		}

	}

	@Test(priority = 8)
	public void testEnglish() throws Exception {
		Logger.info("click on english");
		try {
			home.clickOnEnglish();
		} catch (Exception e) {
			captureScreen(driver, "english");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
