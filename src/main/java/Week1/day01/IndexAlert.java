package Week1.day01;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");		
		driver.manage().window().maximize();
		
		//	implicit wait code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Frame code
		WebElement iframes = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); 
		driver.switchTo().frame(iframes);
		
		//	Prompt alert code
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
