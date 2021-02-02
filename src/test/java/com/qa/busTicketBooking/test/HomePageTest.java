package com.qa.busTicketBooking.test;

import org.testng.annotations.Test;

import com.qa.busTicketBooking.base.BaseTest;

public class HomePageTest extends BaseTest {
	@Test()
	public void search() {
		homePage.searchForBus();
	}
}