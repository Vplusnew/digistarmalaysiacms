package selenium.AutomationCMSDigistar;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

@SuppressWarnings("unused")
public class b_Content_Menu{
	

@Test
public void TC10_MenambahClusterHomepage() throws InterruptedException {
//Login
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Cluster Automation 3");

		driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Cluster 3");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Tes Bahasa Indonesia");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[5]/textarea")).sendKeys("Tes Bahasa Inggris");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[6]/input")).sendKeys("Homepage");
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("15");
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
public void TC11_EditClusterHomepage() throws InterruptedException {
	//Login
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	//EditCluster;
			Thread.sleep(500);
			
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[3]/div[1]/div/div[1]/div/button")).click()	;
			//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/main[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).clear();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("1");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("407");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
				Thread.sleep(20000);
			driver.close();
			driver.quit();

	}
  @Test
  public void TC12_MenambahCusterHomepageTanpaIsiField() throws InterruptedException {
  	//Login
  			WebDriver driver;
  			WebDriverManager.chromedriver().setup();
  			driver = new ChromeDriver();
  			driver.manage().window().maximize();
  			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  			driver.get("https://cms-stag-digistar.visionplus.id/login");
  		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  			Thread.sleep(1000);
  			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
  			Thread.sleep(500);
  			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
  			Thread.sleep(500);
  			
  			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
  	
  			Thread.sleep(500);
  			
  			driver.findElement(By.xpath("(//input[@value='homepage'])[1]")).click();
  			driver.findElement(By.xpath("(//button[normalize-space()='Cluster'])[1]")).click();

  			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
  				Thread.sleep(500);
  				Thread.sleep(20000);
  			driver.close();
  			driver.quit();

  	}

	

@Test
public void TC13_MenambahClusterHomepageTanpaKonten() throws InterruptedException {
//Login
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Cluster Automation 3a");

		driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Cluster 3a");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Tes Bahasa Indonesia");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[5]/textarea")).sendKeys("Tes Bahasa Inggris");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[6]/input")).sendKeys("Homepage");
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("13");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click(); 
		Thread.sleep(1000);
		
		WebElement cluster=driver.findElement(By.xpath("(//h1[normalize-space()='Automation Cluster 3a'])[1]"));
	      // Actions class with moveToElement()
		 
	    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(cluster);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 300)
                .perform();
	      
			Thread.sleep(20000);
		driver.close();
		driver.quit();

}

@Test
public void TC14_MenambahKontenDenganHuruf() throws InterruptedException {
//Login
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Cluster Automation 3");

		driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Cluster 3");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Tes Bahasa Indonesia");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[5]/textarea")).sendKeys("Tes Bahasa Inggris");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[6]/input")).sendKeys("Homepage");
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("15e");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("66612e");
		driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
			Thread.sleep(10000);
		driver.close();
		driver.quit();

}		

@Test
public void TC15_MenambahKontenTidakKlikAddkonten() throws InterruptedException {
//Login
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Cluster Automation 3b");

		driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Cluster 3b");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[4]/textarea")).sendKeys("Tes Bahasa Indonesia");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[5]/textarea")).sendKeys("Tes Bahasa Inggris");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[5]/div/div[2]/div[1]/div[2]/form/div[1]/div[6]/input")).sendKeys("Homepage");
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder='Sort'])[1]")).sendKeys("15");
		driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("407");
		
		driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
		Thread.sleep(500);
		WebElement cluster=driver.findElement(By.xpath("(//h1[contains(text(),'Automation Cluster 3b')])[1]"));
	      // Actions class with moveToElement()
	    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(cluster);
      new Actions(driver)
              .scrollFromOrigin(scrollOrigin, 0, 300)
              .perform();
			Thread.sleep(10000);
		driver.close();
		driver.quit();

}		
  @Test
public void TC16_MenambahClusterMovies() throws InterruptedException {
	//Login
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	//EditCluster;
			driver.findElement(By.xpath("(//input[@value='movies'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[normalize-space()='Cluster'])[1]")).click();
			//driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/main[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Otomasi Movies 1");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Movies 1");
			driver.findElement(By.xpath("(//input[@placeholder='Sorting'])[1]")).sendKeys("10");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@value='1'])[1]")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Content ID'])[1]")).sendKeys("254");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//button[normalize-space()='Add Content'])[1]")).click();
			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
			WebElement cluster=driver.findElement(By.xpath("(//h1[normalize-space()='Automation Movies 1'])[1]"));
		    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(cluster);
	      new Actions(driver)
	              .scrollFromOrigin(scrollOrigin, 0, 300)
	              .perform();
				Thread.sleep(10000);
			driver.close();
			driver.quit();
			
}
  

  @Test
public void TC17_EditClusterMovies() throws InterruptedException {
	//Login
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://cms-stag-digistar.visionplus.id/login");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@id='email'])[1] ")).sendKeys("test@mail.com");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("4321lupa");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
	//EditCluster;
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@value='movies'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/main/div/div[3]/div[9]/div/div[1]/div/button")).click();
			driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).clear();
			driver.findElement(By.xpath("(//input[@placeholder='Title (ID)'])[1]")).sendKeys("Otomasi film 2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).clear();
			driver.findElement(By.xpath("(//input[@placeholder='Title (EN)'])[1]")).sendKeys("Automation Movies 2");
			driver.findElement(By.xpath("(//input[@placeholder='Sorting'])[1]")).clear();
			driver.findElement(By.xpath("(//input[@placeholder='Sorting'])[1]")).sendKeys("6");
			
			driver.findElement(By.xpath("(//button[normalize-space()='save'])[1]")).click();
			Thread.sleep(2000);
			WebElement cluster=driver.findElement(By.xpath("(//h1[normalize-space()='Automation Movies 2'])[1]"));
		    WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(cluster);
	      new Actions(driver)
	              .scrollFromOrigin(scrollOrigin, 0, 300)
	              .perform();
				Thread.sleep(10000);
			driver.close();
			driver.quit();
		

	}
}


