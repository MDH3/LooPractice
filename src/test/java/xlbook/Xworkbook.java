package xlbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xworkbook {

	public static void main(String[] args) throws IOException {
FileInputStream file=new FileInputStream("C:\\Users\\Md Mosharrof hossain\\Desktop\\EXLdata.xlsx");

XSSFWorkbook objwb=new XSSFWorkbook(file);
XSSFSheet sheet=objwb.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		
		XSSFRow row=sheet.getRow(0);
		
		int col=row.getLastCellNum();
		
		System.out.println(col);
	}

}
