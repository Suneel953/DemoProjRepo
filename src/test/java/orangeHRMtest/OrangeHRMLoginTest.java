package orangeHRMtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjectOrangeHRMApp.HomePage;
import pageobjectOrangeHRMApp.LoginPage;
import resources.Base;

public class OrangeHRMLoginTest extends Base {
	public WebDriver driver;

	@BeforeMethod

	public void Initialpagesetup() throws IOException {
		driver = browsersetup();

		driver.get(prop.getProperty("url"));

	}

	@Test

	public void Login() throws IOException, InterruptedException {

		LoginPage loginpage = new LoginPage(driver);
		loginpage.usernametextfield().click();
		loginpage.usernametextfield().sendKeys(prop.getProperty("username"));
		loginpage.pswdtextfield().click();

		loginpage.pswdtextfield().sendKeys(prop.getProperty("pswd"));
		loginpage.Loginbutton().click();
		HomePage homepage = new HomePage(driver);
		homepage.Admintab().click();
		Assert.assertTrue(homepage.Admintext().isDisplayed());
		homepage.Jobdrp().click();

		homepage.Employstatusdrp().click();
		Thread.sleep(3000);
		Assert.assertTrue(homepage.Employstatustextfield().isDisplayed());
		Thread.sleep(3000);
		homepage.Adduser().click();
		Thread.sleep(3000);
		homepage.namefield().sendKeys(prop.getProperty("name"));
		homepage.savebutton().click();
		homepage.employstatuscheckbox().click();
		Assert.assertTrue(homepage.Deletetext().isDisplayed());
		homepage.Deletetext().click();
		homepage.Alert().click();
		homepage.acceptalert();
		Assert.assertTrue(homepage.Notextfound().isDisplayed());

	}

}
