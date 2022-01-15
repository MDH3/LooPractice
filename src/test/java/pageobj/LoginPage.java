package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
//constructor--Automatically invoke at the time of object  creation of 
LoginPage (WebDriver driver){//constructor takes webdriver instant this driver intilize
	//golbal veribal driver
	this.driver=driver;
}
;
By img_logo_loc  =By.xpath("//div[@id='divLogo']//img");
By txt_username	=By.xpath("//input[@id='txtUsername']");
By txtpassword=By.xpath("//span[normalize-space()='Password']");
By btn_login=By.xpath("//input[@id='btnLogin']");
public boolean cheklogo(){
	boolean status = driver.findElement(img_logo_loc).isDisplayed();
	return status; 
}
public void setusername(String name){
	   driver.findElement(txt_username).sendKeys(name);;
}

public void setpassword(String pwd){
	driver.findElement(txtpassword).sendKeys(pwd);
}
public void click(){
	driver.findElement(btn_login).click();
}





}

	
	
	
	
	
	
	

