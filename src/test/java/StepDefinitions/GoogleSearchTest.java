package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearchTest {
	
	WebDriver driver  = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		
		String projectyPath = System.getProperty("user.dir");
		System.out.println(projectyPath);
		System.setProperty("webdriver.chrome.driver",projectyPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		
	}

	@And("user enters the text in search box")
	public void user_enters_the_text_in_search_box() {
		System.out.println("user enters the text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("hits enter");
	}
		

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user is navigated to search results");
	}

}
