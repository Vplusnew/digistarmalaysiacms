package selenium.AutomationCMSDigistar;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.security.PublicKey;
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


@SuppressWarnings("unused")
public class Scenario3_Configuration_Feature{

	@Test
public void TC12() throws InterruptedException { //TC1 Login No telephone Valid
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
			
			driver.findElement(By.xpath("(//input[@name='navchild-container'])[2]")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[@class='collapse-content'])[3]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//button[@class='btn btn-warning btn-xs'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@id='content_id'])[1]")).sendKeys("Automation Wording1");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//button[normalize-space()='Add Wording'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//textarea[@id='form.indonesia.Automation Wording1'])[1]")).sendKeys("Tes OTOMASI WORDING BAHASA INDONESIA");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//textarea[@id='form.english.Automation Wording1'])[1]")).sendKeys("Automation Tes Wording English language");
	
			Thread.sleep(500);
			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
			
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
			Thread.sleep(10000);
			driver.close();
			driver.quit();
			
		}
}