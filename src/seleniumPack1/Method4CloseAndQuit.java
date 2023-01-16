package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Method4CloseAndQuit 
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");
	   
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);

	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);

	driver.navigate().to("https://www.google.com/");
	Thread.sleep(5000);
	
	driver.close();
	Thread.sleep(3000);
	
	driver.quit();
	
	System.out.println("end of program");
	}
}
