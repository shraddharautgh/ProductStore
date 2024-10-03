package signUp;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		//Open ChromeBrowser
		System.getProperty("webdriver.chrome.driver", "//Users//shraddha//Documents//Profound//Selenium jar files//chromedriver-mac-arm64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.demoblaze.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on Sign up link
		driver.findElement(By.xpath("//*[@id='signin2']")).click();
		
		//Enter User name
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("SH2802");
		
		//Enter Password
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("123456789");
		
		//Click on Sign up
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		
		//Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Handle alert
		Alert alert = driver.switchTo().alert();
        //Press the OK button
        alert.accept();
		
		//Close driver
		driver.close();
				
		//Just a print message
		System.out.println("Script executed successfully");
	}

}
