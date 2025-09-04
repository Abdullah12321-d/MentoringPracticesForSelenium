package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C08_C08_ContactList {
    static WebDriver driver;

    @BeforeAll
    static void openBrowser() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    void goToLink() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
    }

    @Test
    void linkTest(){
       String url =  driver.getCurrentUrl();
       assertEquals("https://thinking-tester-contact-list.herokuapp.com/",url,"url did not match!");
    }

    @Test
    void titleTest() {
        String title = driver.getTitle();
        assertEquals("Contact List App",title,"Title did not match!");

    }
    @AfterEach
    void minimizeBrowser() {
        driver.manage().window().minimize();
    }




    @AfterAll
    static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}

/*
Task:
Open the Chrome driver in @BeforeAll method
Go to https://thinking-tester-contact-list.herokuapp.com/
in @BeforeEach method
Check the title in test01 method
Check the link in test02 method
Check the page source in test02 method
Close the browser in @AfterAll method
 */