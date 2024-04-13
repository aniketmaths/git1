package launchfirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Aniket\\OneDrive\\Desktop\\new selenium\\geckodriver.geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.className("s-color-swatch-inner-circle-border")).click();
		driver.findElement(By.id("exportsUndeliverable-cart-announce")).click();

	}

}
