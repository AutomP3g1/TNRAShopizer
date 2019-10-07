package org.testsPackage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.myPagesObject.HomePage;
import org.myPagesObject.PageTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTNR1bis {
	WebDriver driver;

	@Test
	public void testTable() throws InterruptedException {
		// pas 1 : Ouvrir un navigateur et accéder à l'application Shopizer
		System.setProperty("webdriver.gecko.driver", "C:\\Installation\\drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.102.118:8088/shopizer");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='mainmenu hidden-xs']//a[text()='Tables']")).click();
		Thread.sleep(2000);
		assertTrue(PageTable.userPath.isDisplayed()); // une arboresence apparait sous le titre de la page indiquant le chemin ou l'utilsateur se situe
		

		// pas 2 : Selectionner dans le menu horizontal la partie "Table"
		PageTable pageTable = new PageTable(driver);


		// pas 3 : Verifier la présence des éléments:
			/*
			 	- Natural Root Console
				- Asian Rosewood Console
				- Edge Console
				- CoffeTable Accacia
			 */
		assertTrue(pageTable.productTitles.isDisplayed());
		
		
		// pas 4 : Vérifier le prix actuel de tout les éléments
			/*
			 	Natural Root Console 1499.99 USD
				Asian Rosewood Console   499.99 USD
				Edge Console 749.99 USD
				CoffeTable Accacia 399.99 USD
			 */
		
		
		
		// pas 5 : Selectionner le filtre DEFAULT : il n'y a plus que l'es éléments :Asian Rosewood Console et Edge Console; de présent.
		pageTable.filtreDefault.click();
		Thread.sleep(1000);
		
		// pas 6 : Selectionner le filtre Asian wood : il n'y a plus que l'éléments Coffee Table Accacia de présent.
		pageTable.filtreAsianWood.click();
		Thread.sleep(1000);
		
		// pas 7 : Selectionner le filtre Roots : il n'y a plus que l'élément Natural Root Console de présent.
		pageTable.filtreRoots.click(); //pageTable.locateElement(pageTable.filtreRoots);
		Thread.sleep(1000);
		
	}

}
