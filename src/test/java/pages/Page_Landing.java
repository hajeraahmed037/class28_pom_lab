package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

public class Page_Landing extends Base{

	By welcomeText = By.xpath("//div/h1");
	By logo = By.xpath("//nav/h1");
	By about_Menu = By.xpath("//li[2]/a");
	public boolean verify_welcome_Text() {
		boolean b = isDisplayed(welcomeText);
		return b;
	}
	public String verify_landing_logo() {
		String s =getText(logo);
		assertEquals("MicroTech NA",s);
		return s;
	}
	public boolean Verify_about_Menu_present() {
		boolean b = isDisplayed(about_Menu);
		return b;
	}
}
