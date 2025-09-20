package selfStudy;


import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class task2_C27_Actions {


    @Test
    void t03() {
        Workbook workbook;
        try {
            workbook = WorkbookFactory.create(new File("src/test/resources/StudentScores.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet1 = workbook.getSheet("Sheet1");
        Row row1 = sheet1.getRow(1);


        for (int i = 1; i <= row1.getLastCellNum(); i++) {

            Cell row1Cell1 = row1.getCell(i);
            Cell row1cell2 = row1.getCell(++i);
            Double row1cell2Double = row1cell2.getNumericCellValue();
            row1 = sheet1.getRow(1);


            System.out.println(row1cell2Double);
        }


    }
}
