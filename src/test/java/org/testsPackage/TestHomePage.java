package org.testsPackage;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.myPagesObject.HomePage;



public class TestHomePage extends GenericTest {

	public List<String> myListElements = new ArrayList<String>();
	public List<String> myListElementsText = new ArrayList<String>();



	public TestHomePage() {

		super();
	}

	@Test
	public void homePageT() throws Exception {

		// Instanciation de la page d'accueil
		HomePage home = new HomePage(driver);

		// Conversion listes WebElements en listes String
		myListElements = home.WebElementToArray(home.homePageElements);
		myListElementsText = home.loadFile("src/test/resources/homePageElements.txt");
		
				
		// To assert listItems with price
		assertEquals(myListElementsText, myListElements);
		


	}

}
