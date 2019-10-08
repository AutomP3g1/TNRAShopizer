package org.myPagesObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BedroomPage {
	
	public BedroomPage addToCart (WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='addToCart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='addToCart'])[2]")).click();
		return PageFactory.initElements(driver,BedroomPage.class);
	}
	
	public BedroomPage mouseOverCart (WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[@class='lnr lnr-cart']"));
		action.moveToElement(we).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Paiement']")));
		element.click();
//		action.moveToElement(driver.findElement(By.xpath("//a[text()='Paiement']"))).click().build().perform();
		Thread.sleep(3000);
		return PageFactory.initElements(driver,BedroomPage.class);
	}
}
