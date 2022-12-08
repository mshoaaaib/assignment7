package assign7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class elementsfunctions {
	WebDriver driver;
	
	
	@FindBy(xpath= "//button[@ng-click='manager()']")
	WebElement managerlogin;
	@FindBy(xpath="//button[@class='btn btn-lg tab'][1]")
	WebElement addcustomer;
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	@FindBy (xpath="//input[@placeholder='Post Code']")
	WebElement postalcode;
	@FindBy(xpath="//button[@type='submit']")
	WebElement addcustomerbtn;
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	WebElement openaccountbtn;
	@FindBy(xpath="//select[@name='userSelect']")
	WebElement usernamedropdown;
	@FindBy(id="currency")
	WebElement currencydropdown;
	@FindBy(xpath="//button[@type='submit']")
	WebElement addacctbtn;
	@FindBy(xpath="//button[@class='btn home']")
	WebElement homebtn;
	@FindBy(xpath="//button[@ng-click='customer()']")
	WebElement Customerloginbtn;
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement usersdropdown;
	@FindBy(xpath="//button[@type='submit']")
	WebElement accountholderopenbtn;
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	WebElement depositbtn;
	@FindBy(xpath="//input[@type='number']")
	WebElement amttodeposit;
	@FindBy(xpath="//button[@type='submit']")
	WebElement depositamt;
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	WebElement withdraw;
	@FindBy(xpath="//input[@ng-model='amount']")
	WebElement amttowithdraw;
	@FindBy(xpath="//button[@type='submit']")
	WebElement withdrawbtn;
	@FindBy(xpath="//button[@ng-Class='btnClass1']")
	WebElement trasactionbtn;
	@FindBy(xpath="//table[@class='table table-bordered table-striped']")
	WebElement table;
	@FindBy(xpath="//button[@ng-show='showDate']")
	WebElement resetbtn;
	@FindBy(xpath="//button[@ng-show='logout']")
	WebElement logoutbtn;
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	WebElement allcustomers;
	@FindBy(xpath="//input[@type='text']")
	WebElement searchcustomer;
	@FindBy(xpath="//button[@ng-click='deleteCust(cust)']")
	WebElement deletecust;
	
	//constructor
	public elementsfunctions(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	//function
	public void functions() throws InterruptedException
	{
		Thread.sleep(3000);
		managerlogin.click();
		Thread.sleep(2000);
		addcustomer.click();
		Thread.sleep(2000);
		String fname="M";
		firstname.sendKeys(fname);
		String lname="Shoaib";
		lastname.sendKeys(lname);
		postalcode.sendKeys("10001");
		addcustomerbtn.click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		openaccountbtn.click();
		Thread.sleep(2000);
		WebElement dropdown= usernamedropdown;
		Select names=new Select(dropdown);
		names.selectByVisibleText("M Shoaib");
		
		WebElement currencydd= currencydropdown;
		Select currency=new Select(currencydd);
		currency.selectByVisibleText("Rupee");
		
		addacctbtn.click();
		
		driver.switchTo().alert().accept();
		
		homebtn.click();
		Thread.sleep(2000);
		Customerloginbtn.click();
		
		Thread.sleep(2000);
		WebElement username= usersdropdown;
		Select namesel=new Select(username);
		namesel.selectByVisibleText("M Shoaib");
		Thread.sleep(2000);
		accountholderopenbtn.click();
		Thread.sleep(2000);
		depositbtn.click();
		Thread.sleep(1000);
		amttodeposit.sendKeys("10000");
		Thread.sleep(2000);
		depositamt.click();
		
		Thread.sleep(1000);
		withdraw.click();
		Thread.sleep(2000);
		amttowithdraw.sendKeys("2000");
		withdrawbtn.click();
		Thread.sleep(2000);
		trasactionbtn.click();
		
		Thread.sleep(2000);
		
		//list to get data of transaction
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']")); 
		for(WebElement row: allRows) {
			List<WebElement> cells=row.findElements(By.tagName("tr"));
			for(WebElement cell: cells) {
				System.out.println(cell.getText());
			}
		}
		Thread.sleep(1000);
		resetbtn.click();
		Thread.sleep(1000);
		logoutbtn.click();
		Thread.sleep(1000);
		homebtn.click();
		Thread.sleep(1000);
		managerlogin.click();
		Thread.sleep(1000);
		allcustomers.click();
		Thread.sleep(2000);
		searchcustomer.sendKeys(lname);
		Thread.sleep(1000);
		deletecust.click();
		
	}
	

	
	
}
