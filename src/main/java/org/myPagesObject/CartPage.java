package org.myPagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public CartPage modifyQuantity (WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("2");
		Thread.sleep(1000);
		return PageFactory.initElements(driver,CartPage.class);
	}
	
	public CartPage recalculatePrice (WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Recalculer']")).click();
		return PageFactory.initElements(driver,CartPage.class);
	}
	

}
