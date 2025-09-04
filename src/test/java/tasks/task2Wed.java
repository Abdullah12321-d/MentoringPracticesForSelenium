package tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2Wed {

//    Task 2: Page Source Validation
//    Setup:
//    Use @BeforeEach to open Chrome and maximize.
static WebDriver driver;
    @BeforeEach
    void openBrowser() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();


    }


//    Test 1:
    @Test
    void task1() {
//    Navigate to https://www.selenium.dev/.
        driver.get("https://www.selenium.dev/");
//    Verify that the page source contains the word "WebDriver".
        String page = driver.getPageSource();
        Assertions.assertNotNull(page);
        Assertions.assertTrue(page.contains("WebDriver"), "The page did not contains WebDriver");
//        Assertions.assertEquals(page.contains("WebDriver"), page, "The page did  contains WebDriver");
    }
    @Test
            void task2() {
//    Test 2:
//    Navigate to https://www.python.org/.
        driver.get("https://www.python.org/");
//    Assert the page source contains "Python".
        String page2 = driver.getPageSource();
        Assertions.assertNotNull(page2);
        Assertions.assertTrue(page2.contains("WebDriver"), "The page did not contains WebDriver");
//        Assertions.assertEquals(page2.contains("WebDriver"), page2, "The page did  contains WebDriver");
    }

    @AfterEach
     void tearDown(){
//    Teardown:
//    Close the browser with @AfterEach.
        driver.close();
    }




}
