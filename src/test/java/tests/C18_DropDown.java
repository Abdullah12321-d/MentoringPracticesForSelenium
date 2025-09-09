package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C18_DropDown {


    @Test
    void dropDown() throws InterruptedException {


        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        WebElement dd = driver.findElement(By.name("dropdown"));
        Select select = new Select(dd);
        Thread.sleep(3000);
        select.selectByIndex(4);
        Thread.sleep(3000);
        select.selectByVisibleText("Drop Down Item 2");
        Thread.sleep(3000);
        select.selectByValue("dd3");
        List<WebElement> options = select.getOptions();
        options.forEach(element -> System.out.println(element.getText()));

        System.out.println(select.isMultiple());

        Select select1 = new Select(driver.findElement(By.name("multipleselect[]")));
        System.out.println(select1.isMultiple());
        Thread.sleep(3000);
        select1.selectByIndex(2);
        Thread.sleep(3000);
        select1.deselectAll();
        select1.getAllSelectedOptions();










    }













    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // TODO: Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // TODO: Navigate to LinkedIn
        driver.get("https://linkedin.com");
        driver.get("https://www.linkedin.com/login");
    }




    @AfterAll
    static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}


