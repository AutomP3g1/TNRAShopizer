package org.testsPackage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.myPagesObject.HomePage;
import org.myPagesObject.PageTable;

public class TestTNR1 extends GenericTest {

	@Test
	public void testTable() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.clickBandeauTable();

		PageTable pageTable = new PageTable(driver);

		//pageTable.locateElement(pageTable.filtreDefault);
		pageTable.filtreDefault.click();
		Thread.sleep(1000);
		assert
		//(pageTable.productTitles.isDisplayed());
	
		
		pageTable.locateElement(pageTable.filtreRoots);

	}

}
