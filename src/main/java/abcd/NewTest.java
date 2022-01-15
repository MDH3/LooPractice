package abcd;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromiumdriver().setup();
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/reg/?rs=3");
	 dropdrownList();
  }
	@SuppressWarnings("unchecked")
	public void dropdrownList() {
		WebElement 	eelement=driver.findElement(By.xpath("//select[@id='month']"));
		Select select=new Select(eelement);
		@SuppressWarnings("rawtypes")
		List Actualvalue=new   ArrayList();
		for (WebElement element : select.getOptions()) {
			Actualvalue.add(element.getText());
			
			@SuppressWarnings("rawtypes")
			List expectedvalue=new ArrayList();
			expectedvalue.add("Month");
			expectedvalue.add("Jan");

			expectedvalue.add("Feb");

			expectedvalue.add("Mar");

			expectedvalue.add("Apr");
			expectedvalue.add("May");
			expectedvalue.add("Jun");
			expectedvalue.add("Jul");
			expectedvalue.add("Aug");
			expectedvalue.add("Sep");
			expectedvalue.add("Oct");
			expectedvalue.add("Nov");
			expectedvalue.add("Dec");
              for (int i=0;i<Actualvalue.size();i++){
            	System.out.println("Actual value = " + Actualvalue.get(i)+ "   & expectedvalue  = " + expectedvalue.get(i));
            	 if (Actualvalue.equals(expectedvalue)){
            		 System.out.println("Month is desplayed it is passed");
            	 }
            	 else{
            		 System.out.println("Month is desplayed it is failed");
            	 }
            	  
              WebElement  actualval = driver.findElement(By.xpath("//*[@id= 'u_0_10']/span[1]"));
            	  actualval.click();
            	  
            	  if(actualval.isEnabled()){
            		  System.out.println("radio button is enable and it is passed");
            	  }
            	  else{
            		  System.out.println("radio button is enable and it is failed");
 
            	  }
            	  
            	  
            	  
            	  
            	  
            	  
            	  
              }
			
		}
		
		
		driver.close();
		
	}
	  
  
}
