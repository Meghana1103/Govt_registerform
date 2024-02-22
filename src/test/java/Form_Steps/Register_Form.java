package Form_Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_Form {
	WebDriver driver;
	@Given("User Opens the Chrome browser and navigate to India govt register form website")
	public void user_opens_the_chrome_browser_and_navigate_to_india_govt_register_form_website() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.india.gov.in/user/register");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("user enter {string}, {string}")
	public void user_enter(String Username, String EmailAddress) {
		driver.findElement(By.id("edit-name")).sendKeys(Username);
		driver.findElement(By.id("edit-mail")).sendKeys(EmailAddress);
	    	}

	@When("user enters {string},{string}")
	public void user_enters(String FirstName, String LastName) throws InterruptedException {
		driver.findElement(By.id("edit-profile-main-field-first-name-und-0-value")).sendKeys(FirstName);
		Thread.sleep(2000);
		driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys(LastName);
		Thread.sleep(2000);
		
	    
	}

	@When("user selects {string},{string},{string},{string}")
	public void user_selects(String country, String state, String Pincode, String Education) {
	WebElement  Countrydrop =driver.findElement(By.id("edit-profile-main-field-country-und"));
	Select dropdown1 = new Select(Countrydrop);
	dropdown1.selectByVisibleText(country);
		
   WebElement	Statedrop=driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
   Select dropdown2 = new Select(Statedrop);
      dropdown2.selectByVisibleText(state);
   
   
   driver.findElement(By.id("edit-profile-main-field-pin-code-und-0-value")).sendKeys(Pincode);
   
   WebElement	Educationdrop=driver.findElement(By.id("edit-profile-main-field-education-und"));
   Select dropdown3 = new Select(Educationdrop);
   dropdown3.selectByVisibleText(Education);
    }

	@When("user checks the Subcribe to newsletter")
	public void user_checks_the_subcribe_to_newsletter() throws InterruptedException {
		driver.findElement(By.id("edit-profile-main-field-subscribe-to-our-newslett-und-yes")).click();
		Thread.sleep(2000);
		
	    
	}

	@When("user enters {string}")
	public void user_enters(String Text) throws InterruptedException {
		driver.findElement(By.id("edit-captcha-response")).sendKeys(Text);
		Thread.sleep(2000);
	}

	@When("User click on Create Account")
	public void user_click_on_create_account() throws InterruptedException {
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);
		
	
	}

	@Then("user enter validate data sucessfully")
	public void user_enter_validate_data_sucessfully() throws InterruptedException {
		System.out.println("Clicked on Submit");
		Thread.sleep(3000);
		driver.close();

	    
	}

}
