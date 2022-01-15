/**
 * 
 */
package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Md Mosharrof hossain
 *
 */
public class WebdriverList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  WebDriverManager.chromiumdriver().setup();
WebDriver driver=new ChromeDriver();

driver.get("https://itera-qa.azurewebsites.net/home/automation");
List<WebElement> ele=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
for(WebElement chk:ele){
	String Ar=chk.getAttribute("id");
	
if(Ar.equals("Monday") || Ar.equals("Sunday")){
	chk.click();
	
}
}

	

	}

}
