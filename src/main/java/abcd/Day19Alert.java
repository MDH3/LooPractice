package abcd;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day19Alert {

	public static void main(String[] args) {

	WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();
driver.get("https://mypage.rediff.com/login/dologin");
driver.findElement(By.xpath("//input[@id='txtlogin']"));
	driver.switchTo().alert().accept();
	
	
	
	
	

//Alert myalar=	driver.switchTo().alert();
	//myalart.sendKeys("Raul");
     //myalart.dismiss();
	//System.out.println(myalart.getText());	
	}

}
