package com.practiceExc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exc_1_with_method {
// after running not showing data on the page
	//.page opens but blank
	static WebDriver dr = null;
   
	
	public static void setupDrivers( String DriverName ) //method to set up different drivers
	{
		if (DriverName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 dr = new ChromeDriver();
			}
		else if (DriverName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 dr = new FirefoxDriver();
			}
		else if (DriverName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			 dr = new InternetExplorerDriver();
			}
	
	}
	public static void main(String[] args) throws InterruptedException {
		setupDrivers("chrome"); // calling method to select chrome driver
		
		dr.get("http://yahoo.com");
		Thread.sleep(3000);
	//	ExpectedPageTitle--String type
		//ActualPageTitle
	    String ExpectedPageTitle = "Yahoo";
		String ActualPageTitle= dr.getTitle();
		System.out.println(ActualPageTitle);
		//comparing/Assort:
		Thread.sleep(5000);
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
			System.out.println("Test Case Passed");
		dr.close();
		}
	}}


