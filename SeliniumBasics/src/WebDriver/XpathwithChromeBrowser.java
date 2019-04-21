package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagch\\Desktop\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          
          driver.manage().window().maximize();
          
          driver.get("https://www.google.com");
          driver.get("https://www.facebook.com/");
         // driver.findElement(By.xpath("//*[@id='email']")).sendKeys("nag.rocks84@gmail.com");
          driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("nag.rocks84@gmail.com");
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nagulu@456");
          driver.findElement(By.xpath("//input[@value='Log In']")).click();
              
	}

}
