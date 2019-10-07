package org.testsPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.myPagesObject.GenericPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class GenericTest {

	WebDriver driver; 
	public String BROWSER = System.getProperty("browser");

	public GenericTest() {
		super();

		if (BROWSER.equalsIgnoreCase("Firefox") || BROWSER.isEmpty()) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if (BROWSER.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Installation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if (BROWSER.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.IEDriver.Server", "C:\\Installation\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	
	}

	 @After
	 public void teardown() {
	 driver.close();
	 }

}
