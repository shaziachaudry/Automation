package mavencodingprojct.sahartaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepot {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\sahartaha\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.homedepot.com");
		  WebElement id=driver.findElement(By.xpath("(//div[text()='My Account'])[1]"));
		  id.click();
		  Thread.sleep(6000);
		  driver.findElement(By.linkText("Sign in" )).click();
	}

}
