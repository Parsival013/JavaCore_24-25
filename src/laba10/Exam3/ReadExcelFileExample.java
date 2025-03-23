package laba10.Exam3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException{
        // Открываем файл Excel для чтения
        String filePath = "src/laba10/Exam3/example3.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // Создаем экземпляр книги из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        // Перебираем строки и ячейки листа
        for (Row row : sheet){
            for (Cell cell : row){
                // Выводим значение ячейки на экран
                System.out.println(cell.toString() + "\t");
            }
            System.out.println();
        }

        // Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }

}
