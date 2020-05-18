package com.epam.reportportal.testng.integration.feature.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleInvocationCountTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleInvocationCountTest.class);

	@BeforeMethod(description = "Retry test initialization method")
	public void setUp1() {
		LOGGER.info("Inside @BeforeMethod setUp1 step");
	}

	@BeforeMethod(description = "Retry test second initialization method")
	public void setUp2() {
		LOGGER.info("Inside @BeforeMethod setUp2 step");
	}

	@Test(invocationCount = 3)
	public void invocationCountTest() {
		LOGGER.info("Inside @Test invocationCountTest step");
	}

	@AfterMethod(description = "Retry test tear down")
	public void shutDown() {
		LOGGER.info("Inside @AfterMethod shutDown method");
	}
}
