package ProjectTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pom_package.PomShoppingcart;

public class ShoppingCart extends BaseClass {

	public static PomShoppingcart pom2;

	public ShoppingCart() {
		super();
	}

	@BeforeMethod
	public static void Starting() {
		start();
		pom2 = new PomShoppingcart();
	}

	@Test
	public void Carttest1() throws InterruptedException {
		pom2.Searchbar("Tshirt");
		pom2.Searchbox();
		pom2.Searchbutton();
		pom2.tshirt();
		Down();
		pom2.add();
		pom2.Checkout();
		pom2.increase();
		Thread.sleep(2000);
		pom2.decrease();
		Thread.sleep(2000);
		pom2.remove();
	}
}
