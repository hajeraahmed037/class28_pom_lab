package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.Page_Landing;

public class Landing_Page_Logo extends Base {
	
	Page_Landing page_Landing = new Page_Landing();
	
	@Given("I am in Landing page")
	public void i_am_in_Landing_page() {
	    getUrl("https://sit.skyschooling.com/microtech/");
	    
	 boolean b =   page_Landing.verify_welcome_Text();
	   assertEquals(true,b);
	}

	@And("Verify Landing Page Logo is visible")
	public String verify_Landing_Page_Logo_is_visible() {
	   String s = page_Landing.verify_landing_logo();
	   return s;
	}
}
