package api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_01_Check_Environment {
  WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  // mo trinh duyet
	  driver = new FirefoxDriver();
	  
	  // mo app
	  driver.get("https://www.google.com.vn/?hl=vi");
  }
  @Test
  public void TC_02_Login_With_Invalid_Email() {
	  
  }
  
  @Test
  public void TC_01_Login_With_Empty_Email() {
	  
  }
  
  @Test
  public void TC_03_Login_With_Incorect_Email() {
	  
  }

  @AfterClass
  public void afterClass() {
	  // dong trinh duyet
	  driver.quit();
  }

}
