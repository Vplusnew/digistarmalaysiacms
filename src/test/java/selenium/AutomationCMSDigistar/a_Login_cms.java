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
public class a_Login_cms{

	@Test
public void Login_valid() throws InterruptedException { //TC1 Login No telephone Valid
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			Thread.sleep(20000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
			Thread.sleep(10000);
			driver.close();
			driver.quit();
			
		}
	
  @Test
public void LoginEmailTidfakterdaftar() throws InterruptedException { //TC2 login PasswordSalah
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://cms-stag-digistar.visionplus.id/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Thread.sleep(20000);
		driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("EmailTidakAda@gmail.com");
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		
	}


@Test
public void LoginPasswordSalah() throws InterruptedException { //TC3 Login NoTLPSalah
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://cms-stag-digistar.visionplus.id/login");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	Thread.sleep(20000);
	driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
	driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupaaaaaaaaa");
	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	Thread.sleep(10000);
	driver.close();
	driver.quit();
		
	}

@Test
public void LoginTidakInputEmaildanpassword() throws InterruptedException { //TC4
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://cms-stag-digistar.visionplus.id/login");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	Thread.sleep(20000);
	
	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	Thread.sleep(10000);
	driver.close();
	driver.quit();
		
	}
}

  
