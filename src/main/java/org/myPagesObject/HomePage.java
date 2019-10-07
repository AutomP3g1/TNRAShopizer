package org.myPagesObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericPage {

	public List<WebElement> objectsCharacterList = driver.findElements(By.xpath("//div[@id=\"featuredItemsContainer\"]//h3"));
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
		
	public PageTable clickBandeauTable() {
		linkTables.click();
		return PageFactory.initElements(driver, PageTable.class);
	}
	
//	public PageTable clickBandeauBedroom() {
//		linkBedroom.click();
//		return PageFactory.initElements(driver, PageTable.class);
//	}
	
	

	
}
