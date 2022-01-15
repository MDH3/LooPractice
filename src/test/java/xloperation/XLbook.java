package xloperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLbook {
	public static FileInputStream fi;
	
	public static FileInputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
     public static XSSFRow row;
    public static XSSFCell cel;
     
    public static int getRowCount(String xlfile,String xlsheet) throws IOException {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    ws=	wb.getSheet(xlsheet);
    int rowcount=ws.getLastRowNum();
    wb.close();
    fi.close();
    	return rowcount;
    }
     
    public static int getCelCount(String xlfile,String xlsheet,int rownum) throws IOException {
    	
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	row=ws.getRow(rownum);
    	int cellcount=row.getLastCellNum();
    	wb.close();
    	fi.close();
		return cellcount;
    	
    }
     
     public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException{
    	 
    	 fi=new FileInputStream(xlfile);
    	 wb=new XSSFWorkbook(fi);
    ws= wb.getSheet(xlsheet);
    	 
    row =	ws.getRow(rownum) ;
   cel=row.getCell(colnum);
    String data;    	 
		try{
		DataFormatter formetor=new DataFormatter()	;
			data=formetor.formatCellValue(cel);
			
		}	
			
		catch(Exception e){
			data=" ";
			
		}
		wb.close();
    	 fi.close();
    	 return data;
     }
     public static void SetData(String xlfile,String xlsheet,int rownum, int colunum ,String data) throws IOException  {
    	 fi=new FileInputStream(xlfile);
    	 wb=new XSSFWorkbook(xlsheet);
    	ws= wb.getSheet(xlsheet);
    	row=ws.getRow(rownum);
    	cel=row.createCell(colunum);
    	
    	cel.setCellValue(data);
    	fo=new FileInputStream(xlfile);
    	wb.close();
    	fi.close();
    	fo.close();
    	
     }
     
     
     
}
