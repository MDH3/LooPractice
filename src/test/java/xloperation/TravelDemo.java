package xloperation;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TravelDemo {
	WebDriver driver;
    Logger logger;
@Test
public void SelectCountry(){
	logger= LogManager.getLogger("SelectCountry");
	logger=LogManager.getLogger("SelectCountry");
	WebDriverManager.chromiumdriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://blazedemo.com/");
       WebElement ele=driver.findElement(By.xpath("//select[@name='fromPort']"));
       Select se =new Select(ele);

   //for( WebElement country:se){
	//se.selectByValue("Boston");
	//WebElement op =se.getFirstSelectedOption();
	//System.out.println(op.getText());
	//List<WebElement> option=se.getOptions();
       List ActualDropvalue= new ArrayList();
       
	for(WebElement elemnt:se.getOptions()){
	//System.out.println(elemnt.getText());
		ActualDropvalue.add( elemnt.getText());
		List exptedvalue=new ArrayList();
		exptedvalue.add("Paris");
		exptedvalue.add("Philadelphia");
		exptedvalue.add("Boston");
		exptedvalue.add("Portland");
		exptedvalue.add("San Diego");
		exptedvalue.add("Mexico City");
for(int i=0;i<ActualDropvalue.size();i++){
	 ActualDropvalue.get(i);
	if(ActualDropvalue.equals(exptedvalue)){
	//System.out.println("Test is passed");
	logger.info("pass");

	}
	

	else{
		//System.out.println("Test is fail");}
	logger.info("fail");

	}
	}
}
		
		
		
}}
	

		



	

	
	
	
	
	
	
	

