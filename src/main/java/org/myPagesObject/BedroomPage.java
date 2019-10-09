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
		Thread.sleep(3000);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Ajouter au panier'])[1]")));
		Thread.sleep(3000);
		element2.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@class='addToCart'])[1]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element3 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Ajouter au panier'])[2]")));
		Thread.sleep(3000);
		element3.click();
//		driver.findElement(By.xpath("(//a[@class='addToCart'])[2]")).click();
		
		return PageFactory.initElements(driver,BedroomPage.class);
	}
	
	public BedroomPage mouseOverCart (WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
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
