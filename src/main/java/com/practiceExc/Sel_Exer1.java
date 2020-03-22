package com.practiceExc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Exer1 {

	String ActualUrl = "http://services.smartbear.com/samples/TestComplete14/smartstore/";

	@Test
	public void mainmethod() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); // running with chrome browser
		dr.navigate().to(ActualUrl);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//a[@class='menubar-link']//span[contains(text(),'Log in')]")).click();

		Thread.sleep(5000);

		dr.findElement(By.xpath("//a[@class='btn btn-warning btn-lg btn-block register-button']")).click(); // At the
																											// registration
																											// page

		dr.findElement(By.xpath("//input[@id='gender-male']")).click(); // Radio button

		dr.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John"); // First name
		dr.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Hauge"); // Last name

		Thread.sleep(1000);

		WebElement day = dr.findElement(By.name("DateOfBirthDay"));
		selectFromDropDown(day, "13"); // day

		WebElement month = dr.findElement(By.name("DateOfBirthMonth"));
		selectFromDropDown(month, "8"); // month

		WebElement year = dr.findElement(By.name("DateOfBirthYear"));
		selectFromDropDown(year, "1989");// year

		dr.findElement(By.xpath("//input[@id='Email']")).sendKeys("khisrat112@gmail.com"); // Email
		dr.findElement(By.xpath(" //input[@id='Username']")).sendKeys("thisisme11"); // UserName
		dr.findElement(By.xpath("//input[@id='Password']")).sendKeys("thisisme2422"); // Password
		dr.findElement(By.xpath(" //input[@id='ConfirmPassword']")).sendKeys("thisisme2422"); // Confirmed password
		dr.findElement(By.xpath("//input[@id='Company']")).sendKeys("BeautifulGoods & Co."); // Company name
		dr.findElement(By.xpath("//input[@id='Newsletter']")).click(); // NewsLetter
		dr.findElement(By.xpath("//button[@name='register-button']")).click();
		// String expected ="Your registration completed";

		String expected = dr.findElement(By.xpath(" //p[@class='section-body']")).getText();

		Assert.assertEquals("Your registration completed", expected);
		System.out.println("Test passed");

		dr.close();
	}

	public void selectFromDropDown(WebElement element, String value) {
		Select st = new Select(element);
		st.selectByValue(value);
	}

}
