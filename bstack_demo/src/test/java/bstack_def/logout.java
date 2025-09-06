package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout {
	WebDriver driver;
	Pageclass pg;
	@Given("logout open in default browser")
	public void logout_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	 
	}

	@When("click on login and logout")
	public void click_on_login_and_logout() throws InterruptedException {
		pg.login();
		pg.logout();
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
//		driver.findElement(By.id("signin")).click();
	}

	@Then("logout successfully")
	public void logout_successfully() {
		System.out.println("logout successfully");
		driver.close();
	    
	}


}
