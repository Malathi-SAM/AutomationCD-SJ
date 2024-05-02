package Week1.day01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Navigation {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/test");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String HomeUrl = driver.getCurrentUrl();
		
		File HomeScr = driver.getScreenshotAs(OutputType.FILE);
		File Homedest = new File("./snaps/image1.png");
		FileHandler.copy(HomeScr, Homedest);
		
		System.out.println("Work-space Url: "+HomeUrl);
		
		driver.findElement(By.xpath("//img[@alt='letcode']")).click();	 //a[@class='navbar-item'][1]
		
		String currentUrl = driver.getCurrentUrl();
		
		File currentScr = driver.getScreenshotAs(OutputType.FILE);
		File currentdest = new File("./snaps/image2.png");
		FileHandler.copy(currentScr, currentdest);
		
		System.out.println("New Url: "+currentUrl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("Return to work-Space Url: "+driver.getCurrentUrl());
		
		driver.quit();

	}

}
