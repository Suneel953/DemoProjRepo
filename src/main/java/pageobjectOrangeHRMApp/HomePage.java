package pageobjectOrangeHRMApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	WebElement Admintab;
	@FindBy(xpath = "//div[@class='oxd-topbar-header-title']")
	WebElement Admintext;
	@FindBy(xpath = "//div[@class='oxd-topbar-body']/nav/ul/li[2]")
	WebElement Jobdrp;
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[3]")
	WebElement Employstatusdrp;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']/h6")
	WebElement Employstatustextfield;
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement Adduser;
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement namefield;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement employstatuscheckbox;
	@FindBy(xpath = "//button[text()=' Delete Selected ']")
	WebElement Deletetext;
	@FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
	WebElement Alert;
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	WebElement Notextfound;

	public WebElement Admintab() {
		return Admintab;
	}

	public WebElement Admintext() {
		return Admintext;
	}

	public WebElement Jobdrp() {
		return Jobdrp;
	}

	public WebElement Employstatusdrp() {
		return Employstatusdrp;
	}
	public WebElement Adduser() {
		return Adduser;
	}
	public WebElement namefield() {
		return namefield;
	}
	public WebElement savebutton(){
		return savebutton;
	}
	
	public WebElement Employstatustextfield() {
		return Employstatustextfield;
	}

	public WebElement employstatuscheckbox() {
		return employstatuscheckbox;
	}

	public WebElement Deletetext() {
		return Deletetext;
	}

	public WebElement Deletetextalert() {
		return Deletetext;
	}

	public WebElement Alert() {
		return Alert;
	}
	
	public void acceptalert() {
	Alert alertest=driver.switchTo().alert();
	alertest.accept();
	}
	public WebElement Notextfound() {
		return Notextfound;
	}

}
