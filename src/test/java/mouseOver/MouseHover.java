package mouseOver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {

		 WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		  
		WebElement desk  =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		  
		WebElement manu=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desk).moveToElement(manu).click().perform();
		
		
		
	}

}
