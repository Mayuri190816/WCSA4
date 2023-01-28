package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1;i<=6;i++)
		{
		
		FileInputStream fis=new FileInputStream("./data/TestData.xls");//provide the excel sheet file path
	    Workbook wb = WorkbookFactory.create(fis);//make the file for read
	    Sheet sheet = wb.getSheet("IPL");//take sheet name
	    Row row = sheet.getRow(i);//get value of row
	    Cell cell = row.getCell(1);//to get the value of cell
	    String data = cell.getStringCellValue();
	    System.out.println(data);
		
		}
	}
}
