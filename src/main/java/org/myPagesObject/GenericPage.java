package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public abstract class GenericPage {
	
	
	public final static String URL = "http://192.168.102.118:8088/shopizer/shop";
	protected final WebDriver driver;
	
	//Bandeau liens pour Tables, Bedroom et Panier
	@FindBy(how = How.XPATH, using = "//div[@class='mainmenu hidden-xs']//a[text()='Tables']")
	public WebElement linkTables;

	@FindBy(how = How.XPATH, using = "//div[@class='mainmenu hidden-xs']//a[text()='Bedroom']")
	public WebElement linkBedroom;

	@FindBy(how = How.XPATH, using = "//*[@id=\"miniCartSummary\"]/a")
	public WebElement clickPanier;


	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	
	}
	
	

}
	
	



	
	