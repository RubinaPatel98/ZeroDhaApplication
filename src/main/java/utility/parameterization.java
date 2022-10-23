package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
        
	 public static String getExcelData(int row, int cell, String sheetname) throws EncryptedDocumentException, IOException
    {
		 FileInputStream File=new FileInputStream("C:\\Users\\RUBINA\\eclipse-workspace\\ZerodhaKite\\src\\main\\resources\\testdata.xlsx");
	     String value=WorkbookFactory.create(File).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	     return value;
    }
}
