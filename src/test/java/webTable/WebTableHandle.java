package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	public static void main(String[] args) {
		 WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();

			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
			
			int row =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		int count=0;	
		for(int r=1;r<=row;r++)	{
			
		String value=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
		
		if(value.equals("Enabled")){
			
			count++;
		}


		}
		System.out.println(row);	
		System.out.println(" row   "+count);	
			
		System.out.println("col  "+(row-count));	
	
		driver.close();	
	}

}
