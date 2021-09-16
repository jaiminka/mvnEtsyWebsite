package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseTest() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/config.properties");
		prop = new Properties();
		prop.load(file);
	}
	
	public void openBrowser() {
		if(prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void openEtsy() {
		driver.get(prop.getProperty("url"));
	}

}
