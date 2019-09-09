package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class dataDrivenLoginStepDef {

			public static WebDriver driver;
			
			
			@BeforeSuite
			@Given("^User is  on login Page of the Application$")
			public void userOn_loginPage()
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win\\chromedriver.exe");
				
			    driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("https://www.facebook.com/");
				}
			@Test 
			@When("^User enters \"(.*)\" in username field and \"(.*)\" in password field$")
			public void user_entersdata(String Username, String password) throws InterruptedException
			{
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys(Username);
				driver.findElement(By.id("pass")).clear();
				driver.findElement(By.id("pass")).sendKeys(password);
				Thread.sleep(3000);
			}
			@Test
			@Then("^User click on Login Button$") 
			public void clickButton()
			{
				driver.findElement(By.id("loginbutton")).click();
			}
			
			@AfterSuite
			@Then("^closing  of the browser$")
			public void closing_of_the_browser() throws Throwable
			{
				driver.quit();
				throw new PendingException();
			}
		}
