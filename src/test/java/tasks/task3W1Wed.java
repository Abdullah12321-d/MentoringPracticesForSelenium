package tasks;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3W1Wed {

//    Task 3: Browser Size and Position
//    Setup:
//    Open Chrome in @BeforeEach.
static WebDriver driver;
    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();


    }


//            Test 1:
    @Test
    void task1() throws InterruptedException {
        //    Navigate to https://www.bbc.com/.
        driver.get("https://www.bbc.com/");
        Thread.sleep(3000);
//    Set browser size to 800x600 and assert the window size.
        driver.manage().window().setSize(new Dimension(800, 600));
//            Test 2:
//    Move the window to position (100, 100) and assert its position.
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(100, 100));
    }
    @AfterAll
    static void teardown() throws InterruptedException {
//    Teardown:
//    Close the browser.
        Thread.sleep(3000);
        driver.close();


    }


}
