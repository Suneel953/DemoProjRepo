package demopageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {

	WebDriver driver;

	public Pageobject(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")

	WebElement usernametextfield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement pswdtextfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Loginbutton;
	

	public WebElement usernametextfield() {
		return usernametextfield;
	}

	public WebElement pswdtextfield() {
		return pswdtextfield;
	}

	public WebElement LoginButton() {
		return Loginbutton;
	}

}
