package stepsDefintion;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.templates.cucumberTemplate.BaseTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LogingSteps extends BaseTest {
	
	@Given("The user open the application and go to login page")
	public void the_user_open_the_application_and_go_to_login_page() throws MalformedURLException {
		LunchTheBrowser();
	}

//	@When("The user enter valid username as {string} and password {string} pass2 {string} pass3 {string} and click login")
//	public void the_user_enter_valid_username_as_and_password_pass2_pass3_and_click_login(String string, String string2, String string3, String string4) {
//		WebElement rootHost=driver.findElement(By.id("usercentrics-root"));
//		SearchContext shadow=getShadowDom(rootHost, driver);
//		shadow.findElement(By.cssSelector("div[data-testid=\"uc-buttons-container\"]:nth-last-child(1):last-of-type > button:last-child")).click();
//		driver.findElement(By.cssSelector(".btn-value[data-caption-mobile='Online-Banking']")).click();
//		Set<String> windows= driver.getWindowHandles();
//		Iterator<String> it= windows.iterator();
//		String parentId=it.next();
//		String childId=it.next();
//		driver.switchTo().window(childId);
//		
//		driver.findElement(By.cssSelector("#branch")).sendKeys(string);
//		driver.findElement(By.cssSelector("#account")).sendKeys(string2);
//		driver.findElement(By.cssSelector("#subAccount")).clear();
//		driver.findElement(By.cssSelector("#subAccount")).sendKeys(string3);
//    	driver.findElement(By.cssSelector("#pin")).sendKeys(string4);
//    	driver.findElement(By.cssSelector("#action")).click();
//	}
	
	@When("The user enter valid username  and password pass2 pass3 and click login")
	public void the_user_enter_valid_username_and_password_pass2_pass3_and_click_login(DataTable data) {
		WebElement rootHost=driver.findElement(By.id("usercentrics-root"));
		SearchContext shadow=getShadowDom(rootHost, driver);
		shadow.findElement(By.cssSelector("div[data-testid=\"uc-buttons-container\"]:nth-last-child(1):last-of-type > button:last-child")).click();
		driver.findElement(By.cssSelector(".btn-value[data-caption-mobile='Online-Banking']")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		driver.findElement(By.cssSelector("#branch")).sendKeys(data.cell(0, 0));
		driver.findElement(By.cssSelector("#account")).sendKeys(data.cell(0, 1));
		driver.findElement(By.cssSelector("#subAccount")).clear();
		driver.findElement(By.cssSelector("#subAccount")).sendKeys(data.cell(0, 2));
    	driver.findElement(By.cssSelector("#pin")).sendKeys(data.cell(0, 3));
    	driver.findElement(By.cssSelector("#action")).click();
	}
	
	@When("The user enter valid {string}  and {string} {string} {string} and click login")
	public void the_user_enter_valid_and_and_click_login(String string, String string2, String string3, String string4) {
		WebElement rootHost=driver.findElement(By.id("usercentrics-root"));
		SearchContext shadow=getShadowDom(rootHost, driver);
		shadow.findElement(By.cssSelector("div[data-testid=\"uc-buttons-container\"]:nth-last-child(1):last-of-type > button:last-child")).click();
		driver.findElement(By.cssSelector(".btn-value[data-caption-mobile='Online-Banking']")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		driver.findElement(By.cssSelector("#branch")).sendKeys(string);
		driver.findElement(By.cssSelector("#account")).sendKeys(string2);
		driver.findElement(By.cssSelector("#subAccount")).clear();
		driver.findElement(By.cssSelector("#subAccount")).sendKeys(string3);
    	driver.findElement(By.cssSelector("#pin")).sendKeys(string4);
    	driver.findElement(By.cssSelector("#action")).click();
	}

	@Then("The user should navigae to the homepage")
	public void The_user_should_navigae_to_the_homepage() {
		System.out.println(driver.findElement(By.linkText("Kunden-Logout")).isDisplayed()); 
	}
	
	@Then("error message should be appear")
	public void error_message_should_be_appear() {
		WebElement errorEle= driver.findElement(By.xpath("//h1[text()='Anmeldung fehlgeschlagen']"));
		errorEle.getText();
		Assert.assertEquals(errorEle.getText(), "Anmeldung fehlgeschlagen");
	    System.out.println(errorEle.getText());
	}

	static SearchContext getShadowDom(SearchContext element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		SearchContext shadow1= (SearchContext) js.executeScript("return arguments[0].shadowRoot", element);
		return shadow1;
	}
}
