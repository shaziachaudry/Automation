package mavencodingprojct.sahartaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver;
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\sahartaha\\Drivers\\chromedriver.exe");
  {
 
    diver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage(),window(.maximize);
   WebElement EmailidFields=driver.findElement(By.id("email"));
   EmailidFields.sendKeys("snchaudry@gmail.com");
   WebElement password=driver.findElement(By.name)("pass"));
   password.sendKeys("123456");
  // WebElement forgot=driver.findElement(By.LinkTexe("forget password"));
   Forgot.click();
   Thread.sleep(6000),
   WebElement cancel=driver .findElement(By.xpath("/html/body/div/div/div/div/div/div"));
   cancel.click();
  
  
	} 

}
