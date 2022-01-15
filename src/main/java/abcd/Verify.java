package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {
	WebDriver driver;

	 @Test
	  public void f2() throws InterruptedException {
		  WebDriverManager.chromiumdriver().setup();
		  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/reg/?rs=3");
		 
		 List<WebElement> objlink= driver.findElements(By.tagName("a.."));
		 for(WebElement ele: objlink){
			 String lnk=ele.getText();
			 System.out.println(lnk);
		 }
		 
		 
		 
		 dropdrownList();
	  }
		@SuppressWarnings("unchecked")
		public void dropdrownList() throws InterruptedException {
			WebElement 	Fist_name=driver.findElement(By.name("firstname"));	
			//driver.
	if (Fist_name.isDisplayed()){
		System.out.println("First name is display");
	}
	else{
		System.out.println("First name is not display");
	}
	
	if (Fist_name.isEnabled()){
		System.out.println("First name is  Enable");
	}
	else{
		System.out.print("First name is disable ");
	}
	
	if(Fist_name.isEnabled()){
		
		Fist_name.sendKeys("Farah");
		
		System.out.println("First name is entered");
	}
	else{
		System.out.println("First name is not enterd");
	}
	
	String fnedit=Fist_name.getAttribute("value");
	System.out.println("The value is present in the edit box  " + fnedit);
Thread.sleep(3000);
	Fist_name.clear();
	
	String fnedit1=Fist_name.getAttribute("value");
	System.out.println("The Value  present in the First name field is     " + fnedit1);
	
	
	driver.quit();
	
	
}
		
}