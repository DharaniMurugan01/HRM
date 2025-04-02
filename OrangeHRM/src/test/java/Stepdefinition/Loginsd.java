package Stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsd {
	WebDriver driver;
	@Before
	public void setup() {
	driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void teardown() {
	   driver.quit();
	}
	@When("I enter {string} as username")
	public void i_enter_as_username(String string) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys(string);
	}

	@When("I enter {string} as password")
	public void i_enter_as_password(String string) {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		ele1.sendKeys(string);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		WebElement ele1=driver.findElement(By.xpath("//button[text()=' Login ']"));
		ele1.click();
	}

	@Then("I should {string}")
	public void i_should(String string) {
		String k=driver.findElement(By.xpath("//h6")).getText();
		Assert.assertEquals(k,string);
		System.out.println("Assertion completed");
	}
	@Then("check the {string}")
	public void check_the(String string) {
		 List<WebElement> elements= driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']/p"));
		    for (WebElement element:elements){
		    	if(element.getText().equals(string)) {
		           Assert.assertEquals(element.getText(),string);
		           break;
		  }
	   }
	}
}
