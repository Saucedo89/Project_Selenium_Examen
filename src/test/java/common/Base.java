package common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected static WebDriver driver = null;
	
	@Before
	
	public void lanzarNavegador()  throws Exception{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
	}
	
	
	@After
	
	public void cerrarNavegador() {
		driver.quit();
	}
	

}
