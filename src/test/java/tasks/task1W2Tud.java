package tasks;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class task1W2Tud {

    /*
    Go to https://testpages.eviltester.com/styled/calculator
    Type any number in first and second input
    Click Calculate for each operation
    Get and verify results for all operations
     */

    @Test
            void Calc() throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/calculator");
       WebElement number1 = driver.findElement(By.id("number1"));
       number1.sendKeys("4");
        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("3");

//        List<WebElement> operation = driver.findElements(By.tagName("select"));
        Select select = new Select(driver.findElement(By.tagName("select")));


        selectByVisibleTextTest(select,"plus");
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(1000);
        Assertions.assertEquals("7",driver.findElement(By.id("answer")).getText(),"the result is true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());
        Thread.sleep(1000);


        selectByVisibleTextTest(select,"plus");
        Thread.sleep(1000);
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(1000);
        Assertions.assertEquals("15",driver.findElement(By.id("answer")).getText(),"the result is true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());
        Thread.sleep(1000);


        selectByVisibleTextTest(select,"plus");
        Thread.sleep(1000);
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(1000);
        Assertions.assertEquals("-2",driver.findElement(By.id("answer")).getText(),"the result is true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());
        Thread.sleep(1000);


        selectByVisibleTextTest(select,"plus");
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("0.6",driver.findElement(By.id("answer")).getText(),"the result is true");
        System.out.println("Answer = " + driver.findElement(By.id("answer")).getText());








    }

    private void selectByVisibleTextTest(Select select, String s) {
        select.selectByVisibleText(s);


    }












    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }

}
