package com.BaseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	String browser = "chrome";

	public WebDriver openApp() {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/");
			return driver;

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			// WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://demoqa.com/");
			return driver;

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://demoqa.com/");
			return driver;

		} else {

			System.out.println(browser + " : This is not valid browser");
		}
		return driver;
	}

	public WebDriver openChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

	public WebDriver openEdge() {

		WebDriverManager.edgedriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

	public WebDriver openFirefox() throws InterruptedException {

		Thread.sleep(3000);

		WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;

	}

}
