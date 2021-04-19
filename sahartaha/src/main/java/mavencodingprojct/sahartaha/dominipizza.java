package mavencodingprojct.sahartaha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class dominipizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public class pizza {
 public static WebDriver driver; 
      public static void main(string[]args)throws interruptedException {
    	  //TODO Auto-generated method stub
    	  System.setProperties("webdriver.chrome.driver",)"
    	  driver=new ChromeDriver();
    	  driver.get("//https:www.dominos.com");
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS;
    	  )
      }