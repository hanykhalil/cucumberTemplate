package com.templates.cucumberTemplate;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
//	public static final String USERNAME = "khalilhany_KLrQIy";
//    public static final String AUTOMATE_KEY = "ckCHbxQXw1dXpFeLpzBC";
//    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public void LunchTheBrowser() throws MalformedURLException  {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName("chrome");
//		capabilities.setPlatform(Platform.WIN10);
//		MutableCapabilities capabilities = new MutableCapabilities();
//		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//		browserstackOptions.put("osVersion", "16");
//		browserstackOptions.put("deviceName", "iPhone 14");
//		browserstackOptions.put("projectName", "CucumberTemplate");
//		browserstackOptions.put("buildName", "Build");
//		browserstackOptions.put("sessionName", "testCaseBuild");
//		browserstackOptions.put("local", "false");
//		capabilities.setCapability("bstack:options", browserstackOptions);

    	WebDriverManager.chromedriver().setup();
//		driver= new RemoteWebDriver(new URL("http://192.168.1.104:5555"), capabilities);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.deutsche-bank.de/");
		driver.manage().window().maximize();
		
	}
}
