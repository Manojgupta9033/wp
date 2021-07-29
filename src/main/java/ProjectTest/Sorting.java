package ProjectTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pom_package.Pom_Sorting;

public class Sorting extends BaseClass {
	Pom_Sorting pom2;

	public Sorting() {
		super();
	}

	@BeforeMethod
	public void starting() {
		start();
		pom2 = new Pom_Sorting();
	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void Test1() throws InterruptedException {
		pom2.Search("Tshirt");
		Thread.sleep(2000);
		pom2.Button();
		pom2.cookie();
		pom2.SortB();
		Thread.sleep(2000);
		pom2.Sorting();
		pom2.Totalproduct();
		pom2.Listproducts();

	}
}
