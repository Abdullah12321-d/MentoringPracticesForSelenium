package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;

import java.util.List;

public class C49WebTables02 extends BaseClass {
    /*
      Go to URL: https://the-internet.herokuapp.com/tables
      Print the entire table
      Print All Rows
      Print Last row data only
      Print column 5 data in the table body
      Write a method that accepts 2 parameters
      parameter 1 = row number
      parameter 2 = column number
  */
    @Test
    public void webTableTest() {
        //    Go to URL: https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");


        List<WebElement> rowsLIST = driver.findElements(By.xpath("//table[1]//tr"));
        int numofRows = rowsLIST.size();
        int numofColmns = driver.findElements(By.xpath("//table[1]//th")).size();

        //    Print the entire table


        for (int i =1; i<numofRows;i++){
            for (int j=1; j<=numofColmns;j++){
              String data =   driver.findElement(By.xpath("//table[1]//tr["+i+"]//td["+j+"]"+"\t")).getText();
                System.out.println(data+ " || ");
            }
            System.out.println(i  + "***********************************************************");
        }



        //    Print All Rows

        //    Print Last row data only

        //    Print column 5 data in the table body

        //    Write a method that accepts 2 parameters
        //    parameter 1 = row number
        //    parameter 2 = column number


    }
}
