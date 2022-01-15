package xloperation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {

		 WebDriverManager.chromiumdriver().setup();
		  WebDriver driver=new ChromeDriver();

		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String path="C:\\Users\\Md Mosharrof hossain\\Desktop\\caldata.xlsx";
	int rows=	XLbook.getRowCount(path," sheet1");
		for(int r=1;r<rows;r++){
	
			String pric=XLbook.getCellData(path, "sheet1", r, 0);
			String rateofinterest=XLbook.getCellData(path, "sheet1", r, 1);
			String per1=XLbook.getCellData(path, "sheet1", r, 2);
			String per2=XLbook.getCellData(path, "sheet1", r, 3);
			String fre=XLbook.getCellData(path, "sheet1", r, 4);
			String exp_mvalue=XLbook.getCellData(path, "sheet1", r, 5);

			
			//aplication code
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
		driver.findElement(By.id("tenure")).sendKeys(per1);
		Select perdrp=new Select (driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		perdrp.selectByVisibleText(per2);
		
	Select frdrp=new Select(	driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		frdrp.selectByVisibleText(per2);
		
		driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
		
	String act_val=	driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
	if (Double.parseDouble(exp_mvalue)==Double.parseDouble(act_val)	){
		System.out.println("Teastpassed");
		XLbook.SetData(path ,"sheet1", r, 7,  "passed");
		
		}
		else{
		System.out.println("fail");
		XLbook.SetData(path ,"sheet1", r, 7,  "passed");
		}
	Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='PL5']")).clear();
		}
	}
}
