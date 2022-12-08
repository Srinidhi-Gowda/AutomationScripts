package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1- Specify a path
		FileInputStream fis = new FileInputStream("./excel/excel for DDT.xlsx");
		
		// step 2- open the excel
		Workbook book = WorkbookFactory.create(fis);// workbookfactory.create(input stream)
		
		// step 3- Specify sheet name
		Sheet sh = book.getSheet("Sheet1");
		
		//step 4- Specify the row
		Row ro = sh.getRow(0);// indexing in java starts from 0 so 1st row is 0
		
		//step 5- Specify the cell
		Cell cel = ro.getCell(0);
		
		//step 6 -Fetch the data
		String value = cel.getStringCellValue();
		System.out.println(value);
		
	}
}
