package webTable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		 WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  
   driver.get("https://jqueryui.com/datepicker/");
   driver.switchTo().frame(0);
  // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/05/2021");;
 // driver.findElement(By.xpath())
   String yeay="2022";
   String month="May ";
   String day="20";
   
   driver.findElement(By.xpath("//input[@id='datepicker']")).click();;
  while(true){
	  
	String mon=  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  
	String yr=  driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
	if(mon.equals(month) && yr.equals(yeay)){
		break;
	}
	else{
		driver.findElement(By.xpath("//a[@title='Next']")).click();
	
	}
		
  }
   List<WebElement>lis=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
   
   for(WebElement wb:lis){
	String st=wb.getText();
	  
	 if(st.equals(day)){
		 wb.click();
		 break;
	 }
	 //driver.quit();
   }
   
	}

	

}
