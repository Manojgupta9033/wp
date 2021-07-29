package Pom_package;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class PomShoppingcart extends BaseClass {

	@FindBy(css=".e1xoeh2i1")
	WebElement SearchBar;
	@FindBy(xpath="//ul[@class='css-rfy0o6 e125rdbf0']//li//span")
	List<WebElement> Suggestionbox;
	@FindBy(css=".css-f72ea9")
	WebElement SearchButton;
	@FindBy(css="#product-results > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > img:nth-child(2)")
	WebElement Tshirt;
	@FindBy(css=".css-vfxkzw")
	WebElement Add;
	@FindBy(css="button.css-vfxkzw:nth-child(4)")
	WebElement Checkout;
	@FindBy(xpath="//button[@class='e5qqw234 css-1gezpl6 edzik9p0']")
	WebElement Increase;
	@FindBy(xpath="//button[@data-automation='decrease-qty']")
	WebElement Decrease;
	@FindBy(xpath="//span[contains(text(),'Remove')]")
	WebElement Remove;

	public PomShoppingcart() {
		PageFactory.initElements(driver, this);
	}
	
	public void Searchbar(String search) {
		SearchBar.sendKeys(search);
	}
	public void Searchbox() {
		
		for (WebElement element : Suggestionbox ) {
			if (element.getText().equalsIgnoreCase("tshirts for men in Clothing, Shoes & Accessories")) {
				element.click();
				break;
			}
		}
	}
	public void Searchbutton() {
		SearchButton.click();
	}
	public void tshirt() {
		Tshirt.click();
	}
	public void add() throws InterruptedException {
		Add.click();
		Thread.sleep(2000);
	}
	public void Checkout(){
		Checkout.click();
		
	}
	public void increase() {
		Increase.click();
	}
	public void decrease() {
		Decrease.click();
	}
	public void remove() {
		Remove.click();
	}
	
}
