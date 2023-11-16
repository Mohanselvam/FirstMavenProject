package com.orangehrm.udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {

	WebDriver driver;

	@Test(priority=0)
	public void logoTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1689053487449']")));

		WebElement logoElement = driver
				.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1689053487449']"));
		
		
		Thread.sleep(3000);

		Assert.assertTrue(logoElement.isDisplayed(), "logo is not displayed");
		System.out.println("Logo is Displayed in ParallelTest1 class");
	}

	@Test(priority=2)
	public void homePageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		Thread.sleep(3000);
		System.out.println("The home page title is OrangeHRM");

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
