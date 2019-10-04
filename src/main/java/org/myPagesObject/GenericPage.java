package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public abstract class GenericPage {
	
	
	public final static String URL = "http://";
	protected final WebDriver driver;
	
	
	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	
	}
	

	// ******************************to log********************
	@FindBy(how = How.XPATH, using = "")
	WebElement userNameInput;

	@FindBy(how = How.XPATH, using = "")
	WebElement passwordInput;

	@FindBy(how = How.XPATH, using = "")
	WebElement validateLink;

	// *****************************to select add*************************
	

}
	
	