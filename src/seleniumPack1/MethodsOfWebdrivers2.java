package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebdrivers2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
		   
		WebDriver driver = new ChromeDriver();

        //1.get method
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000); 
		
		//method chaining concept
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		
		//navigate method
		//back
		driver.navigate().back();  //facebook
		Thread.sleep(5000);
		
		//foward
		driver.navigate().forward();  //google
		Thread.sleep(5000);
		
		//refresh
		driver.navigate().refresh();   //google
	
		
	}

}
