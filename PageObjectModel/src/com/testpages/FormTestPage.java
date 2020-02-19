package com.testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.yahoomail.RegistrationPage;

public class FormTestPage {

	public static void main(String args[]) throws InterruptedException {
		System.out.println("Welcome to Software Testing. ");
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\chromedriver_win321/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().fullscreen();

		RegistrationPage Regpage = new RegistrationPage(driver);

		Regpage.clickCreateaccount();

		Regpage.setFirstName("Vijaya");

		Regpage.setLastName("Vijaya");

		Regpage.setEmail("vijysn@gmail.com");

		Regpage.setPassword("abc123");

		/* Regpage.setPhone("9481033390"); */

	}
}
