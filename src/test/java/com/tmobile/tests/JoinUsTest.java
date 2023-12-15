package com.tmobile.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tmobile.genericPage.BaseClass;
import com.tmobile.pages.JoinUsPage;

public class JoinUsTest extends BaseClass {

	JoinUsPage join;

	public JoinUsTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		join = new JoinUsPage();

	}

	@Test(priority = 1)
	public void testCoverage() throws Exception {
		Logger.info("go to join us and click on travel ");
		try {
			join.goToJoinUs();
		} catch (Exception e) {
			captureScreen(driver, "join us");

		}

	}

	@Test(priority = 2)
	public void testTravelPage() throws Exception {
		if (join.validateTravelPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Travel Page");
		} else {
			captureScreen(driver, "Travel Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testOnTheRoad() throws Exception {
		Logger.info("click On The Road ");
		try {
			join.clickOnTheRoad();
		} catch (Exception e) {
			captureScreen(driver, "On The Road");

		}

	}

	@Test(priority = 4)
	public void testFindOutMore() throws Exception {
		Logger.info("click On Find Out More ");
		try {
			join.clickOnFindOutMore();
		} catch (Exception e) {
			captureScreen(driver, "Find Out More");

		}

	}

	@Test(priority = 5)
	public void testAAAMembershipPlanPage() throws Exception {
		if (join.validateAAAMembershipPlanPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to AAA Membership Plan Page");
		} else {
			captureScreen(driver, "AAA Membership Plan Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testShopPlan() throws Exception {
		Logger.info("click On shop plan ");
		try {
			join.clickOnShopPlan();
		} catch (Exception e) {
			captureScreen(driver, "shop plan");

		}

	}

	@Test(priority = 7)
	public void testCellphonePlanPage() throws Exception {
		if (join.validateCellphonePlanPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Cell phone Plan Page");
		} else {
			captureScreen(driver, "Cell phone Plan Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testMilitaryAndVeteran() throws Exception {
		Logger.info("click On Military And Veteran");
		try {
			join.clickOnMilitaryAndVeteran();
		} catch (Exception e) {
			captureScreen(driver, "Military And Veteran");

		}

	}

	@Test(priority = 9)
	public void testGo5GNextMilitaryTitle() throws Exception {
		if (join.validateGo5GNextMilitaryTitle(prop.getProperty("miltaryTitle"))) {
			Assert.assertTrue(true);
			Logger.info("acutal and expected title is matched");
		} else {
			captureScreen(driver, "Go 5G title");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testSelectPhonePlan() throws Exception {
		Logger.info("click On Select Phone Plan");
		try {
			join.clickOnSelectPhonePlan();
		} catch (Exception e) {
			captureScreen(driver, "Select Phone Plan");

		}

	}

	@Test(priority = 11)
	public void testCartPage() throws Exception {
		if (join.validateCartPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the cart page");
		} else {
			captureScreen(driver, "Cart Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
