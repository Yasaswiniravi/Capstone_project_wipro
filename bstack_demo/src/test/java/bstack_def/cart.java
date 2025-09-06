package bstack_def;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart {
	WebDriver driver;
	Pageclass pg;
	@Given("cart page will be open in default browser")
	public void cart_page_will_be_open_in_default_browser() {
		driver=new ChromeDriver();
		pg=new Pageclass(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://bstackdemo.com/");
	    
	}

	@When("select product addto cart and delete from cart")
	public void select_product_addto_cart_and_delete_from_cart() throws InterruptedException {
		pg.login();
		pg.cart();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("window.scrollBy(0,200)");
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//div[@class=\"shelf-item__buy-btn\"][1]")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//div[@class=\"shelf-item__del\"]")).click();
//    	Thread.sleep(2000);
	   
	}

	@Then("cart page working successfull")
	public void cart_page_working_successfull() {
		System.out.println("product added to cart");
		System.out.println("product deleted from cart");
		driver.close();
	    
	}


}
