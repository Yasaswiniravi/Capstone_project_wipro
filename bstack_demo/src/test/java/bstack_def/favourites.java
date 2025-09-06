package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class favourites {
	WebDriver driver;
	Pageclass pg;
	@Given("favourites page should be open in default browser")
	public void favourites_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");
	}

	@When("click on product and add to favourites")
	public void click_on_product_and_add_to_favourites() throws InterruptedException {
		pg.login();
		pg.favourites();
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
//	    driver.findElement(By.xpath("//span[@class='MuiIconButton-label'][1]")).click();
//	    driver.findElement(By.id("favourites")).click();
//	    Thread.sleep(2000);
	}

	@Then("product succesfully added to favourites")
	public void product_succesfully_added_to_favourites() {
		System.out.println("successfully product added to favourites");
		driver.close();
	    
	}


}
