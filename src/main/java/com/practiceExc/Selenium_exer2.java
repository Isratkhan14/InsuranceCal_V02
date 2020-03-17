package com.practiceExc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_exer2 {
	
	@Test
	public void checklinks() throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); //running with chrome browser
		dr.get("http://demo.automationtalks.com/index.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");
		
		WebElement make  = dr.findElement(By.name("Make"));
	    selectFromDropDown(make,"BMW"); // make
	    
	    WebElement model  = dr.findElement(By.name("Model"));
	    selectFromDropDown(model,"Scooter"); // model
	    
	    dr.findElement(By.xpath("//input[@name='Cylinder Capacity']")).sendKeys("200ccm");
	    dr.findElement(By.xpath("//input[@name='[kW]']")).sendKeys("1500kW");
	    dr.findElement(By.name("Date of Manufacture")).sendKeys("02/05/2020");
	    
	    WebElement numberOfseat  = dr.findElement(By.name("Number of Seats"));
	    selectFromDropDown(numberOfseat,"2"); // number of seat
	    dr.findElement(By.xpath("//label[text()='Yes']")).click(); //radio button
	    
	    WebElement numberOfseat2  = dr.findElement(By.name("Number of Seats Motorcycle"));
	    selectFromDropDown(numberOfseat2,"3"); // number of seat dropdown 2
        
	    WebElement fuelType  = dr.findElement(By.name("Fuel Type"));
	    selectFromDropDown(fuelType,"Diesel"); // Fuel type
	    
	    dr.findElement(By.name("Payload")).sendKeys("700"); //payload
	    dr.findElement(By.name("Total Weight")).sendKeys("2800"); //Total weight
	    dr.findElement(By.name("List Price")).sendKeys("70000"); //List Price
	    dr.findElement(By.name("License Plate Number")).sendKeys("LV500");; //License Plate number
	    dr.findElement(By.name("Annual Mileage")).sendKeys("30000"); //Annual Mileage
	   
	    dr.findElement(By.name("Next (Enter Insurant Data)")).click();// next
	    
	    
	    String pageTitle = dr.getTitle();
	    System.out.println("Page title: "+pageTitle);
	    Assert.assertTrue(pageTitle.contains("Fill Insurant Data"));
	    
	    ///////////////////////////////////////////2nd page
	    
	    dr.findElement(By.name("First Name")).sendKeys("Aaaa"); //First name
	    dr.findElement(By.name("Last Name")).sendKeys("Bbbb"); //Last Name
	    dr.findElement(By.name("Date of Birth")).sendKeys("09/12/1983"); //Date of birth
	    
	    WebElement country  = dr.findElement(By.name("Country")); //country
	    selectFromDropDown(country,"Austria"); 
	    
	    dr.findElement(By.name("Zip Code")).sendKeys("06654"); //Zip Code
	    
	    WebElement occupation  = dr.findElement(By.name("Occupation")); //occupation 
	    selectFromDropDown(occupation,"Public Official");
	    
	    dr.findElement(By.xpath("//input[@id='speeding']/parent::label ")).click(); //hobbies
	    dr.findElement(By.id("nextenterproductdata")).click();
	    Thread.sleep(1000);
	    
	    String pageTitle2 = dr.getTitle();
	    System.out.println("Next Page title: "+pageTitle2);
	    Assert.assertTrue(pageTitle2.contains("Fill Product Data"));
	    
	    ////////////////////////////////////////////3rd page
	    
	    dr.findElement(By.name("Start Date")).sendKeys("08/08/2020"); //start date
	    
	    WebElement insurancesum  = dr.findElement(By.name("Insurance Sum")); //Insurance sum
	    selectFromDropDown(insurancesum,"5000000"); 
	    
	    WebElement meritrating  = dr.findElement(By.name("Merit Rating")); //Merit Rating
	    selectFromDropDown(meritrating,"Bonus 2");
	    
	    WebElement damageinsurance  = dr.findElement(By.name("Damage Insurance")); //Damage insurance
	    selectFromDropDown(damageinsurance,"No Coverage");
	    
	    dr.findElement(By.xpath("//input[@id='EuroProtection']/parent::label")).click(); //Optional product
	    
	    
	    WebElement courtesycar  = dr.findElement(By.name("Courtesy Car")); //Courtesy car
	    selectFromDropDown(courtesycar,"No"); 
	    
	    dr.findElement(By.name("Next (Select Price Option)")).click(); //next button
	    
	    String pageTitle3 = dr.getTitle();
	    System.out.println("Third Page title: "+pageTitle3);
	    Assert.assertTrue(pageTitle3.contains("Choose Price Option"));
	    
}
	
	public  void  selectFromDropDown(WebElement element, String value) {
		Select st =new Select(element);
		st.selectByValue(value);
	}
}