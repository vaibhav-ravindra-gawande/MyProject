package topscorerpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TopscorerAtomomationWithSelenium 
{
   public static void main(String[] args) throws InterruptedException {
	

   
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav\\eclipse-workspace\\July30Velocity\\chromedriver.exe");

	 WebDriver driver= new ChromeDriver();
	 System.out.println("Webdriver Interface Run");
	 driver.manage().window().maximize();

	 System.out.println("Maximie the window");
	 
	 driver.get("https://www.topscorer.com");
	 Thread.sleep(3000);
	 
	 System.out.println("Succesfully fetching the URL");
	 
	 WebElement  loginbtn = driver.findElement(By.id("login-tab"));
	 loginbtn.click();
	 Thread.sleep(3000);

	 System.out.println("Click on login button");
	 
	 WebElement id= driver.findElement(By.id("emailId"));
	 id.sendKeys("8308679943");
	 Thread.sleep(3000);

	 System.out.println("id entered succesfully");
	 
	 WebElement nextbtn= driver.findElement(By.id("btnNext"));
	 nextbtn.click();
	 Thread.sleep(3000);

	 System.out.println("Click on next button");
	 
	 WebElement profile= driver.findElement(By.id("selectedProfile_3"));
	 profile.click();
	 Thread.sleep(3000);


	 System.out.println("Profile 3rd selected");
	 
	 WebElement password= driver.findElement(By.id("key_3"));
	 password.sendKeys("123456");
	 Thread.sleep(3000);

	 System.out.println("Password entered succesfully");
	 
	 WebElement  loginbtn1 = driver.findElement(By.id("loginId_3"));
	 loginbtn1.click();
	 Thread.sleep(3000);

	 System.out.println("Click on login button");

	 System.out.println("End of program");
	 

   }
}

