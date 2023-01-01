package stepsDefintion;

import org.openqa.selenium.WebDriver;

import com.templates.cucumberTemplate.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest{
	
	@Before
	public void runBeforeAnyScenario() 
	{
		
	}
	
	@After
	public void runAfterAnyScenario()
	{
		driver.quit();
	}
}
