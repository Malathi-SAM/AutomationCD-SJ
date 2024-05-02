package Week1.day01;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {


	public static void main(String[] args) {
		
		// step1: Download and attach web driver
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);	
		
		//Step2:Create driver
		ChromeDriver driver = new ChromeDriver();
		
		//step3: load web page
		driver.get("https://letcode.in/");
		
		/*
		driver.findElement(By.linkText("Log in")).click();
			
		driver.findElement(By.name("email")).sendKeys("ruthradevi@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("ruthra91"); 
		
		driver.findElement(By.xpath("//button[@class='button is-primary']")).click(); 
		*/

		//	Click on work-space element
		driver.findElement(By.xpath("//div[@class='navbar-start']/a[@id='testing']")).click();
		
		//	Find element by text 
		driver.findElement(By.xpath("//a[.= 'Edit']")).click();
		
		//	Append text and give tab to move cursor to next field  
		driver.findElement(By.id("fullName")).sendKeys("Rupa",Keys.TAB);
		
		//driver.findElement(By.xpath("//div[@class='card']//input[@id='noEdit']")).isEnabled();	---Child code	
		//driver.findElement(By.xpath("//input[@id='noEdit']/ancestor::div[@class='card']"));		---Ancestor code use to find ancestor value/ data
		
		boolean bool = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(bool);
		
		// get attribute value from element
		String value = driver.findElement(By.id("dontwrite")).getAttribute("value");
		System.out.println(value);
		
		//	Close driver
		driver.quit();
	}			

}
