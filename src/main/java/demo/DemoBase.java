package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoBase {
	WebDriver driver;
	public Properties prop;

	public WebDriver setup() throws IOException {
		 prop = new Properties();
		 String propath = System.getProperty("user.dir") + "\\src\\main\\java\\demo\\Test.properties";
		FileInputStream fis = new FileInputStream(propath);
		prop.load(fis);



	String Browsername = prop.getProperty("browser");
	{
	if(Browsername.equalsIgnoreCase("chrome")) {
driver=new ChromeDriver();
	}
	else if(Browsername.equalsIgnoreCase("InternetExporer")) {
		driver=new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;

}	}
	public void Screenshots(String testname,WebDriver driver) throws IOException {
		File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationfilepath=System.getProperty("user.dir")+"\\Screenshots\\"+testname+".png";
		FileUtils.copyFile(sourcefile,new File(destinationfilepath));
	}

	
	
		
		
	
	
	}
