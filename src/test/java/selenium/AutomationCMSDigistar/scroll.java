package selenium.AutomationCMSDigistar;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.interactions.WheelInput;

@SuppressWarnings("unused")
public class scroll{

	@Test
public void TC1_Login_valid() throws InterruptedException { //TC1 Login No telephone Valid
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			Thread.sleep(20000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
			
			WebElement cluster=driver.findElement(By.xpath("(//h1[normalize-space()='Automation Cluster 6'])[1]"));
		      // Actions class with moveToElement()
//		    new Actions(driver)
//		    .scrollToElement(cluster)
//		    .perform();
//		 
		    
		    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(cluster);
	        new Actions(driver)
	                .scrollFromOrigin(scrollOrigin, 0, 300)
	                .perform();
			Thread.sleep(5000);
			driver.close();
			driver.quit();
			
	}
		}