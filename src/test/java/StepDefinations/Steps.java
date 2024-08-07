package StepDefinations;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Steps {
	WebDriver driver;        
   
    
    @After
    public void tearDown() {
    	driver.close();
    
    }
   
    @Given("On ESPN Home page")
    public void on_espn_home_page() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.espncricinfo.com/");
        driver.manage().window().maximize();
    }

    @When("ESPN Home Page launch")
    public void espn_home_page_launch() {
       WebElement HomePage =driver.findElement(By.xpath("//img[@alt='ESPNcricinfo']"));
       assertNotNull(HomePage);
    }

    @Then("Home page should loaded correctly")
    public void home_page_should_loaded_correctly() {
       WebElement menu = driver.findElement(By.xpath("//div[@class='ds-flex ds-flex-row']"));
       
       assertNotNull(menu);// Verify Menu list display
    }
	
	
	

}

