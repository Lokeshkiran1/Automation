package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream("./data/book1.xlsx");
		Workbook w=WorkbookFactory.create(fs);
		String s = w.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(s);
		

	}

}
