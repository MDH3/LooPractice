package abcd;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDrown {

	public static void main(String[] args ) throws InterruptedException {
		  WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10,unit));
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.opencart.com/index.php?route=account/register");
 WebElement dropCountry=driver.findElement(By.xpath("//select[@id='input-country']"));

Select sel=new Select( dropCountry);
//sel.selectByVisibleText("Bangladesh");
//sel.selectByValue("45");
//sel.selectByIndex(10);
List<WebElement>options=sel.getOptions();
//for(WebElement option:options){
	//.out.println(option.getText());
	for(int i=0;i<=options.size();i++){
		System.out.print(options.get(i).getText());
		
	}


//hread.sleep(5000);
driver.close();
		




	}	
	
}
