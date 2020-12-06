package com.amazonsearch.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProducts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		WebElement watchsearch = driver.findElement(By.id("twotabsearchtextbox"));
		watchsearch.sendKeys("samsung galaxy watch" + "\n");
		Thread.sleep(3000);
		
		WebElement mobilesearch = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		mobilesearch.clear();
		mobilesearch.sendKeys("samsung mobile phones" + "\n");
		Thread.sleep(3000);
		
		WebElement tvsearch = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		tvsearch.clear();
		tvsearch.sendKeys("samsung smart tv" + "\n");
		Thread.sleep(3000);
		driver.close();

	}

}
