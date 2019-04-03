package javaPra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelTest {
	
	@Test
	public void TestExcel() throws IOException
	{
		File f=new File("C:\\Personal\\API\\MyPractice\\source\\Test.xlsx");
		FileInputStream fi=new FileInputStream(f.getAbsoluteFile());
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(0).getNumericCellValue());
		int x=(int) sh.getRow(0).getCell(0).getNumericCellValue();
		System.out.println(x);
		sh.getRow(0).createCell(2).setCellValue("2.41.1");
		sh.getRow(0).createCell(3).setCellValue(2411);
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		
	}

}
