package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class subscribeemail {
	WebDriver driver;
	Pageclass pg;
	@Given("subscribe email in default browser")
	public void subscribe_email_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	
	    
	}

	@When("enter email address")
	public void enter_email_address() throws InterruptedException {
		pg.subscribe();
//		driver.findElement(By.id("newsletter-email")).sendKeys("raviyasaswini03@gmail.com");
//		Thread.sleep(2000);
//	    driver.findElement(By.id("newsletter-email")).sendKeys(Keys.ENTER);
	}

	@Then("email subscribed succesfully")
	public void email_subscribed_succesfully() {
		System.out.println("subscribed");
		driver.close();
	    
	}


}
