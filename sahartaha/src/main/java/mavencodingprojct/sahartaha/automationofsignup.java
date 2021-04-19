package mavencodingprojct.sahartaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationofsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public class homedepot {
	static WebDriver driver;
	
	public static void main(string[]args)
       //TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","c:\\username")
	driver=new ChromeDriver();
	driver.navigate().to( "https://www.homedepot.com");
	driver.get( "https://www.homedepot.com");
	driver.manage().window().maximize();
	WebElement account=driver.findElement(By.(homedepot.com))
    account.click();
	WebElement.signin=driver.findElement(By.partialLinkText())
	signin.click();
	
      }
}

