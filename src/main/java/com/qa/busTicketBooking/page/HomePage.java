package com.qa.busTicketBooking.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.busTicketBooking.base.BasePage;
import com.qa.busTicketBooking.utilites.ElementUtil;

public class HomePage extends BasePage {

	private WebDriver driver;
	ElementUtil element;

	By from = By.xpath("//*[@id=\"BE_bus_from_station\"]");
	By thi = By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[1]/li[1]/div/div/ul/div/div/div/li[1]");
	By thii = By.xpath("//*[@id=\"booking_engine_modues\"]/div/div[1]/div[2]/ul[1]/li[3]/div/div/ul/div/div/div/li[1]");
	By to = By.xpath("//*[@id=\"BE_bus_to_station\"]");
	By searchBtn = By.xpath("//*[@id=\"BE_bus_search_btn\"]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		element = new ElementUtil(this.driver);
	}

	public SelectBusAndSeatsPage searchForBus() {

		element.doClick(from);
		element.doSendKeys(from, "Hyderabad");
		element.clickWhenReady(thi, 4);
		element.doClick(to);
		element.doSendKeys(to, "Mumbai");
		element.clickWhenReady(thii, 4);
		element.clickWhenReady(searchBtn, 10);

		return new SelectBusAndSeatsPage(driver);
	}

}
