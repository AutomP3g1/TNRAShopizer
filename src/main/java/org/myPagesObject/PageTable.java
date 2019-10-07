package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageTable extends GenericPage{
	
	
		

	public PageTable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3")  //utilise ...h3[n] pour localiser le produit
	public WebElement productTitles;

	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//span[@itemprop='price']")
	WebElement productPrices;
	
	public
	@FindBy(how = How.XPATH, using = "//ol[@class='breadcrumb']")
	WebElement userPath;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-list']//li//a[contains(text(),'DEFAULT')]")
	public
	WebElement filtreDefault;
	
	public
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-list']//li//a[contains(text(),'Roots')]")
	WebElement filtreRoots;
	
	public
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-list']//li//a[contains(text(),'Asian Wood')]")
	WebElement filtreAsianWood;
	
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[@itemprop='name'][contains(text(),'Asian rosewood console')]")
	WebElement productAsianRosewoodConsole;
	
	public void locateElement (WebElement link){
	link.click();
	}
}
