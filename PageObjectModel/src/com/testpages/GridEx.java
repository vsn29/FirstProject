package com.testpages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.yahoomail.RegistrationPage;

public class GridEx {

	public static void main(String args[]) throws InterruptedException, MalformedURLException {
		System.out.println("Welcome to Software Testing. ");

		DesiredCapabilities dc = new DesiredCapabilities().chrome();

		ChromeOptions options = new ChromeOptions();

		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

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
