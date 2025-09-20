package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;

import java.util.List;

public class C48WebTables01 extends BaseClass {

     /*
    <table> is an HTML tag used to define a web table.
    <th> is used to define table headers, while <tr> and <td> tags are used
    to define rows and columns respectively for web tables.

    table//tbody//tr ➡ Returns all rows within tbody.
    table//tbody//tr[1] ➡ Returns the first row in tbody.
    table//tbody//tr[1]//td ➡ Returns all table cells in the first row.
    table//tbody//tr[1]//td[4] ➡ Returns the 4th cell in the first row of tbody.
    table//tbody//tr[4]//td[5] ➡ Row 4, Column 5
    table//tbody//tr[10]//td[2] ➡ Column 2 in Row 10
    table//tbody//tr//td[5] ➡ Returns all rows in the 5th column.

    // Go to URL: http://demo.guru99.com/test/web-table-element.php
    // To find third row of table
    // To get 3rd row's 3rd column data
    // Get all the values of a Dynamic Table
    */

    @Test
    public void webTableTest() {
        // Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        // To find third row of table
        By thirdRow = By.xpath("//table//tr[3]");
        WebElement r3 = driver.findElement(thirdRow);
        System.out.println("thirdRow = " + r3.getText());

        // To get 3rd row's 3rd column data
        WebElement r3c3 = driver.findElement(By.xpath("//td[3]"));
        System.out.println("r3c3 = " + r3c3.getText());
//        By thirdRowThirdColumn = By.xpath("//table");

        // Get all the values of a Dynamic Table
        List<WebElement> rowslist = driver.findElements(By.xpath("//table//tbody//tr"));
        System.out.println("************* All Data ON THE TABLE *************");
        for (WebElement w : rowslist) {
            System.out.println(w.getText());
        }



        for (WebElement row: rowslist){

            List<WebElement> tdList = row.findElements(By.  xpath("//td"));
            int lineCounter = 1;
            System.out.println("line0" + lineCounter+"_");
            for (WebElement data: tdList){
                System.out.println(data.getText()+" || ");
            }
            System.out.println();
            lineCounter++;
        }
        String r2d3 = getDataFfromTable(2,3);
        System.out.println("r2d3 = " + r2d3);


        // Helper methods similar to the one below can be created in utils class

    }

    private String getDataFfromTable(int i, int i1) {
        return driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+i1+"]")).getText();
    }


}
