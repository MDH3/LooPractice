package screenshot;


import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrenSort {

	public static void main(String[] args) throws IOException {
WebDriverManager.chromiumdriver().setup();	
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.Amazon.com")	;
		/*
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		File fl =new File(System.getProperty("user.dir") + "\\Screensh\\homepage.png");
		FileUtils.copyFile(scr, fl);
		*/
		
		Set<Cookie>cookie=driver.manage().getCookies();
		System.out.println("this is total cockie "+ cookie.size());
		
		for(Cookie c : cookie){
			
			System.out.println(c.getName()+":"+ c.getValue());
			
			
			driver.quit();
			
		}
	}

}
