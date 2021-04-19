package mavencodingprojct.sahartaha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	
	
	
	
	
static	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\sahartaha\\Drivers\\chromedriver.exe");
		
		//System.set is used to give the path of chrome driver.Selenium will use this driver to open the browser
		driver=new ChromeDriver();
		
		
		//ChromeDriver is used to open the browser
		driver.get("https://www.amazon.com");
		
		
		//driver.get used for opening any site in the browser

	}

}
