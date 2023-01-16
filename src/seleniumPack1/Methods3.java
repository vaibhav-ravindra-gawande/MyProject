package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Methods3 
{
	 public static void main(String[] args) throws InterruptedException
	   {
		   System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
		   
		   WebDriver driver= new ChromeDriver();
		   
		   //maximize the browser
			driver.manage().window().maximize();		
			Thread.sleep(3000);
				
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			
			//minimize the browser
			driver.manage().window().minimize();
			Thread.sleep(3000);


}
}