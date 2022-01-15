package pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {
	WebDriver driver;
	LoginPage lp;
	@BeforeClass
public void setup(){
       WebDriverManager.chromiumdriver().setup();	
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	/*@Test(priority=1)
	public void testlogo(){
		lp=new LoginPage(driver);
		boolean a=lp.cheklogo();
		Assert.assertEquals(a, true);
	}*/
	@Test(priority=2)
		public  void hrm(){ 
			
		lp.setusername("Admin");
		lp.setpassword("Admin123");
		lp.click();
	}
	
	}
	

