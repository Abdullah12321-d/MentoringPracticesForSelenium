package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_Locators {


    static WebDriver driver;

    @BeforeAll
    static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }


}