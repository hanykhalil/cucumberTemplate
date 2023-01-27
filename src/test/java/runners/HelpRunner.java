package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\13465\\eclipse\\workspace\\cucumberTemplate\\src\\test\\java\\features"
, glue = "stepsDefintion", tags = "@regression", plugin = {"pretty", "html:target/reports/cucumberReport.html", "json:target/reports/cucumberReport.json"}, monochrome = true)
public class HelpRunner {

}
