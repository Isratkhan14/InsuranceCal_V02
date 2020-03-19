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
	    
	    dr.findElement(By.xpath("//input[@name='Cylinder Capacity']")).sendKeys("200");
	    dr.findElement(By.xpath("//input[@name='[kW]']")).sendKeys("1500");
	    dr.findElement(By.name("Date of Manufacture")).sendKeys("02/05/2020");
	    
	    WebElement numberOfseat  = dr.findElement(By.name("Number of Seats"));
	    selectFromDropDown(numberOfseat,"2"); // number of seat
	   // dr.findElement(By.xpath("//label[text()='Yes']")).click(); //radio button
	    
	    WebElement numberOfseat2  = dr.findElement(By.name("Number of Seats Motorcycle"));
	    selectFromDropDown(numberOfseat2,"3"); // number of seat dropdown 2
        
	    WebElement fuelType  = dr.findElement(By.name("Fuel Type"));
	    selectFromDropDown(fuelType,"Diesel"); // Fuel type
	    
	    dr.findElement(By.name("Payload")).sendKeys("700"); //payload
	    dr.findElement(By.name("Total Weight")).sendKeys("1500"); //Total weight
	    dr.findElement(By.name("List Price")).sendKeys("70000"); //List Price
	    dr.findElement(By.name("License Plate Number")).sendKeys("LV500");; //License Plate number
	    dr.findElement(By.name("Annual Mileage")).sendKeys("30000"); //Annual Mileage
	   
	    dr.findElement(By.name("Next (Enter Insurant Data)")).click();// next
	    
	    
	    String pageTitle = dr.getTitle();
	    System.out.println("Page title: "+pageTitle);
	    Assert.assertTrue(pageTitle.contains("Fill Insurant Data"));
	    
	    ///////////////////////////////////////////2nd page
	    
	    dr.findElement(By.name("First Name")).sendKeys("Ababa"); //First name
	    dr.findElement(By.name("Last Name")).sendKeys("Abbb"); //Last Name
	    dr.findElement(By.name("Date of Birth")).sendKeys("09/12/1983"); //Date of birth
	    
	    WebElement country  = dr.findElement(By.name("Country")); //country
	    selectFromDropDown(country,"Bangladesh"); 
	    
	    dr.findElement(By.name("Zip Code")).sendKeys("1250"); //Zip Code
	    
	    WebElement occupation  = dr.findElement(By.name("Occupation")); //occupation 
	    selectFromDropDown(occupation,"Public Official");
	    
	    dr.findElement(By.xpath("//input[@id='speeding']/parent::label ")).click(); //hobbies
	    dr.findElement(By.id("nextenterproductdata")).click();
	    Thread.sleep(1000);
	    
	    String pageTitle2 = dr.getTitle();
	    System.out.println("Next Page title: "+pageTitle2);
	    Assert.assertTrue(pageTitle2.contains("Fill Product Data"));
	    
	    ////////////////////////////////////////////3rd page
	    
	    dr.findElement(By.name("Start Date")).sendKeys("08/08/2021"); //start date
	    
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
	    
	    //////////////////////////////////////////////////////////////////////////
	    
	    //Reading and printing  the table  
	    
	    //Column One
	    
	  //*[@id="priceTable"]/tbody/tr[1]/td[1]
	  //*[@id="priceTable"]/tbody/tr[2]/td[1]
	  
	    
	    String firstPart_Xpath = "//*[@id=\"priceTable\"]/tbody/tr[";
	    String lastPart_Xpath = "]/td[1]";
	    for(int i = 1; i<=4; i++) {
	    	String actualXpath = firstPart_Xpath+i+lastPart_Xpath;
	    	WebElement el = dr.findElement(By.xpath(actualXpath));
	    	System.out.println(el.getText());
	    	
	    }
	    
	  //*[@id="selectsilver_price"]
	  //*[@id="priceTable"]/tbody/tr[2]/td[2]
	  
	    
	    //Column two
	    
	   WebElement rc2 = dr.findElement(By.xpath("//*[@id=\"selectsilver_price\"]"));
	   String row1Col2 =rc2.getText();
	   System.out.println("First row of first column: "+row1Col2);
	   
	   String lastPart_Xpath_Col2 = "]/td[2]"; 
	    
	   for(int i = 2; i<=4; i++) {
	    	String actualXpath = firstPart_Xpath+i+lastPart_Xpath_Col2;
	    	WebElement el = dr.findElement(By.xpath(actualXpath));
	    	System.out.println(el.getText());
	    	
	    }
	   
	   //Column three
	   
	   System.out.println("     Data from the Third column:    ");
	   WebElement rc3 = dr.findElement(By.xpath("//*[@id=\"selectgold_price\"]"));
	   String row1Col3 =rc3.getText();
	   System.out.println(row1Col3);
	   
	   String lastPart_Xpath_Col3 = "]/td[3]"; 
	    
	   for(int i = 2; i<=4; i++) {
	    	String actualXpath = firstPart_Xpath+i+lastPart_Xpath_Col3;
	    	WebElement el = dr.findElement(By.xpath(actualXpath));
	    	System.out.println(el.getText());
	    	
	    }
	   
	   //Column Four
	   
	   System.out.println("     Data from the 4th column:    ");
	   WebElement rc4 = dr.findElement(By.xpath("//*[@id=\"selectplatinum_price\"]"));
	   String row1Col4 =rc4.getText();
	   System.out.println(row1Col4);
	   
	   String lastPart_Xpath_Col4 = "]/td[4]"; 
	    
	   for(int i = 2; i<=4; i++) {
	    	String actualXpath = firstPart_Xpath+i+lastPart_Xpath_Col4;
	    	WebElement el = dr.findElement(By.xpath(actualXpath));
	    	System.out.println(el.getText());
	    	
	    }
	   
     //Column Five
	   
	   System.out.println("     Data from the 5th column:    ");
	   WebElement rc5 = dr.findElement(By.xpath("//*[@id=\"selectultimate_price\"]"));
	   String row1Col5 =rc5.getText();
	   System.out.println(row1Col5);
	   
	   String lastPart_Xpath_Col5 = "]/td[5]"; 
	    
	   for(int i = 2; i<=4; i++) {
	    	String actualXpath = firstPart_Xpath+i+lastPart_Xpath_Col5;
	    	WebElement el = dr.findElement(By.xpath(actualXpath));
	    	System.out.println(el.getText());
	    	
	    	
	    	dr.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click(); // Radio button for Platinum option
	    	dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	    }
}
	
	public  void  selectFromDropDown(WebElement element, String value) {
		Select st =new Select(element);
		st.selectByValue(value);
	}
}