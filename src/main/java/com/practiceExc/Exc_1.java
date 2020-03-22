package com.practiceExc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exc_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ActualUrl = "http://qdpm.net/demo/v9/index.php";
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); // running with chrome browser
		dr.get("http://qdpm.net/demo/v9/index.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");

		String ExpectedPageTitle = "qdPM } Login";
		String ActualPageTitle = dr.getTitle();
		System.out.println(ActualPageTitle);
		// comparing/Assort:

		if (ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
			System.out.println("Test Case Passed");
		} else
			System.out.println("Test Case Fail");

		String ExpectedUrl = dr.getCurrentUrl();
		System.out.println(ExpectedUrl);
		if (ExpectedUrl.equalsIgnoreCase(ActualUrl)) {
			System.out.println("Correct Url---> Test Passed");
		} else
			System.out.println("Url did not match---> Test Failed");

		dr.close();

		WebDriverManager.firefoxdriver().setup();
		WebDriver dr1 = new FirefoxDriver(); // running on Mozilla
		dr1.get("http://qdpm.net/demo/v9/index.php");
		dr1.manage().window().maximize();
		dr1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Running with Firefox driver");
		dr1.close();

		WebDriverManager.iedriver().setup(); // running on IE
		WebDriver dr2 = new InternetExplorerDriver();
		dr2.get("http://qdpm.net/demo/v9/index.php");
		// Thread.sleep(5000);
		dr2.manage().window().maximize();
		dr2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Not sure why Window didn't maximized and closed
		System.out.println("Running with Internet explorar driver");
		dr2.close();

	}

}