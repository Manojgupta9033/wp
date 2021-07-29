package ProjectTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pom_package.PomClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTest1  extends BaseClass{
			
		
		public static PomClass pom1;
		
		public CreateTest1() {
			super();
		}
		
		@BeforeMethod
		public static void Starting() {
			start();
	        driver.findElement(By.cssSelector(".css-1xh2uh0 > span:nth-child(1) > span:nth-child(1)")).click();
	        driver.findElement(By.cssSelector("div.css-tbt5g:nth-child(8) > a:nth-child(1)")).click();
		
	        pom1=new PomClass();
		}
		
		
		@Test
		public static void Test5(){
			pom1.Firstname("M");
			pom1.Lastname("Gupta");
			pom1.Phonenumber("5196973656");
			pom1.Email("manoj@gmail.com");
			pom1.Password("Manoj@123");
			pom1.Term();
			pom1.CreateAccount();
			Assert.assertEquals(pom1.ErrorMessage(), "Please enter a valid first name.");
		}
	@AfterMethod
		public static void Close() throws InterruptedException {
		    Thread.sleep(5000);
			driver.quit();
		}

	}

