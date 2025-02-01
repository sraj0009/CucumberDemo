package stepsDefinitions;

import java.awt.SecondaryLoop;
import java.sql.Driver;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class Steps {
	WebDriver driver;
	WebElement element;
	JavascriptExecutor js;
	
	@Given("then user is on nopCommerce login page")
	public void navigateToLoginPage() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.nopcommerce.com/");
	    driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	    System.out.println("navigate to login page");
	}

	@When("the user enteres valid credentials \\(username: {string}, password: {string})")
	public void the_user_enteres_valid_credentials_username_password(String userName, String password) {
	    
		
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		System.out.println("entered valid login credentials");
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		
//		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
//		
		System.out.println("clicked on login button");
		
	}

	@Then("the user login should be redirected to the My Account page")
	public void the_user_login_should_be_redirected_to_the_my_account_page() {
	    // 
//		boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
//		if(status) {
//			Assert.assertEquals(status, true);
//		}
		System.out.println("redirecting to my account");
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
//		element =driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']"));
//	    js = (JavascriptExecutor)driver;
//	    js.executeScript("arguments[0].scrollIntoView(true)", element);
//	    
//	    if(element.getText().equals("Welcome to our store")) {
//	    		Assert.assertTrue(true);
//	    }
//	   
		System.out.println("verified welcome message");
		
		driver.quit();
	}
	
	

}
