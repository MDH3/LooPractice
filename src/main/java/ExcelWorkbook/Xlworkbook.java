package ExcelWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xlworkbook {
	WebDriver driver;
	@Test
	public void wb() throws IOException, InterruptedException{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/newtours/");
		FileInputStream file=new FileInputStream("C:\\Users\\Md Mosharrof hossain\\Desktop\\Data.xlsx");
     XSSFWorkbook objwb=new XSSFWorkbook(file);
     XSSFSheet objws=objwb.getSheet("Sheet1");
    int rowcount= objws.getLastRowNum();
    for (int i=1;i<rowcount;i++){
    	XSSFRow currentrow=objws.getRow(i);
    	//String b=currentrow.getCell(i).toString();
    	//    System.out.println(b);
    	String firstname=currentrow.getCell(0).getStringCellValue();
    	String lastname=currentrow.getCell(1).getStringCellValue();
    	String phone=currentrow.getCell(2).getStringCellValue();
    	String email=currentrow.getCell(3).getStringCellValue();
    	String address=currentrow.getCell(4).getStringCellValue();
    	String city=currentrow.getCell(5).getStringCellValue();
    	String state=currentrow.getCell(6).getStringCellValue();
    	String postalcode=currentrow.getCell(7).getStringCellValue();
    	String country=currentrow.getCell(8).getStringCellValue();
    	String usrname=currentrow.getCell(9).getStringCellValue();
    	String password=currentrow.getCell(10).getStringCellValue();
        String conformpassword=currentrow.getCell(11).getStringCellValue();
        
        driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();;
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
        driver.findElement(By.xpath(" //input[@name='address1']")).sendKeys(address);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
    //driver.findElement(By.xpath("//select[@name='country']")).sendKeys(country);
        Select dropdown= new Select(driver.findElement(By.xpath("//select[@name='country']")));
        
        dropdown.selectByVisibleText("country");
        

        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(usrname);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(conformpassword);
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(conformpassword);
        Thread.sleep(300);
       //driver.findElement(By.xpath("input[@name='submit']")).submit();
        

    	}
    driver.findElement(By.xpath("input[@name='submit']")).click();
file.close();
    	
    }
				
			}
			//System.out.println();

			
		
	