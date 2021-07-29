package Pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class PomClass extends BaseClass {
	

	@FindBy(id="firstName")
	WebElement Firstname;
	@FindBy(id="lastName")
	WebElement Lastname;
	@FindBy(id="phoneNumber")
	WebElement Phonenumber;
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="TAndC")
	WebElement Term;
	@FindBy(xpath="//*[@id=\"create-account-form\"]/div/div[10]/button")
	WebElement CreateAccount;
	@FindBy(css="div.css-1n0zz00:nth-child(4) > span:nth-child(2)")
	WebElement ErrorMessage; 
	
	public PomClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void Firstname(String fname) {
		Firstname.sendKeys(fname);
		int a=fname.length();
		if(a<2) {
			System.out.println("Firstname should be more than 2 characters");
		}
		else {
			System.out.println("Test is passed");
		}
		
	}
	public void Lastname(String lname) {
		Lastname.sendKeys(lname);
	}
	public void Phonenumber(String phone) {
		Phonenumber.sendKeys(phone);
	}
	public void Email(String email) {
		Email.sendKeys(email);
	}
	public void Password(String pass) {
		Password.sendKeys(pass);
	}
	public void Term() {
		Term.click();
	}
	public void CreateAccount() {
		CreateAccount.click();
	}
	public String ErrorMessage() {
	String b=ErrorMessage.getText();
	return b;
	}
}
