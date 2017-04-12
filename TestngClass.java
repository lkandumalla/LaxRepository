package src.Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClass {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		System.out.println("Hello1.......");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		 driver.quit();
	  
  }
}
