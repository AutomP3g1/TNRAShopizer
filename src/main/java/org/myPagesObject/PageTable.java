package org.myPagesObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageTable extends GenericPage{
	
	public List<WebElement> tablePageProductElements = driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
	public List<WebElement> tablePagePriceElements = driver.findElements(By.xpath("//div[@id='productsContainer']//h4"));
	public List<WebElement> tablePageDEFAULTProductElements = driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));

//	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3")  //utilise ...h3[n] pour localiser le produit
//	public WebElement productTitles;

//	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//span[@itemprop='price']")
//	WebElement productPrices;
	
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
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[@itemprop='name'][contains(text(),'Asian rosewood console')]")
	WebElement productDefault1;
	
	public
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[@itemprop='name'][contains(text(),'Edge console')]")
	WebElement productDefault2;
	
	public
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-list']//li//a[contains(text(),'Asian Wood')]")
	WebElement filtreAsianWood;
	
	public
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[@itemprop='name'][contains(text(),'Asian rosewood console')]")
	WebElement productAsianRosewoodConsole;

	public
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[text()='Natural root console']")
	WebElement productNaturalRootConsole;
	
	public
	@FindBy(how = How.XPATH, using = "//div[@id='productsContainer']//h3[text()='Coffee table Accacia']")
	WebElement productCoffeeTable;

	public PageTable(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public void CheckProductsPrices() throws FileNotFoundException,
	 * InterruptedException { Thread.sleep(2000); List<String> Liste1 =
	 * GenericPage.loadFile(
	 * "src/main/resources/FichiersProduits/tablePagePriceElements.txt");
	 * Thread.sleep(2000); List<WebElement> Liste2 =
	 * driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
	 * Thread.sleep(2000); List<String> Liste3 = new ArrayList<String>();
	 * Thread.sleep(2000);
	 * Liste2.stream().map(WebElement::getText).forEach(Liste3::add);
	 * Thread.sleep(2000); assertEquals(Liste1, Liste3);
	 * //Assert.assertEquals(Liste4, Liste6); }
	 * 
	 * public void CheckProductsFiltreDefault() throws FileNotFoundException,
	 * InterruptedException { Thread.sleep(3000); List<String> Liste4 =
	 * GenericPage.loadFile("src/test/resources/tablePageFiltreDEFAULTProducts.txt")
	 * ; Thread.sleep(3000); List<WebElement> Liste5 =
	 * driver.findElements(By.xpath("//div[@id='productsContainer']//h3"));
	 * Thread.sleep(3000); List<String> Liste6 = new ArrayList<String>();
	 * Thread.sleep(3000);
	 * Liste5.stream().map(WebElement::getText).forEach(Liste6::add);
	 * Thread.sleep(3000); assertEquals(Liste4, Liste6);
	 * //Assert.assertEquals(Liste4, Liste6); }
	 */
	
	public void locateElement (WebElement link){
	link.click();
	}
}
