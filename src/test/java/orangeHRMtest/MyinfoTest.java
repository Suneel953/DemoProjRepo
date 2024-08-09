package orangeHRMtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectOrangeHRMApp.LoginPage;
import pageobjectOrangeHRMApp.Myinfopageobject;
import resources.Base;

public class MyinfoTest extends Base {
	public WebDriver driver;

	@BeforeTest

	public void setup() throws IOException {
		driver = browsersetup();
		driver.get(prop.getProperty("url"));

	}

	@Test

	public void testcase2() throws InterruptedException {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.usernametextfield().click();
		loginpage.usernametextfield().sendKeys(prop.getProperty("username"));
		loginpage.pswdtextfield().click();

		loginpage.pswdtextfield().sendKeys(prop.getProperty("pswd"));
		loginpage.Loginbutton().click();

		Myinfopageobject profile = new Myinfopageobject(driver);
		profile.myprofilebutton().click();
		profile.profiledrp().click();
		Thread.sleep(5000);
		profile.logoutoption().click();
		Assert.assertTrue(loginpage.logintitle().isDisplayed());
		Thread.sleep(2000);
		Assert.assertTrue(false);

	}

	}
