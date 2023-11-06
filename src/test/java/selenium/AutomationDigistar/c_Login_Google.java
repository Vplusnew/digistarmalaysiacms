package selenium.AutomationDigistar;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import java.security.PublicKey;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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


//
//from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
//from selenium_stealth import stealth
//chrome_options = Options()
//chrome_options.add_experimental_option("useAutomationExtension", False)
//chrome_options.add_experimental_option("excludeSwitches",["enable-automation"])
//chrome_options.add_argument("--start-maximized")
//chrome_options.add_argument('--disable-logging')
//chrome_options.add_argument('--no-sandbox')
//chrome_options.add_argument('--disable-dev-shm-usage')
//chrome_options.add_argument('--disable-blink-features=AutomationControlled')
//caps = DesiredCapabilities.CHROME
//caps['goog:loggingPrefs'] = {'performance': 'ALL'}

@SuppressWarnings("unused")
public class c_Login_Google{

	@Test
public void Login_valid_Google() throws InterruptedException { //TC1 Login No telephone Valid
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
			ChromeOptions chromeOptions= new ChromeOptions();
			chromeOptions.addArguments("--disable-logging");
			String currentHandle= driver.getWindowHandle();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.visionplus.id");
			driver.findElement(By.cssSelector("button.q-btn.inline.q-btn-item.non-selectable.login.q-btn--unelevated.q-btn--rectangle.q-focusable.q-hoverable")).click();
			 Thread.sleep(1000);
//				
			driver.findElement( By.xpath("(//button[normalize-space()='Continue with Google'])[1]")).click();
			Thread.sleep(1000); 
			String parentHandle= driver.getWindowHandle();
			System.out.println("parent window - "+parentHandle);
			Set<String> handles = driver.getWindowHandles();
			for (String handle : handles ) {
				System.out.println(handle);
				if (!handle.equals(parentHandle)) {
					driver.switchTo().window(handle);
//					driver.findElement(By.xpath("(//input[@id='identifierId'])[1]")).sendKeys("fatahalim245@gmail.com");
					driver.findElement(By.xpath("//input[@type='email']")).sendKeys("checklist01@gmail.com");
					driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]")).click();
					Thread.sleep(10000);
					driver.close();
				}
			}
			driver.switchTo().window(parentHandle);
////			
//		
			driver.findElement(By.xpath("(//input[@name='Passwd'])[1]")).sendKeys("Malangpost1");
			driver.findElement(By.xpath("(//span[normalize-space()='Selanjutnya'])[1]")).click();
			Thread.sleep(10000);
			driver.close();
			driver.quit();
			
		}

	@Test
	public void Login_valid_TanpaInputGoogle() throws InterruptedException { //TC1 Login No telephone Valid
				WebDriver driver;
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			
				ChromeOptions chromeOptions= new ChromeOptions();
				chromeOptions.addArguments("--disable-logging");
				String currentHandle= driver.getWindowHandle();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.visionplus.id");
				driver.findElement(By.cssSelector("button.q-btn.inline.q-btn-item.non-selectable.login.q-btn--unelevated.q-btn--rectangle.q-focusable.q-hoverable")).click();
				 Thread.sleep(1000);
//					
				driver.findElement( By.xpath("(//button[normalize-space()='Continue with Google'])[1]")).click();
				Thread.sleep(1000); 
//				String parentHandle= driver.getWindowHandle();
//				System.out.println("parent window - "+parentHandle);
//				Set<String> handles = driver.getWindowHandles();
//				for (String handle : handles ) {
//					System.out.println(handle);
//					if (!handle.equals(parentHandle)) {
//						driver.switchTo().window(handle);
////						driver.findElement(By.xpath("(//input[@id='identifierId'])[1]")).sendKeys("fatahalim245@gmail.com");
//						driver.findElement(By.xpath("//input[@type='email']")).sendKeys("checklist01@gmail.com");
//						driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]")).click();
//						Thread.sleep(10000);
//						driver.close();
//					}
//				}
//				driver.switchTo().window(parentHandle);
//////				
////			
//				driver.findElement(By.xpath("(//input[@name='Passwd'])[1]")).sendKeys("Malangpost1");
//				driver.findElement(By.xpath("(//span[normalize-space()='Selanjutnya'])[1]")).click();
//				Thread.sleep(10000);
//				driver.close();
				driver.quit();
}
}
	