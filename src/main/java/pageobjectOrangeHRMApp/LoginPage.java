package pageobjectOrangeHRMApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);//using this statement initializing the object, driver-from WebDriver driver &this-Loginpage class

	}

	@FindBy(xpath = "//input[@name='username']")//objects

	WebElement usernametextfield;

	@FindBy(xpath = "//input[@name='password']")
	WebElement pswdtextfield;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Loginbutton;
	@FindBy(xpath="//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	private WebElement logintitle;

	public WebElement usernametextfield() {
		return usernametextfield;
	}

	public WebElement pswdtextfield() {
		return pswdtextfield;
	}

	public WebElement Loginbutton() {
		return Loginbutton;
	}
	public WebElement logintitle() {
		return logintitle;
	}
}
