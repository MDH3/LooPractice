package mouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {

	public static void main(String[] args) {

WebDriverManager.chromiumdriver().setup();	
		
		WebDriver driver=new ChromeDriver();
	driver.get(("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3"));
	
	driver.switchTo().frame("iframeResult");
	
	WebElement fl1=driver.findElement(By.xpath("//input[@id='field1']"));
	
	fl1.clear();
	fl1.sendKeys("welcome");
	
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	Actions act= new Actions(driver);
	
	act.doubleClick(button).perform();
	}

}
