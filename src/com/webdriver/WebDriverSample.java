package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverSample {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.firefox.marionette", "C:\\Software\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", "C://Software//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=0d27WLdIzoHQBNCAgZgO");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

	driver.quit();
	System.out.println("Process Completed");

	}

}
