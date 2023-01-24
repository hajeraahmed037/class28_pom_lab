package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	//here @ is Annotation and Before is Annotation Name
	@Before  
	public static void setup() {
		WebDriverManager.chromedriver().setup();  //setup chromeDriver using WebDrivermanager
		driver = new ChromeDriver();
		//database open
		//excel open
		//file open
	}
	
	@After
	public static void tearDown() {
		driver.quit();
		//db close
		//close excel
		//file close
	}
}


/*   
*/