package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop1=new Properties();
	
public BaseClass(){
	try {
		FileInputStream file1=new FileInputStream("C:\\Users\\manoj\\Desktop\\t\\src\\main\\java\\Config_properties\\Config.properties");
	prop1.load(file1);
		}
		catch(FileNotFoundException a) {
			a.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
}
 public static void start() {
	 driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop1.getProperty("url"));

 }
 public static void Down() {
	 for(int i=0;i<15;i++) {
	 Actions obj= new Actions(driver);
	 obj.sendKeys(Keys.ARROW_DOWN).perform();
 }
 }
	 public static void Scroll() {
		Actions obj1= new Actions(driver);
		obj1.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	 }
 }
 

