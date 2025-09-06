package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class vendors {
	WebDriver driver;
	Pageclass pg;
	
	@Given("vendor page should be open in default browser")
	public void vendor_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	
	    
	}

	@When("select vendor and list products")
	public void select_vendor_and_list_products() {
		pg.vendors();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[2]/label/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[3]/label/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[4]/label/span")).click();    
	}

	@Then("selected products displayed successfully")
	public void selected_products_displayed_successfully() {
		System.out.println("product displayed successfully");
		driver.close();
	}


}
