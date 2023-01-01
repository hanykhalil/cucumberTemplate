package com.templates.cucumberTemplate;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public void LunchTheBrowser() {
		driver= new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.deutsche-bank.de/");
		driver.manage().window().maximize();
		
	}
}
