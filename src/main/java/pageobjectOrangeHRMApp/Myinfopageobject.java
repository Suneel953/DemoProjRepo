package pageobjectOrangeHRMApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myinfopageobject {
	WebDriver driver;
	
	public  Myinfopageobject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
     @FindBy(xpath="//span[normalize-space()='My Info']")
    private WebElement myprofilebutton;
     @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
     private WebElement profiledrp;
     @FindBy(xpath="//a[text()='Logout']")
     private WebElement logoutoption;

public WebElement myprofilebutton() {
	return myprofilebutton;
}
public WebElement profiledrp() {
	return profiledrp;
}
public WebElement logoutoption() {
	return logoutoption;
}
}