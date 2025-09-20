package week2_Tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class task4w2Tud {
    /*
    Launch browser
    Open https://demoqa.com/select-menu
    Select Old Style Select Menu using element id
    Print all dropdown options
    Select 'Purple' using index
    Select 'Magenta' using visible text
    Select an option using value
    Close browser
     */


    @Test
    void task1() throws InterruptedException {

//    Launch browser
//    Open https://demoqa.com/select-menu
        driver.get("https://demoqa.com/select-menu");
//    Select Old Style Select Menu using element id
        driver.findElement(By.id("oldSelectMenu"));
        Select select1 = new Select(driver.findElement(By.id("oldSelectMenu")));

//    Print all dropdown options
        List<WebElement> op = select1.getOptions();
        for (WebElement option : op) {
            System.out.println(option.getText());
        }

//    Select 'Purple' using index
       Thread.sleep(2000);
       select1.selectByIndex(4);
        System.out.println("select By Index: " + select1.getFirstSelectedOption().getText());
//    Select 'Magenta' using visible text
        Thread.sleep(2000);
        select1.selectByVisibleText("Magenta");
        System.out.println("select By Visible Text: " + select1.getFirstSelectedOption().getText());
//    Select an option using value
        Thread.sleep(2000);
        select1.selectByValue("3");
        System.out.println("select By Value: " + select1.getFirstSelectedOption().getText());

//    Close browser

    }


    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }




}
