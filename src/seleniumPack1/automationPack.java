package seleniumPack1;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPack
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
	   
	   WebDriver driver= new ChromeDriver();
	   
	   //get() --method of webdriver
	   
	   driver.get("https://www.facebook.com/");
	   
	  
       
	  // Different Methods of WebDriver 12 listed bellow
//	   get()--> to get the URL
//	   
//	   navigate().to()--> to open the URL
//	   
//	   navigate().forward()--> to navigate to forward
//	   
//	   navigate ().Back()--> to navigate to backward
//	   
//	   navigate().refresh()--> to do the refresh
//	   
//	   manage().window().maximize()--> to maximize the browser
//	   
//	   close()--> to close the current window
//	   
//	   quit()--> to close the browser
//	   
//	   getCurrentUrl()--> to get the URL of the web site
//	   
//	   getTitle()--> to get the title of the web site
//	   
//	   manage().window().SetSize()-->to set the size of the browser
//	   
//	   manage().window().SetPosition()--> to set the position of the browser
	   
	   
	   
	   
}
}
