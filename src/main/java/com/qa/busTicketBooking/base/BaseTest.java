package com.qa.busTicketBooking.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.busTicketBooking.page.HomePage;
import com.qa.busTicketBooking.page.ReviewAndDetails;
import com.qa.busTicketBooking.page.SelectBusAndSeatsPage;

public class BaseTest {
	public BasePage bp;
	public Properties prop;
	public WebDriver driver;
	public HomePage homePage;
	public SelectBusAndSeatsPage sbasPage;
	public ReviewAndDetails rad;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browserName) {
		bp = new BasePage();
		prop = bp.init_prop();
		prop.setProperty("browser", browserName);
		driver = bp.init_driver(prop);
		homePage = new HomePage(driver);
		sbasPage = homePage.searchForBus();
		rad = sbasPage.selectBusAndSeat();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
