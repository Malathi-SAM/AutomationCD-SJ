package Week1.day01;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {


	public static void main(String[] args) {
		
		// step1: Download and attach web driver
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);	
		
		//Step2:Create driver
		ChromeDriver driver = new ChromeDriver();
		
		//step3: load web page
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
		
		// Append a text and give tab to move cursor
		driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		driver.findElement(By.xpath("//div[@class='UUbT9 EyBRub']/div//ul[@class='G43f7e']/li[@class=\"sbct\"][3]")).click();
		
		//driver.get("https://mail.google.com/mail/?tab=rm&ogbl"); 
		
		//driver.findElement(By.id("identifierId")).sendKeys("abc");  
		
		//driver.findElement(By.name("btnK")).click(); 
		
		//driver.findElement(By.linkText("Log in")).click();
			
		//driver.findElement(By.name("email")).sendKeys("ruthradevi@gmail.com");
		
		//driver.findElement(By.name("password")).sendKeys("ruthra91"); 
		
		//driver.findElement(By.xpath("//button[@class='button is-primary']")).click(); 

		
		//driver.findElement(By.xpath("//div[@class='navbar-start']/a[@id='testing']")).click();
		
		System.out.println("workspace");
	}			

}
