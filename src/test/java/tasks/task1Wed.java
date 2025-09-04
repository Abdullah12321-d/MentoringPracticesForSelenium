package tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class task1Wed {



//    Task 1: Browser History Exploration
//    Setup:
//    Use @BeforeEach to launch Chrome and maximize.
static WebDriver driver;
        @BeforeEach
            void BeforeEachtolaunch(){
            driver = new ChromeDriver();

            driver.manage().window().maximize();


        }

        @Test
             void Navigate() throws InterruptedException {
//            Test 1:
//    Navigate to https://www.wikipedia.org/.
                Thread.sleep(3000);
            driver.get("https://www.wikipedia.org/");
//    Navigate to https://www.google.com/.
                Thread.sleep(3000);
            driver.get("https://www.google.com/");
//    Navigate back and forward multiple times, asserting the correct title at each step.
                Thread.sleep(3000);
            driver.navigate().back();
                Thread.sleep(3000);
            String title = driver.getTitle();
                Thread.sleep(3000);
            Assertions.assertNotNull(title);
            Assertions.assertTrue(title.contains("Wikipedia"), "title does not contain Wikipedia!");
                Thread.sleep(3000);
            driver.navigate().forward();
                Thread.sleep(3000);
            String title1 = driver.getTitle();
                Thread.sleep(3000);
            Assertions.assertNotNull(title1);
            Assertions.assertTrue(title1.contains("Google"), "title does not contain Google!");
//            Test 2:
//    Use driver.navigate().refresh() on Google and assert the title still contains "Google".
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(3000);





        }

//    Use @AfterEach to close the browser.
        @AfterEach
            void close(){
            driver.close();


        }







}
