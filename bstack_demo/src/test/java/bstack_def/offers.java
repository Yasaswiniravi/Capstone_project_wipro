package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class offers {
	WebDriver driver;
	Pageclass pg;
	@Given("offers page open in default browser")
	public void offers_page_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	
	    
	}

	@When("click on offers and check")
	public void click_on_offers_and_check() throws InterruptedException {
		pg.login();
		pg.offers();
//		driver.findElement(By.id("signin")).click();
//		driver.findElement(By.id("username")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='demouser']")).click();
//		driver.findElement(By.id("password")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
//		driver.findElement(By.id("login-btn")).click();
//		Thread.sleep(2000); 
//		
//		driver.findElement(By.id("offers")).click();
//		Thread.sleep(2000);
	    
	}

	@Then("offers will be displayed")
	public void offers_will_be_displayed() {
		System.out.println("offers displayed");
		driver.close();
	    
	}


}
