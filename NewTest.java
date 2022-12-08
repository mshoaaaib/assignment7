package assign7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver = new ChromeDriver();
	elementsfunctions tasks = new elementsfunctions(driver);
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
	  tasks.functions(); 
	  
	  
  }
  
} 
