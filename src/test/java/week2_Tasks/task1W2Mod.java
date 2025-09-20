package week2_Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class task1W2Mod {


    /*
    Question: Go to "https://the-internet.herokuapp.com/checkboxes". Write a method that:
    Checks the current state of both checkboxes
    Ensures both checkboxes are selected (click only if not already selected)
    Verify both checkboxes are checked after the operations
    Print the status of each checkbox to console
     */


        @Test
        void task1(){


            //    Question: Go to "https://the-internet.herokuapp.com/checkboxes". Write a method that:
            driver.get("https://the-internet.herokuapp.com/checkboxes");
            //    Checks the current state of both checkboxes
           WebElement checkboxes1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
           WebElement checkboxes2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
            System.out.println("checkboxes1.isSelected() = " + checkboxes1.isSelected());
            System.out.println("checkboxes2.isSelected() = " + checkboxes2.isSelected());

            //    Ensures both checkboxes are selected (click only if not already selected)
            if (!checkboxes1.isSelected()){
                checkboxes1.click();
            }
            if (!checkboxes2.isSelected()){
                checkboxes2.click();
            }
            //    Verify both checkboxes are checked after the operations
            //    Print the status of each checkbox to console
            System.out.println("checkboxes1.isSelected() = " + checkboxes1.isSelected());
            System.out.println("checkboxes2.isSelected() = " + checkboxes2.isSelected());



        }






        WebDriver driver;
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }



}
