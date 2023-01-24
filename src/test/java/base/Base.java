package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	public static void getUrl( String url) {
		driver.get( url );
	}
	
	public static void click(By byObject) {
		driver.findElement( byObject ).click();
	}
	
	public static void sendKeys(By byObject, String value) {
		driver.findElement( byObject   ).sendKeys( value );
	}
	
	public static String getText(By byObject) {
		String text = driver.findElement( byObject ).getText();
		return text;
	}
	public static  boolean isDisplayed(By byObject) {
		boolean b = driver.findElement(byObject).isDisplayed();
		return b;
		
	}
	
}
