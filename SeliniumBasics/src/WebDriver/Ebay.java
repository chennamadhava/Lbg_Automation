package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagch\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("register")).click();
		driver.findElement(By.id("firstname")).sendKeys("Shravani");
		driver.findElement(By.id("lastname")).sendKeys("Krishna");
		driver.findElement(By.id("email")).sendKeys("shravanikrishna1@gmail.com");
		//driver.findElement(By.id("PASSWORD_r")).sendKeys("nagulu@456");
		driver.findElement(By.id("PASSWORD")).sendKeys("nagulu@456");
		driver.findElement(By.id("ppaFormSbtBtn")).click();
		//driver.get(arg0);
	}

}
