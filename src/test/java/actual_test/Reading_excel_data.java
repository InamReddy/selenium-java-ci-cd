package actual_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Reading_excel_data {

@Test

public void readexceldata() throws Throwable{
	
FileInputStream	fis=new FileInputStream("./TestData.xlsx");
   Workbook wbf= WorkbookFactory.create(fis);
   
    Sheet  sh=wbf.getSheet("Sheet1");
    
    Row r=sh.getRow(1);
    
   Cell c=r.getCell(0);
   
   String  value=c.getStringCellValue();
   
   System.out.println(value);
    
     
}
	
	@Test
public void writeExceldata() throws Throwable {
		
		FileInputStream	fis=new FileInputStream("./TestData.xlsx");
		
		   Workbook wbf= WorkbookFactory.create(fis);
		   
		    Sheet  sh=wbf.getSheet("Sheet1");
		    
		    Row r=sh.getRow(3);
		    
		    Cell c=r.getCell(2);
		    
		  c.setCellValue("Santhosh");
		  
	FileOutputStream	fos=new  FileOutputStream("./TestData.xlsx");
		 
	wbf.write(fos);
	
	System.out.println("Done Writing");

}
}
