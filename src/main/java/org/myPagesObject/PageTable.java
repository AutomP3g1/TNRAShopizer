package org.myPagesObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageTable extends GenericPage{
	
	public List<WebElement> tablePageProductElements = driver.findElements(By.xpath("//div[@id=\"productsContainer\"]//h3"));
	public List<WebElement> tablePagePriceElements = driver.findElements(By.xpath("//span[@itemprop='price']"));

//	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3")  //utilise ...h3[n] pour localiser le produit
//	public WebElement productTitles;

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

	public PageTable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	public void locateElement (WebElement link){
	link.click();
	}
}
