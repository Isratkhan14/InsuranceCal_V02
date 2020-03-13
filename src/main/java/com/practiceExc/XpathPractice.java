package com.practiceExc;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	public static void main(String[] args) {
		String ActualUrl ="http://qdpm.net/demo/v9/index.php";
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); //running with chrome browser
		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");
		WebElement we = dr.findElement(By.xpath("//a[@href='/login']"));
		//Assert
	
	
	}
	

}
