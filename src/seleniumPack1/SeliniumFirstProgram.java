package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumFirstProgram 
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
	
	
	
	WebDriver driver =  new ChromeDriver();

	//driver.get("https://www.facebook.com/");
	//driver.get("https://www.amazon.in/");
	//driver.get("https://www.flipkart.com//");
	}

}
