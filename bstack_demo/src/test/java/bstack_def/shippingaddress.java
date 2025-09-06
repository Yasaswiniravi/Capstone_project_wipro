package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shippingaddress {
	WebDriver driver;
	Pageclass pg;
	@Given("shipping address is open in default browser")
	public void shipping_address_is_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");	  
	}

	@When("open checkout and enter shipping address")
	public void open_checkout_and_enter_shipping_address() throws InterruptedException {
		pg.login();
		pg.shippingaddress();
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
//    	driver.findElement(By.xpath("//div[@class=\"shelf-item__buy-btn\"][1]")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("firstNameInput")).sendKeys("Anu");
//	    driver.findElement(By.id("lastNameInput")).sendKeys("raavi");
//	    driver.findElement(By.id("addressLine1Input")).sendKeys("sai nagar");
//	    driver.findElement(By.id("provinceInput")).sendKeys("AP");
//	    driver.findElement(By.id("postCodeInput")).sendKeys("523001");
//	    driver.findElement(By.id("checkout-shipping-continue")).click();
//	    Thread.sleep(2000);
	}

	@Then("successfully added address")
	public void successfully_added_address() {
		System.out.println("address submitted succesfully");
		driver.close();
	    
	}



}
