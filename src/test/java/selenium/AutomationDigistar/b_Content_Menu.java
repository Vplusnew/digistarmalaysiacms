package selenium.AutomationDigistar;
import org.testng.annotations.Test;
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
public class b_Content_Menu{
	

@Test
public void aMenambahkanClusterHomepageBaru() throws InterruptedException {
//Login
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://cms-stag-digistar.visionplus.id/login");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
//MembuatClusterBaru 
		
		driver.findElement(By.xpath("(//input[@value='homepage'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Cluster'])[1]")).click();
//InputAllfield
		driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Cluster Automation 2");

		driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Cluster 2");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Tes Bahasa Indonesia");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[5]/textarea")).sendKeys("Tes Bahasa Inggris");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[6]/input")).sendKeys("Homepage");
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("4");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66612");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66481");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66397");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66317");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66250");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
			Thread.sleep(20000);
		driver.close();
		driver.quit();

}		
	
  @Test
public void bEditClusterHomepage() throws InterruptedException {
	//Login
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	//EditCluster;
			driver.findElement(By.xpath("(//button)[6]")).click();		
			//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/main[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
		
			driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).clear();
			driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("2");
			driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("58226");
			driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
				Thread.sleep(20000);
			driver.close();
			driver.quit();
			
			

	}
}


