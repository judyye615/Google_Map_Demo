package dataProviderFactory;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
 
public class excelDataProvider {
 
   // If you are using .xls file, use HSSF
   // If you are using .xlsx file, use XSSF
 
   HSSFWorkbook wb;
 
   public excelDataProvider() throws FileNotFoundException, IOException {
 
       wb = new HSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir") + "/testdata/TestData.xls")));
 
       // Line 21 is basically like the following lines:
       /*
        * File xlFile = new File("/Users/judyye/Desktop/Book1.xlsx"); FileInputStream
        * xlFIS = new FileInputStream(xlFile); HSSFWorkbook xlbook = new
        * HSSFWorkbook(xlFIS);
        */
   }
 
   public String getCellData(String sheetName, int row, int col) {
 
       // Accessing cell through workbook and row
       HSSFCell cell = wb.getSheet(sheetName).getRow(row).getCell(col);
 
       // Line 34 is basically like the following lines:
       /*
        * XSSFSheet xlsheet = xlbook.getSheet("Sheet1"); XSSFRow xlrow =
        * xlsheet.getRow(0); XSSFCell xlcell = xlrow.getCell(0);
        */
 
       String data = null;
 
       // Compares the Cell value to see if it's a String
       if (cell.getCellTypeEnum() == CellType.STRING) {
           data = cell.getStringCellValue();
 
           // Compares the Cell value to see if it's a NUmber
       } else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
           data = String.valueOf((double) cell.getNumericCellValue());
 
           // Compares the Cell value to see if it' blank
       } else if (cell.getCellTypeEnum() == CellType.BLANK) {
           data = "";
       }
 
       // return the cell data
       return data;
   }
 
   public int getRows(String sheetName) {
       // Returns the total number of rows
       return wb.getSheet(sheetName).getPhysicalNumberOfRows();
 
   }
 
   public int getColumns(String sheetName) {
       // Returns the total number of columns in a row
       return wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
   }
}
