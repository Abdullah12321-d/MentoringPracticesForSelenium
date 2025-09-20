package week2_Tasks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task5W2Tud {

    /*
    Launch browser
    Open https://demoqa.com/select-menu
    Select Standard Multi-Select using element id
    Verify element is multi-select
    Select 'Opel' using index, then deselect using index
    Select 'Saab' using value, then deselect using value
    Deselect all options
    Close browser

     */
    @Test
    void task1() throws InterruptedException {

//        Open https://demoqa.com/select-menu
        driver.get("https://demoqa.com/select-menu");
//        Select Standard Multi-Select using element id
        driver.findElement(By.id("cars"));


//        Verify element is multi-select
        Select select1 = new Select(driver.findElement(By.id("cars")));
        Assertions.assertTrue(select1.isMultiple(),"the element is not multi-select");
        System.out.println("the element is multi-select");
        Thread.sleep(2000);
//        Select 'Opel' using index, then deselect using index
        select1.selectByIndex(2);
        Thread.sleep(2000);
        select1.deselectByIndex(2);
//        Select 'Saab' using value, then deselect using value
        select1.selectByValue("saab");
        Thread.sleep(2000);
        select1.deselectByValue("saab");

//        Deselect all options
        select1.deselectAll();
        Thread.sleep(2000);
//        Close browser



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
