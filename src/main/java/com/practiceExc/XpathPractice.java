package com.practiceExc;




import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import javax.print.DocFlavor.URL;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	/*public static void main(String[] args) {
		String ActualUrl ="http://qdpm.net/demo/v9/index.php";
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); //running with chrome browser
		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");
		WebElement we = dr.findElement(By.xpath("//a[@href='/login']"));
		//Assert
	
	
	}*/
	
	@Test
	public void checklinks() throws IOException {
		//String ActualUrl ="http://qdpm.net/demo/v9/index.php";
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(); //running with chrome browser
		dr.get("http://demowebshop.tricentis.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Running with Chrome driver");
		
		List<WebElement> listoflink = dr.findElements(By.tagName("a"));
		int no_oflist = listoflink.size();
		System.out.println("Number of url:"+no_oflist );
		String url = listoflink.get(1).getAttribute("href");
		System.out.println(url);
		for(WebElement el: listoflink) {
			String currenturl = el.getAttribute("href");
			
			URL url1 = new URL(currenturl);
			HttpURLConnection conn = (HttpURLConnection)url1.openConnection();
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			Assert.assertEquals(respCode,200,"resp code is not matching for url:"+ currenturl);
		}
		
		
	}
	

}
