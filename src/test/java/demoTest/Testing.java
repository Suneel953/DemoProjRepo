package demoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import demo.DemoBase;
import demopageobject.Pageobject;

public class Testing extends DemoBase {
	WebDriver driver;
	@BeforeTest
	public void setupbrowser() throws IOException {
		driver= setup();
		driver.get(prop.getProperty("url"));
		
		
	}
	@Test
	public void login() throws IOException, InterruptedException {
		
		
		 Pageobject Login=new Pageobject(driver);
		 Login.usernametextfield().sendKeys(prop.getProperty("user"));
		 Login.pswdtextfield().sendKeys(prop.getProperty("pswd"));
		 Login.LoginButton().click();
		 Thread.sleep(2000);
		 Assert.assertTrue(false);
		
		 
		
		
		
	}
	

}
