package org.testsPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.myPagesObject.BedroomPage;
import org.myPagesObject.CartPage;
import org.myPagesObject.GenericPage;
import org.myPagesObject.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testsPackage.GenericTest;


public class Test3 extends GenericTest{
	
//	WebDriver driver;
//	String b = "Firefox";
//	public String BROWSER = System.getProperty("browser");
	

	
//	@After
//	public void tearDown(){
//		System.out.println("\n@After");
//		driver.close();
//	}
	
	@Test
	public void test() throws InterruptedException, FileNotFoundException{
				
//		driver= GenericPage.choisirNavigateur(b);
		Thread.sleep(3000);
		
//		driver.get("http://192.168.102.118:8088/shopizer/shop");
		Thread.sleep(3000);

		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickBandeauBedroom();
		
		Thread.sleep(3000);
		BedroomPage bedroomPage = PageFactory.initElements(driver, BedroomPage.class);
		Thread.sleep(3000);
		bedroomPage.addToCart(driver);
		assertEquals("(2)",driver.findElement(By.xpath("//strong[text()='(2)']")).getText());
		
		
		Thread.sleep(2000);
		bedroomPage.mouseOverCart(driver);
		Thread.sleep(3000);
		
		assertEquals("Revoir votre commande",driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
		Thread.sleep(2000);
		
		assertTrue(driver.findElement(By.xpath("//strong[text()='Compact night table']")).isDisplayed());
		Thread.sleep(1000);
		assertTrue(driver.findElement(By.xpath("//strong[text()='Antique recycled wood storage']")).isDisplayed());
		Thread.sleep(1000);
		assertEquals("US$1,329.98",driver.findElement(By.xpath("//th[text()='Total']/following-sibling::td/span")).getText());
	
		CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
		cartPage.modifyQuantity(driver);
		Thread.sleep(1000);
		assertEquals("US$1,329.98",driver.findElement(By.xpath("//th[text()='Total']/following-sibling::td/span")).getText());
		
		cartPage.recalculatePrice(driver);
		Thread.sleep(3000);
		assertEquals("US$2,659.96",driver.findElement(By.xpath("//th[text()='Total']/following-sibling::td/span")).getText());
		
		
}
}
