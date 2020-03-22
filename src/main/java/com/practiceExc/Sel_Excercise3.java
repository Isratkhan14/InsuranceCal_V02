package com.practiceExc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;

public class Sel_Excercise3 {
	WebDriver dr = null;

	@BeforeMethod
	public void openingBrowser() {
		WebDriverManager.chromedriver().setup();
		dr = new ChromeDriver(); // running with chrome browser
		dr.get("http://qdpm.net/demo/v9/index.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");
		// Log in
		dr.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div/input")).sendKeys("administrator@localhost.com");
		dr.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input")).sendKeys("administrator");
		dr.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();

	}

	@Test(priority = 1)
	public void mainMethod() throws Exception {

		// 2nd page
		String firstpageTitle = dr.getTitle();
		System.out.println("First Page title: " + firstpageTitle);

		Assert.assertEquals(firstpageTitle, "qdPM | Dashboard");

		// reading and printing the items from dashboard

		List<WebElement> listofitems = dr.findElements(By.tagName("a"));

		for (WebElement el : listofitems) {

			String st = el.getText();

			System.out.println(st);

			if (st.equalsIgnoreCase("qdPM Extended")) {

				break;
			}

		}

	}

	@Test(priority = 2)
	public void varification_Of_DashboardIteam() {

		// Verification any item from the dashboard item

		WebElement config = dr.findElement(By.xpath("//span[contains(text(),'Configuration')]"));
		String st = config.getText();

		Assert.assertEquals(st, "Configuration");
		System.out.println("One of the dashboard link :)" + st);
	}

	@Test(priority = 3)
	public void AddTaskForm() throws Exception {

		// clicking on the AddTask button
		dr.findElement(By.xpath("//*[@id=\"userReports2\"]/div/table/tbody/tr/td/table/tbody/tr/td[1]/button")).click();

		// New Task form opened

		WebElement project = dr.findElement(By.name("form_projects_id")); //Selecting project
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].click();", project);
		Thread.sleep(3000);
		selectFromDropDown(project, "1");
		Thread.sleep(3000);

		JavascriptExecutor js1 = (JavascriptExecutor) dr;
		WebElement type = dr.findElement(By.xpath("//*[@id=\"tasks_tasks_type_id\"]")); // Type

		js1.executeScript("arguments[0].click();", type);

		selectFromDropDown(type, "3");

		dr.findElement(By.name("tasks[name]")).sendKeys("Israt");// Name

		Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) dr;
		WebElement status = dr.findElement(By.xpath("//*[@id=\"tasks_tasks_status_id\"]")); // Status
		js2.executeScript("arguments[0].click();", status);
		selectFromDropDown(status, "8");

	}

	public void selectFromDropDown(WebElement element, String value) {
		Select st = new Select(element);
		st.selectByValue(value);
	}

	@AfterMethod
	public void closingBrowser() {

		// closing browser
		dr.close();

	}

}
