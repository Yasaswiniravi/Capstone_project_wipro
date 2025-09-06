package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	Pageclass pg;
	
	@Given("search page will be open in default browser")
	public void search_page_will_be_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	    
	}

	@When("^enter multiple search (.*)$")
	public void enter_multiple_search_item(String item) throws InterruptedException {
		pg.search(item);
		
//	    WebElement s=driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
//	    s.clear();
//	    s.sendKeys(item);
//	    s.sendKeys(Keys.ENTER);
//	    Thread.sleep(2000);  
	}

	@Then("product is searching succesfully")
	public void product_is_searching_succesfully() {
		System.out.println("product searched successfully");
		driver.close();
	    
	}


}
