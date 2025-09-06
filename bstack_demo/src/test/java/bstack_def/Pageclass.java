package bstack_def;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageclass {	
	WebDriver driver;
	
	public Pageclass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login() throws InterruptedException {
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("username")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		driver.findElement(By.id("password")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
	}
	
	public void cart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@class=\"shelf-item__buy-btn\"][1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@class=\"shelf-item__del\"]")).click();
    	Thread.sleep(2000);
	}
	
	public void shippingaddress() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"shelf-item__buy-btn\"][1]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("div[class=\"buy-btn\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("firstNameInput")).sendKeys("Anu");
	    driver.findElement(By.id("lastNameInput")).sendKeys("raavi");
	    driver.findElement(By.id("addressLine1Input")).sendKeys("sai nagar");
	    driver.findElement(By.id("provinceInput")).sendKeys("AP");
	    driver.findElement(By.id("postCodeInput")).sendKeys("523001");
	    driver.findElement(By.id("checkout-shipping-continue")).click();
	    Thread.sleep(2000);
	}
	public void search(String item) throws InterruptedException {
		WebElement s=driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
	    s.clear();
	    s.sendKeys(item);
	    s.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);  
	}
	
	public void vendors() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[1]/div[1]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[3]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[4]/label/span")).click();  
	}
	public void offers() throws InterruptedException {
		driver.findElement(By.id("offers")).click();
		Thread.sleep(2000);
	}
	public void favourites() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='MuiIconButton-label'][1]")).click();
	    driver.findElement(By.id("favourites")).click();
	    Thread.sleep(2000);
	}
	public void orders() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"checkout-app\"]/div/div/div/div/a/button")).click();
	    driver.findElement(By.id("orders")).click();
	    Thread.sleep(2000);
	}
	public void subscribe() throws InterruptedException {
		driver.findElement(By.id("newsletter-email")).sendKeys("raviyasaswini03@gmail.com");
		Thread.sleep(2000);
	    driver.findElement(By.id("newsletter-email")).sendKeys(Keys.ENTER);
	}
	public void logout() {
		driver.findElement(By.id("signin")).click();
	}

}
