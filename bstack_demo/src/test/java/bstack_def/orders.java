package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orders {
	WebDriver driver;
	Pageclass pg;
	@Given("orders page should be open in default browser")
	public void orders_page_should_be_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");
	}

	@When("product add to cart and see orders")
	public void product_add_to_cart_and_see_orders() throws InterruptedException {
		pg.login();
		pg.shippingaddress();
		pg.orders();
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
//		driver.findElement(By.xpath("//div[@class=\"shelf-item__buy-btn\"][1]")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("firstNameInput")).sendKeys("Anu");
//	    driver.findElement(By.id("lastNameInput")).sendKeys("raavi");
//	    driver.findElement(By.id("addressLine1Input")).sendKeys("sai nagar");
//	    driver.findElement(By.id("provinceInput")).sendKeys("AP");
//	    driver.findElement(By.id("postCodeInput")).sendKeys("523001");
//	    driver.findElement(By.id("checkout-shipping-continue")).click();
//	    
//    	driver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button")).click();
//	    driver.findElement(By.id("orders")).click();
	}

	@Then("order placed successfully")
	public void order_placed_successfully() {
		System.out.println("order placed succesfully");
		driver.close();	    
	}
}
