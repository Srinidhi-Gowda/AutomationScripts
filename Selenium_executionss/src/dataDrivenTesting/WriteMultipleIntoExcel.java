package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WriteMultipleIntoExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("./excel/excel for DDT.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
		for(int i=0; i<link.size(); i++)
		{
			Row ro = sh.createRow(i);
			Cell cel = ro.createCell(1);
			cel.setCellValue(link.get(i).getAttribute("href"));
		}
		
		FileOutputStream fout = new FileOutputStream("./excel/excel for DDT.xlsx");
		book.write(fout);
		
		driver.close();
		
		
	}
}
