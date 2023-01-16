package seleniumPack1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.awt.Dimension;


public class SetSizeMethodProgram
{
	public static void main(String[] args) throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();				
		driver.get("https://www.facebook.com/"); 
		
		Thread.sleep(3000);
		//setSize()
		Dimension d= new Dimension(400,500);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		
		
		//browser position set
	       //     X-Y coordinates->pixels
	Point p = new Point(400,400);		
	driver.manage().window().setPosition(p);
	Thread.sleep(3000);

driver.close();
	}
	

}
