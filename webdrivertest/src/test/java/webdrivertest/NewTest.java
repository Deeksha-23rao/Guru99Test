package webdrivertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	WebDriver driver;
  @Test
  public void testeasy() {
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  String title=driver.getTitle();
	  System.out.println("title of page is"+title);
	  //Assert.assertTrue(title.contains("Demo Guru99 page"));
	    }
  @BeforeTest
  public void beforetest(){
	  System.setProperty("webdriver.chrome.driver", "D://Selenium/ChromeDriver/chromedriver.exe");
	  driver=new ChromeDriver();
  }
  @AfterTest
  public void aftertest(){
	  driver.quit();
  }
}
