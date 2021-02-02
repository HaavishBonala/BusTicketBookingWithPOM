package com.qa.busTicketBooking.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.busTicketBooking.base.BasePage;
import com.qa.busTicketBooking.utilites.ElementUtil;

public class SelectBusAndSeatsPage extends BasePage {
	private WebDriver driver;
	ElementUtil element;

	By selectBus = By.xpath("//*[@id=\"busDesktop\"]/div/div[6]/div[3]/div/div[6]/button");
	By seat = By.xpath("//*[@id=\"tab-lower\"]/div/div/div[2]/ul[2]/li[2]/i");
	By dropDownOne = By.xpath("//*[@id=\"city\"]/div/div/div[1]/div/select");
	By dropDownTwo = By.xpath("//*[@id=\"city\"]/div/div/div[2]/div/select");
	By confirmSeat = By.xpath("//*[@id=\"city\"]/div/div/button");

	public SelectBusAndSeatsPage(WebDriver driver) {
		this.driver = driver;
		element = new ElementUtil(this.driver);
	}
	
	public ReviewAndDetails selectBusAndSeat() {
		System.out.println("hi");
		element.clickWhenReady(selectBus, 1000);
		element.clickWhenReady(seat, 10);
		element.doSelectValuesByIndex(dropDownOne, 2);
		element.doSelectValuesByIndex(dropDownTwo, 2);
		element.doClick(confirmSeat);
		
		return new ReviewAndDetails(driver);
	}

}
