package keybordAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeybordAction {

	public static void main(String[] args) {
WebDriverManager.chromiumdriver().setup();	
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://text-compare.com/");
//	WebElement fl1=	driver.findElement(By.xpath(" //textarea[@id='inputText1']"));
//		driver.findElement(By.xpath("//textarea[@id='inputText2']"));
//	fl1.sendKeys("selenium");
//		Actions act=new Actions(driver);
//act.keyDown(Keys.CONTROL)	;	
//		act.sendKeys("a");
//		act.keyUp(Keys.CONTROL);
//		act.perform();
//		
//		act.keyDown(Keys.CONTROL);
//	    act.sendKeys("c");
//	    act.keyUp(Keys.CONTROL);
//		act.perform();
//		
//		
//		
//		
//		
//		act.sendKeys(Keys.TAB);
//		act.perform();
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("v");
//		
//		act.perform();
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
	
		
		
		
		
		
		
		
		
	}

}
