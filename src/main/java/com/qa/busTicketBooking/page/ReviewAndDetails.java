package com.qa.busTicketBooking.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.busTicketBooking.base.BasePage;
import com.qa.busTicketBooking.utilites.ElementUtil;

public class ReviewAndDetails extends BasePage{
	private WebDriver driver;
	ElementUtil element;
	
	By emailId = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[1]/div[2]/div/div[1]/div/p[1]/input");
	By phoneNumber = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[1]/div[2]/div/div[2]/div/div[2]/input");
	By name = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[1]/div/div/input");
	By gender = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[2]/select");
	By age = By.xpath("//*[@id=\"busDesktop\"]/div/div[2]/section/div[4]/div[2]/div/div/div/div[2]/div/div[3]/select");
	By PTPBtn = By.xpath("//*[@id=\"busDesktop\"]/div/div[3]/div/button");
	By ev = By.xpath("//*[@id=\"cpmt-all-payment-div\"]/div/h2");
	
	public ReviewAndDetails(WebDriver driver) {
		this.driver = driver;
		element = new ElementUtil(this.driver);
	}
	
	public void enterValues() {
		element.clickWhenReady(emailId, 5);
		element.doSendKeys(emailId, "gyoiysdg@dgdd.com");
		element.doSendKeys(phoneNumber, "791398410298383");
		element.doSendKeys(name, "uoipyuooi");
		element.doSelectValuesByVisibleText(gender, "Male");
		element.doSelectValuesByVisibleText(age, "35");
		element.doClick(PTPBtn);
		element.waitForElementToBeVisible(ev, 5);
	}
}
