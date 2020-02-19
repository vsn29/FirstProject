package com.yahoomail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@name='yid']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonenumber;

	@FindBy(xpath = "//input[@id='login-signin']")
	WebElement Next;

	@FindBy(xpath = "//a[@id='createacc']")
	WebElement Createaccount;

	public RegistrationPage(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	public void clickCreateaccount() {
		Createaccount.click();
	}

	public void setFirstName(String strFirstName) {

		firstname.sendKeys(strFirstName);
	}

	public void setLastName(String strLasttName) {

		lastname.sendKeys(strLasttName);
	}

	public void setEmail(String strEmail) {

		email.sendKeys(strEmail);
	}
	public void setPassword(String strPassword) {

		email.sendKeys(strPassword);
	}

	/*public void setphone(String strphone) {

		phone.sendKeys(strphone);
	}*/

}