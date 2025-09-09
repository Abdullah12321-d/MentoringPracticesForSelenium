package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C14_CheckBox {

    @Test
    void checkBoxTest() {
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkBox : checkBoxList) {
            if (!checkBox.isSelected()) {
                checkBox.click();
            }
            if (!checkBox.isSelected()) {
                Assertions.fail();
            }
        }
        Assertions.assertTrue(true);
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
        Thread.sleep(3000);
        driver.quit();
    }


}
