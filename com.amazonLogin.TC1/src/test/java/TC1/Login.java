package TC1;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login {

	static WebDriver driver;
	@Test
	public void open() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nabajit\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Passed");

	}
	
	@AfterTest
	void tearDown(){
		driver.quit();
	}

}
