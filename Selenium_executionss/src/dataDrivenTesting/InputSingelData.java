package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InputSingelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step01- Specify the path
		FileInputStream fis = new FileInputStream("./excel/excel for DDT.xlsx");
		
		//Step02- Open excel
		Workbook book = WorkbookFactory.create(fis);
		
		//Step03- Specify sheet name
		Sheet sh = book.getSheet("Sheet1");
		
		//Step04- Create Row
		Row row = sh.createRow(1);
		
		//Step05- Create cell
		Cell cel = row.createCell(1);
		
		//Step06- write the data
		cel.setCellValue("Hey Srinidhi");
		FileOutputStream fout=new FileOutputStream("./excel/excel for DDT.xlxs");
		book.write(fout);
	}
}
