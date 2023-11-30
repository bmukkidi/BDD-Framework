package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.feature", glue= {"StepDefinitions"}, 
monochrome = true,
plugin = {"pretty", "json:target/JSONReports/report.json"}

		
		)
public class TestRunner {

}
