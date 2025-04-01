package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    static String value;

    public static String readExcel(String filepath, String SheetName, int rowVal, int colVal) {

        try {
            String path = System.getProperty("user.dir") + filepath;
            FileInputStream fis = new FileInputStream(path);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet(SheetName);
            value = sheet.getRow(rowVal).getCell(colVal).getStringCellValue();

            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return value;
    }
}
