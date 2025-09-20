package week3_Tasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.jupiter.api.Test;
import utilities.BaseClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3W3Wud extends BaseClass {

    /*
Go to https://claruswaysda.github.io/addRecordWebTable.html
Add 10 records using Faker.
Find the name of the youngest record.
*/


    @Test
    void webTableArrayTest() {

//        Go to https://claruswaysda.github.io/addRecordWebTable.html
       driver.get("https://claruswaysda.github.io/addRecordWebTable.html");

//        Add 10 records.
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.id("nameInput")).sendKeys(Faker.instance().name().fullName());
            driver.findElement(By.id("ageInput")).sendKeys(Faker.instance().number().numberBetween(15, 70) + "");
            new Select(driver.findElement(By.id("countrySelect"))).selectByIndex(Faker.instance().number().numberBetween(1, 5));
            driver.findElement(By.xpath("//button[@onclick='addRecord()']")).click();
        }

//        Find the name of the youngest record.
        List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
        String[] names = new String[row.size()];
        int[] ages = new int[row.size()];
        String[] countries = new String[row.size()];

        for (int i = 0; i < row.size(); i++) {
            names[i] = row.get(i).findElement(By.xpath(".//td[1]")).getText();
            ages[i] = Integer.parseInt(row.get(i).findElement(By.xpath(".//td[2]")).getText());
            countries[i] = row.get(i).findElement(By.xpath(".//td[3]")).getText();
        }


        List<Integer> ageList = Arrays.stream(ages).boxed().toList();
        int minAge = Collections.min(ageList);

        String yongestName = "";
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == minAge) {
                yongestName = names[i];
                break;
            }
        }
        System.out.println("Youngest is: " + yongestName + " (" + minAge + ")");

    }

}
