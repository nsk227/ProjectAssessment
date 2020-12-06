package com.amazonsearch.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AttributeBasedSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		WebElement watchsearch = driver.findElement(By.id("twotabsearchtextbox"));
		watchsearch.sendKeys("samsung galaxy watch" + "\n");
		System.out.println("Id: Watch Search Executed");
		Thread.sleep(1000);

		WebElement searchlist = driver.findElement(By.name("url"));
		searchlist.click();
		Select dropdown = new Select(searchlist);
		dropdown.selectByIndex(6);
		System.out.println("name: Selection form dropdown list performed");

		WebElement watchsearch1 = driver.findElement(By.className("nav-input"));
		watchsearch1.clear();
		watchsearch1.sendKeys("coffee maker" + "\n");
		System.out.println("class:Appliance Search Executed");
		System.out.println("Summary: Id,name & class locator Search complete");
		
		Thread.sleep(1000);
		driver.close();
	}

}
