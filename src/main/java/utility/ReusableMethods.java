package utility;
   

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
public String propertyFetch(String key) throws IOException {
	FileInputStream fis=new FileInputStream("F:\\New folder\\Actitime1.PROPERTIES.txt");
	Properties pobj=new Properties();
	pobj.load(fis);
	String data=pobj.getProperty(key);
	return data; 
	
}
public int excelFetchRow(String sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Myntra1\\src\\main\\java\\datFetchinga\\oracle.xlsx");
	DataFormatter df=new DataFormatter();
	Workbook book=WorkbookFactory.create(fis);
int num=book.getSheet("Sheet1").getLastRowNum();
return num;
}
public int excelFetchCell(String sheet,int row) throws  IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Myntra1\\src\\main\\java\\datFetchinga\\oracle.xlsx");
	DataFormatter df=new DataFormatter();
	Workbook book=WorkbookFactory.create(fis);
int num=book.getSheet(sheet).getRow(row).getLastCellNum();
return num;
}
public String excelFetchData(String sheet,int row,int cell) throws  IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Myntra1\\src\\main\\java\\datFetchinga\\oracle.xlsx");
	DataFormatter df=new DataFormatter();
	Workbook book=WorkbookFactory.create(fis);
String data=df.formatCellValue(book.getSheet(sheet).getRow(row).getCell(cell));
return data;
}
}

