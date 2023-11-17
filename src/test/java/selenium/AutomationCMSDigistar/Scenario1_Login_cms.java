package selenium.AutomationCMSDigistar;

import selenium.AutomationCMSDigistar.base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.FileReader;
import org.apache.commons.compress.harmony.pack200.BandSet.BandData;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.json.simple.parser.ParseException;
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
public class Scenario1_Login_cms extends base {

@Test(dataProvider="dataLog")


	public void TC1_Login_Valid(HashMap<String,String> login ) throws InterruptedException { //TC1 Login No telephone Valid			
			
			driver.get("https://cms-stag-digistar.visionplus.id/login");
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			Thread.sleep(20000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys(login.get("email"));
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys(login.get("password"));
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
			Thread.sleep(5000);
			driver.close();
			driver.quit();
			
		}
//
	@DataProvider
	public Object[][] dataLog() throws IOException {
		List<HashMap<String, String>> login = getJsonData(System.getProperty("user.dir")+"/src/test/java/com.digistar.data/data_login.json");
		return new Object[][] {{login.get(0)}};
		
	}
}//	@Test
//public void TC1_Login_valid() throws InterruptedException { //TC1 Login No telephone Valid
//			WebDriver driver;
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.get("https://cms-stag-digistar.visionplus.id/login");
//			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////			Thread.sleep(20000);
//			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
//			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
//			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//			Thread.sleep(10000);
//			driver.close();
//			driver.quit();
////			
//		}
//}
//	
//  @Test
//public void TC2_LoginEmailTidakterdaftar() throws InterruptedException { //TC2 login PasswordSalah
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://cms-stag-digistar.visionplus.id/login");
//		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		Thread.sleep(20000);
//		driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("EmailTidakAda@gmail.com");
//		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
//		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//		Thread.sleep(10000);
//		driver.close();
//		driver.quit();
//		
//	}
//
//
//@Test
//public void TC3_LoginEmailsalahPasswordSalah() throws InterruptedException { //TC3 Login NoTLPSalah
//	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.get("https://cms-stag-digistar.visionplus.id/login");
//	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	Thread.sleep(20000);
//	driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
//	driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321luaaaaaaaa");
//	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//	Thread.sleep(10000);
//	driver.close();
//	driver.quit();
//		
//	}
//
//@Test
//public void TC4_LoginEmailbenarPasswordSalah() throws InterruptedException { //TC3 Login NoTLPSalah
//	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.get("https://cms-stag-digistar.visionplus.id/login");
//	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	Thread.sleep(20000);
//	driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@maila.com");
//	driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupaaaaaaaaa");
//	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//	Thread.sleep(10000);
//	driver.close();
//	driver.quit();
//		
//	}
//@Test
//public void TC5_LoginTidakInputEmaildanpassword() throws InterruptedException { //TC4
//	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.get("https://cms-stag-digistar.visionplus.id/login");
//	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	Thread.sleep(20000);
//	
//	driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//	Thread.sleep(10000);
//	driver.close();
//	driver.quit();
//		
//	}
//}
