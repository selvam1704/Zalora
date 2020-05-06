package com.stepdefintion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	public static String excelRead(int rowNum, int cellNum) throws IOException {
		FileInputStream in = new FileInputStream("D:\\greens\\Zalora\\Excel\\testdata1.xlsx");
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		DataFormatter f = new DataFormatter();
		String value = f.formatCellValue(c);
		return value;
	}

	
}
