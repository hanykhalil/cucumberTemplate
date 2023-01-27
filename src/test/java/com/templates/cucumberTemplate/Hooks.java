package com.templates.cucumberTemplate;

import org.openqa.selenium.WebDriver;

import com.templates.cucumberTemplate.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
	
	@Before("@regression")
	public void runBeforeAnyScenario() 
	{
		
	}
	
	@After("@regression")
	public void runAfterAnyScenario()
	{
		driver.quit();
	}
}
