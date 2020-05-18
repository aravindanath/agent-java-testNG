package com.epam.reportportal.testng.integration.feature.skipped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class InvocationCountFailedBeforeTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvocationCountFailedBeforeTest.class);

	private final AtomicInteger testInvocationNumber = new AtomicInteger();

	@BeforeMethod(description = "Retry test initialization method")
	public void setUp1() {
		LOGGER.info("Inside @BeforeMethod setUp1 step");
	}

	@BeforeMethod(description = "Retry test second initialization method")
	public void setUp2() {
		if (testInvocationNumber.incrementAndGet() == 2) {
			Assert.fail("Failed inside @BeforeMethod setUp2 step");
		}
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
