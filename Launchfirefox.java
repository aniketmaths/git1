package launchfirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.firefox.driver","C:\\Users\\Aniket\\OneDrive\\Desktop\\new selenium\\geckodriver.geckodriver");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
}
}
