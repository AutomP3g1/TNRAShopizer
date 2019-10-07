package org.myPagesObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public abstract class GenericPage {

	public final static String URL = "http://192.168.102.118:8088/shopizer/";
	protected final WebDriver driver;
	public List<String> myListObString = new ArrayList<String>();

	// Bandeau liens pour Tables, Bedroom et Panier
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


	//Méthode pour extraire liste d'un fichier
	public List<String> loadFile(String filePath) throws FileNotFoundException {

		URI uri = null;
		Scanner s = new Scanner(new File(filePath), "UTF-8");
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()) {
			list.add(s.nextLine());
		}
		s.close();


		return list;
	}

	
	//Méthode générique pour convertir une liste de WebElement en text
	public List<String> WebElementToArray(List<WebElement> objectList) {
		for (WebElement e : objectList) {
			myListObString.add(e.getText());
		}
		return myListObString;
	}

	
}
