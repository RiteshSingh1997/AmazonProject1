package Project1_Amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_fetching_from_excel 
{ 
	public static String username1, password1,username2,pincode,Addressline1,Addressline2,TownCity;
	
	public void logincredentials() throws EncryptedDocumentException, IOException
	{
		
		 FileInputStream f1 = new FileInputStream("C:\\Users\\Ritesh.s\\eclipse-workspace\\Selenium\\Datadrivensheets\\FetchingSheets.xlsx");
			Workbook w1 = WorkbookFactory.create(f1);
			username1 = w1.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
			password1 = w1.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
			username2 = w1.getSheet("sheet1").getRow(1).getCell(6).getStringCellValue();
			pincode = NumberToTextConverter.toText(w1.getSheet("sheet1").getRow(1).getCell(2).getNumericCellValue());
			Addressline1 = w1.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
			Addressline2 = w1.getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
			TownCity = w1.getSheet("sheet1").getRow(1).getCell(5).getStringCellValue();
			
	}

}
