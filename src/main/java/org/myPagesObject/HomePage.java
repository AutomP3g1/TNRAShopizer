package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericPage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public PageTable clickBandeauTable() {
		linkTables.click();
		return PageFactory.initElements(driver, PageTable.class);
	}

	
}
