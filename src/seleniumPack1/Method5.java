package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method5
{
	
	public static void main(String[] args) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
          WebDriver driver= new ChromeDriver();
          
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/");
          
          String url= driver.getCurrentUrl();
          System.out.println("current url is-->"+url);
          
          String title=driver.getTitle();
          System.out.println("title is--->"+title);
}
}