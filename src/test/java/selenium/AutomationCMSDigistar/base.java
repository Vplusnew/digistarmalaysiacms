package selenium.AutomationCMSDigistar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import java.io.FileReader; 
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	protected ChromeDriver driver;
	
	@BeforeTest
	public void setup () throws MalformedURLException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}


public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {
		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {
		});
		
		return data;	
	}
}
//	@DataProvider(name="dp")
//	public String[] readJson () throws IOException,ParseException {
//		String a= System.getProperty("user.dir"); 
//		JSONParser jsonParser= new JSONParser();
//		FileReader reader= new FileReader	(System.getProperty("user.dir") + "/src/test/java/com.digistar.data/data_login.json");
//		
//		
//		Object obj=jsonParser.parse(reader);
//		
//		JSONObject userLoginsJsonobj=(JSONObject) obj ;
//		JSONArray userLoginsArray=(JSONArray) userLoginsJsonobj.get("userLogins");
//		
//		String arr[]= new String[userLoginsArray.size()];
//		for (int i=0; i<userLoginsArray.size();i++);
//		{
//			int i = 0;
//			JSONObject users = (JSONObject) userLoginsArray.get(i);
//			String user=(String) users.get("email");
//			String pwd = (String) users.get("password");
//			
//			
//			arr[i]=user+","+pwd;
//		}
//		
//				return arr;
//		
//	}
	
	
