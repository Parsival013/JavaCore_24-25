package laba10.ExcelParser;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelParser {
    private static final String EXCEL_FILE = "src/laba10/ExcelParser/products.xlsx";

    public static void main(String[] args) {
        writeExcel();
        readExcel();
    }

    private static void writeExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Products");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Название");
        header.createCell(1).setCellValue("Характеристики");
        header.createCell(2).setCellValue("Стоимость");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Книга");
        row1.createCell(1).setCellValue("Java Programming");
        row1.createCell(2).setCellValue(500);

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Компьютер");
        row2.createCell(1).setCellValue("Dell Inspiron");
        row2.createCell(2).setCellValue(25000);

        try (FileOutputStream fos = new FileOutputStream(EXCEL_FILE)) {
            workbook.write(fos);
            System.out.println("Excel файл создан: " + EXCEL_FILE);
        } catch (IOException e) {
            System.out.println("Ошибка записи Excel файла: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {

            }
        }
    }

    private static void readExcel() {
        try (FileInputStream fis = new FileInputStream(EXCEL_FILE);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet("Products");
            if (sheet == null) {
                System.out.println("Лист 'Products' не найден.");
                return;
            }
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения Excel файла: " + e.getMessage());
        }
    }
}
