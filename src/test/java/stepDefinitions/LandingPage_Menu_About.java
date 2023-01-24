package stepDefinitions;

import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import pages.Page_Landing;

public class LandingPage_Menu_About extends Base {

	Page_Landing page_Landing = new Page_Landing();
	
	@Given("Verify Landing Page Menu about us is present")
	public void verify_Landing_Page_Menu_about_us_is_present() {
	    boolean b = page_Landing.Verify_about_Menu_present();
	    assertEquals( true,b);
	}
}
