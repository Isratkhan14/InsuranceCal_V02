import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsuranceClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.yahoo.com/");
		//ExpectedPageTitle--String type
		//ActualPageTitle
		String ExpectedPageTitle = "Yahoo";
		String ActualPageTitle= dr.getTitle();
		System.out.println(ActualPageTitle);
		//comparing/Assort:
		Thread.sleep(5000);
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
			System.out.println("Test Case Passed");
		}
		else
			System.out.println("Test Case Fail");
		Thread.sleep(5000); 
		dr.close(); 
		}
	}


