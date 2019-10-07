package org.myPagesObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericPage {

	public List<WebElement> homePageElements = driver.findElements(By.xpath("//div[@id=\"featuredItemsContainer\"]//h3"));
	public List<WebElement> homePagePrices = driver.findElements(By.xpath("//span[@itemprop='price']"));
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
		
	public PageTable clickBandeauTable() {
		linkTables.click();
		return PageFactory.initElements(driver, PageTable.class);
	}
	
	public BedroomPage clickBandeauBedroom() {
		linkBedroom.click();
		return PageFactory.initElements(driver, BedroomPage.class);
	}
	
		
	
}
