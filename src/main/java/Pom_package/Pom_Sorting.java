package Pom_package;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class Pom_Sorting extends BaseClass {

	@FindBy(css = ".e1xoeh2i1")
	WebElement Searchbox;
	@FindBy(css = ".css-f72ea9")
	WebElement SearchButton;
	@FindBy(css = "button.css-17gzmsn:nth-child(2) > svg:nth-child(2)")
	WebElement SortButton;
	@FindBy(xpath = "//span[normalize-space()='Price: High to Low']")
	WebElement Sort;
	@FindBy(css = ".css-kzehw")
	WebElement Totalproducts;
	@FindBy(xpath = "//a[@class='css-1syn49 elkyjhv0']")
	WebElement NextButton;
	@FindBy(id = "accept-privacy-policies")
	WebElement Cookie;

	public Pom_Sorting() {
		super();
		PageFactory.initElements(driver, this);

	}

	public void Search(String search) {
		Searchbox.sendKeys(search);
	}

	public void Button() {
		SearchButton.click();
	}

	public void cookie() {
		Cookie.click();
	}

	public void SortB() {
		SortButton.click();
	}

	public void Sorting() {
		Sort.click();
	}

	public void Totalproduct() {
		String number = Totalproducts.getText().split(" ")[1];
		System.out.println("Total number of searches = " + number);
	}

	public void Listproducts() throws InterruptedException {
		Scroll();
		Thread.sleep(2000);
		Scroll();
		List<WebElement> products = driver.findElements(By.xpath(
				"//div[@class='css-1gwszhe e1pmil1x10']//a//descendant::div[@class='css-155zfob e175iya63']//p[@class='css-1p4va6y eudvd6x0']"));
		List<String> Page1 = new ArrayList();

		for (WebElement names : products) {
			Page1.add(names.getText());
			String abc = names.getText();
			System.out.println(abc);
		}
		Page1.size();
		System.out.println("Product in Page 1: " + Page1.size());

		NextButton.click();

		Thread.sleep(2000);
		Scroll();
		Thread.sleep(2000);
		Scroll();

		List<WebElement> products1 = driver.findElements(By.xpath(
				"//div[@class='css-1gwszhe e1pmil1x10']//a//descendant::div[@class='css-155zfob e175iya63']//p[@class='css-1p4va6y eudvd6x0']"));
		List<String> Page2 = new ArrayList();

		for (WebElement names1 : products1) {
			Page2.add(names1.getText());
			String cde = names1.getText();
			System.out.println(cde);
		}
		Page2.size();
		System.out.println("Product in Page 2: " + Page2.size());

		if (Page1.contains(Page2)) {
			System.out.println("Page1 and Page2 has same products");
		} else {
			System.out.println("Page1 and page2 has different products");
		}
	}

}
