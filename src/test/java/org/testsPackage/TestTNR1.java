package org.testsPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.myPagesObject.HomePage;
import org.myPagesObject.PageTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTNR1 extends GenericTest {

	public List<String> myProductLists = new ArrayList<String>();
	public List<String> myPriceLists = new ArrayList<String>();
	public List<String> myJDDLists = new ArrayList<String>();

	public TestTNR1() {
		super();
	}

	@Test
	public void testTable() throws InterruptedException, FileNotFoundException {

		// pas 1 : Ouvrir un navigateur et accéder à l'application Shopizer
		HomePage homePage = new HomePage(driver);

		// pas 2 : Selectionner dans le menu horizontal la partie "Table"

		PageTable pageTable = homePage.clickBandeauTable();
		Thread.sleep(1000);
		assertTrue(pageTable.userPath.isDisplayed()); // une arboresence apparait sous le titre de la page indiquant le chemin ou l'utilsateur se situe

		// pas 3 : Veifier la présence des éléments:
		/*
			 	- Natural Root Console
				- Asian Rosewood Console
				- Edge Console
				- CoffeTable Accacia
		 */

		//Thread.sleep(1000);
		myProductLists = pageTable.WebElementToArray(pageTable.tablePageProductElements);
		myJDDLists = pageTable.loadFile("src/test/resources/tablePageProductsElements.txt");
		assertEquals(myJDDLists, myProductLists);


		// pas 4 : Vérifier le prix actuel de tout les éléments
		/*
			 	Natural Root Console 1499.99 USD
				Asian Rosewood Console   499.99 USD
				Edge Console 749.99 USD
				CoffeTable Accacia 399.99 USD
		 */
		myPriceLists = pageTable.WebElementToArray(pageTable.tablePagePriceElements);
		myJDDLists = pageTable.loadFile("src/test/resources/tablePagePriceElements.txt");

		//pageTable.CheckProductsPrices();

		// pas 5 : Selectionner le filtre DEFAULT : il n'y a plus que l'es éléments :Asian Rosewood Console et Edge Console; de présent.

		pageTable.filtreDefault.click(); 
		Thread.sleep(1000);
		assertEquals("Asian Rosewood Console", pageTable.productDefault1.getText());
		assertEquals("Edge Console", pageTable.productDefault2.getText());
		

		// pas 6 : Selectionner le filtre Asian wood : il n'y a plus que l'éléments Coffee Table Accacia de présent.
		pageTable.filtreAsianWood.click();
		Thread.sleep(1000);
		assertEquals("Coffee Table Accacia", pageTable.productCoffeeTable.getText());

		// pas 7 : Selectionner le filtre Roots : il n'y a plus que l'élément Natural Root Console de présent.
		pageTable.filtreRoots.click(); //pageTable.locateElement(pageTable.filtreRoots);
		Thread.sleep(1000);
		assertEquals("Natural Root Console", pageTable.productNaturalRootConsole.getText());

	}
}