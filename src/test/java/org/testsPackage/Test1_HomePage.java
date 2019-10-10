package org.testsPackage;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.myPagesObject.HomePage;



public class Test1_HomePage extends GenericTest {

	public List<String> myListElements = new ArrayList<String>();
	public List<String> myListElementsText = new ArrayList<String>();
	public List<String> myListElementAll = new ArrayList<String>();


	public Test1_HomePage() {

		super();
	}

	@Test
	public void homePageT() throws Exception {

		// Instanciation de la page d'accueil
		HomePage home = new HomePage(driver);

		// Conversion listes WebElements en listes String
		myListElements = home.WebElementToArray(home.homePageElements); //liste de web elements
		myListElementsText = home.loadFile("src/test/resources/homePageElements.txt"); // liste des produits
		myListElementAll = home.loadFile("src/test/resources/homePageElementsAll.txt"); // liste produits et prix
				
		// Assertion sur les listes d'éléments si le web element contient 8 éléments uniquement la liste des produits sinon liste + prix
		if (myListElements.size() == 8) {
			assertEquals(myListElementsText, myListElements);
		}else {
		assertEquals(myListElementAll, myListElements);
		}
		


	}

}
