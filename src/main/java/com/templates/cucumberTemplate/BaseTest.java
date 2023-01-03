package com.templates.cucumberTemplate;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public void LunchTheBrowser() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		WebDriverManager.chromedriver().setup();
		driver= new RemoteWebDriver(new URL("http://192.168.1.104:4444"), capabilities);
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.deutsche-bank.de/");
		driver.manage().window().maximize();
		
	}
}
