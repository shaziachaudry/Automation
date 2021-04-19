package mavencodingprojct.sahartaha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class actionofpointers {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","c:\\Users\\users\\codingofweekend\\softwaretest);"
         driver=new ChromeDriver();
        driver.("https://jqueryui.comdroppable/");
        driver.manage().window().maximize();
       // WebElement signin=driv ement(By.xpath("//*[text()= 'Hello, Sign in']"));
        Actions=ob=new actions(driver);
        /*ob.moveToElement(Signin).build().perform();
     WebElement or=driver.findElement(By.linkText(Orders"));
     ob.moveToElement(or).click().build().perform(),*/
        driver.switchTo().frame(0);
        WebElement dragables=driver.findElement(By.id("draggable"));
        WebElementdropables=driver.findElements(By.id("droppable"));
        ob.dragAndDrop(dragables,dropables).build()Perform();
        		

   
         */
	}

}
