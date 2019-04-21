package SeliniumSimplePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Hiiiiiiiiiiii");
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\nagch\\Desktop\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.google.com");
	}

}
