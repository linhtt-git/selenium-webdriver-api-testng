package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.io.File;

public class Topic_01_check_Selenium {
 // Khai báo biến đại diện cho Selenium WebDriver
	WebDriver driver;
	
	
	@BeforeClass
  public void beforeClass() {

        // Mo trinh duyet
		driver = new FirefoxDriver();
		
		// Mo app can test len
		driver.get("https://www.google.com/?gws_rd=ssl");
  }
 
 
  @Test
  public void TC_01_Check_Title() {
	  String homePageTitle = driver.getTitle();
	  
	  Assert.assertEquals(homePageTitle, "Google");
	 
  }

  
  @Test
  public void TC_02_Check_Url() {
	  String homePageUrl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(homePageUrl, "https://www.google.com/?gws_rd=ssl");
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
